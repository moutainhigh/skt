package net.meyki.data.okhttp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import net.meyki.skt.utils.BaseCode64;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.provider.DataJavaProvider;
import net.meyki.data.utils.FileIOUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpUtil {

    private final String TAG = getClass().getSimpleName();

    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_FAILED = 0;

    public enum RequestType{
        GET,
        POST,
        PUT,
        DELETE,
        DOWNLOAD
    }

    private static OkHttpClient mOkHttpClient;
    private static Handler mUIHandler;

    /**
     * API请求回调接口
     **/
    public interface IJsonResultListener {
        void onResultFailure(JavaCommonResponse response);
        void onResultSuccess(JavaCommonResponse response);
    }

    /**
     * 文件上传/下载回调接口
     * */
    public interface IProgressListener {
        void load(long done, long total, boolean finish);
    }

    public OkHttpUtil() {
        mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(30000, TimeUnit.MILLISECONDS)
                .writeTimeout(30000, TimeUnit.MILLISECONDS)
                .readTimeout(30000, TimeUnit.MILLISECONDS).build();
        mUIHandler = new Handler(Looper.getMainLooper());
    }

    /**
     * 内部类实现单例模式
     * 延迟加载，减少内存开销
     */
    private static class OkHttpUtilInstance{
        private static OkHttpUtil instance = new OkHttpUtil();
    }

    /**
     * 获取instance
     * @return instance
     **/
    public static OkHttpUtil getInstance() {
        return OkHttpUtilInstance.instance;
    }


    /**
     * 普通请求
     * */
    public void addRequest(final Context context, final JavaCommonRequest params, final IJsonResultListener iJsonResultListener){
        //request
        final Request request = getRequest(context, params);
        //call
        Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.i(TAG,"-----onFailure exception = ",e);
                Log.i(TAG, "-----onFailure exception = "+e.toString());
                final JavaCommonResponse result = new JavaCommonResponse();
                result.result = RESULT_FAILED;
                result.RequestSequenceId = params.RequestSequenceId;
                result.ErrMsg = "网络异常";
                result.ErrCode = "M-000004";
                mUIHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iJsonResultListener.onResultFailure(result);
                    }
                });
            }

            /**
             * json 格式{"status":"1","data":"lVGltZSI6IiIs","errCode":"","errMsg":""}
             **/
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //Returns true if the code is in (200..300), which means the request was successfully received
                if (response.isSuccessful()) {
                    String rootStr = response.body().string();
                    Log.i(TAG, "-----rootStr=" + rootStr);
                    // 接口调用成功
                    try {
                        //返回的数据不能解析ClassCastException
                        JSONObject rootObj = JSON.parseObject(rootStr);
                        if(RESULT_SUCCESS == rootObj.getIntValue("status")){
                            final JavaCommonResponse result;
                            if (rootObj.getString("data") != null) {
                                //data有值去解析
                                String data = new String(BaseCode64.decode(rootObj.getString("data")));
                                Log.i(TAG, "-----data=" + data);
                                //返回的数据出现解析错误JSONException
                                result = params.getOutputResponse(data);
                            } else {
                                //data无值不去解析
                                result = new JavaCommonResponse();
                            }
                            result.result = RESULT_SUCCESS;
                            result.RequestSequenceId = params.RequestSequenceId;
                            mUIHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    iJsonResultListener.onResultSuccess(result);
                                }
                            });
                        }else {
                            // 接口调用失败、异常
                            final JavaCommonResponse result = new JavaCommonResponse();
                            result.result = RESULT_FAILED;
                            result.RequestSequenceId = params.RequestSequenceId;
                            result.ErrMsg = JSON.parseObject(rootStr).getString("errMsg");
                            result.ErrCode = (JSON.parseObject(rootStr).getString("errCode"));
                            mUIHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    iJsonResultListener.onResultFailure(result);
                                }
                            });
                        }
                    } catch (ClassCastException e){
                        // 数据异常
                        final JavaCommonResponse result = new JavaCommonResponse();
                        result.result = RESULT_FAILED;
                        result.RequestSequenceId = params.RequestSequenceId;
                        result.ErrMsg = "数据异常";
                        result.ErrCode = "M-000003";
                        mUIHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                iJsonResultListener.onResultFailure(result);
                            }
                        });
                    } catch (JSONException e) {
                        // 数据异常
                        final JavaCommonResponse result = new JavaCommonResponse();
                        result.result = RESULT_FAILED;
                        result.RequestSequenceId = params.RequestSequenceId;
                        result.ErrMsg = "数据异常";
                        result.ErrCode = "M-000003";
                        mUIHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                iJsonResultListener.onResultFailure(result);
                            }
                        });
                    } catch (Exception e) {
                        // 数据异常
                        final JavaCommonResponse result = new JavaCommonResponse();
                        result.result = RESULT_FAILED;
                        result.RequestSequenceId = params.RequestSequenceId;
                        result.ErrMsg = "数据异常";
                        result.ErrCode = "M-000003";
                        mUIHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                iJsonResultListener.onResultFailure(result);
                            }
                        });
                    }
                } else {
                    //网络异常
                    final JavaCommonResponse result = new JavaCommonResponse();
                    result.result = RESULT_FAILED;
                    result.RequestSequenceId = params.RequestSequenceId;
                    result.ErrMsg = "网络异常";
                    result.ErrCode = "M-000004";
                    mUIHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            iJsonResultListener.onResultFailure(result);
                        }
                    });
                }
            }
        });
    }

    /**
     * 文件下载请求
     * @param context
     * @param params
     * @param progressListener 带进度的下载需要传入ProgressListener， 不带进度传入null
     * @param iJsonResultListener
     * */
    public void addRequest(Context context, final JavaCommonRequest params, final IProgressListener progressListener,
                           final IJsonResultListener iJsonResultListener) {
        //文件
        final File file = FileIOUtil.createFile(params.filePath, params.fileName);
        //request
        Request request = getRequest(context, params);
        //添加拦截器
        addProgressResponseListener(mOkHttpClient, progressListener).newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                final JavaCommonResponse result = new JavaCommonResponse();
                result.result = RESULT_FAILED;
                result.RequestSequenceId = params.RequestSequenceId;
                result.ErrMsg = "网络异常";
                result.ErrCode = "M-000004";
                mUIHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iJsonResultListener.onResultFailure(result);
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()) {
                    try{
                        int len;
                        byte[] buf = new byte[1024];
                        InputStream inputStream = response.body().byteStream();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        while ((len = inputStream.read(buf)) != -1) {
                            fileOutputStream.write(buf, 0, len);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();

                        final JavaCommonResponse result = new JavaCommonResponse();
                        result.result = RESULT_SUCCESS;
                        result.RequestSequenceId = params.RequestSequenceId;
                        mUIHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                iJsonResultListener.onResultSuccess(result);
                            }
                        });
                    }catch (IOException e){
                        // 数据异常
                        final JavaCommonResponse result = new JavaCommonResponse();
                        result.result = RESULT_FAILED;
                        result.RequestSequenceId = params.RequestSequenceId;
                        result.ErrMsg = "数据异常";
                        result.ErrCode = "M-000003";
                        mUIHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                iJsonResultListener.onResultFailure(result);
                            }
                        });
                    }
                }else {
                    final JavaCommonResponse result = new JavaCommonResponse();
                    result.result = RESULT_FAILED;
                    result.RequestSequenceId = params.RequestSequenceId;
                    result.ErrMsg = "网络异常";
                    result.ErrCode = "M-000004";
                    mUIHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            iJsonResultListener.onResultFailure(result);
                        }
                    });
                }
            }
        });
    }

    private OkHttpClient addProgressResponseListener(OkHttpClient client, final IProgressListener progressListener) {
        if(progressListener != null){
            Interceptor interceptor = new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    //拦截
                    Response originalResponse = chain.proceed(chain.request());
                    //包装响应体并返回
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            };
            return client.newBuilder()
                    .addInterceptor(interceptor)
                    .build();
        }else {
            return client.newBuilder().build();
        }
    }

    /**
     * 获取request
     * */
    private Request getRequest(Context context, JavaCommonRequest params){
        String url = null;
        if (params.requestType != RequestType.DOWNLOAD){
            //url
            url = DataJavaProvider.MEYKI_BASE_URL_JAVA
                    + params.getMethodName()
                    + "/"
                    + BaseCode64.encode(JSON.toJSONString(params.getInputMap()).getBytes());
            Log.i(TAG, "-----params="+ JSON.toJSONString(params.getInputMap()));
            Log.i(TAG, "-----url="+url);
        }

        //request
        Request request = null;
        if(params.requestType == RequestType.GET){
            request = new Request.Builder()
                    .url(url)
                    .tag(context)
                    .build();
        }else if(params.requestType == RequestType.POST){
            RequestBody requestBody = null;
            if (params.getInputMap() != null){
                if(params.file == null){
                    //普通参数
                    FormBody.Builder builder = new FormBody.Builder();
                    for (String key : params.getInputMap().keySet()) {
                        builder.add(key, params.getInputMap().get(key).toString());
                    }
                    requestBody = builder.build();
                }else {
                    //文件参数
                    RequestBody fileBody = RequestBody.create(MediaType.parse("image/*"), params.file);
                    requestBody = new MultipartBody.Builder()
                            .setType(MultipartBody.FORM)
                            .addFormDataPart("photo", params.file.getName(), fileBody)
                            .build();
                }
            }
            request = new Request.Builder()
                    .url(url)
                    .post(requestBody)
                    .tag(context)
                    .build();
        }else if(params.requestType == RequestType.PUT){
            //builder 参数
            FormBody.Builder builder = new FormBody.Builder();
            if (params.getInputMap() != null) {
                for (String key : params.getInputMap().keySet()) {
                    builder.add(key, params.getInputMap().get(key).toString());
                }
            }
            request = new Request.Builder()
                    .url(url)
                    .put(builder.build())
                    .tag(context)
                    .build();
        }else if(params.requestType == RequestType.DELETE){
            //builder 参数
            FormBody.Builder builder = new FormBody.Builder();
            if (params.getInputMap() != null) {
                for (String key : params.getInputMap().keySet()) {
                    builder.add(key, params.getInputMap().get(key).toString());
                }
            }
            request = new Request.Builder()
                    .url(url)
                    .delete(builder.build())
                    .tag(context)
                    .build();
        }else if(params.requestType == RequestType.DOWNLOAD){
            request = new Request.Builder()
                    .url(params.fileUrl)
                    .tag(context)
                    .build();
        }

        return request;
    }

    /**
     * 取消当前context的所有请求
     * @param context
     **/
    public void cancel(Context context) {
        if(mOkHttpClient != null) {
            Log.i(TAG, "-----okhttp queuedCalls size="+mOkHttpClient.dispatcher().queuedCalls().size());
            for(Call call : mOkHttpClient.dispatcher().queuedCalls()) {
                if(call.request().tag().equals(context)){
                    call.cancel();
                }
            }
            Log.i(TAG, "-----okhttp runningCalls size="+mOkHttpClient.dispatcher().runningCalls().size());
            for(Call call : mOkHttpClient.dispatcher().runningCalls()) {
                if(call.request().tag().equals(context)){
                    call.cancel();
                }
            }
            Log.i(TAG, "-----okhttp calls canceled, context="+context.toString());
        }
    }

}
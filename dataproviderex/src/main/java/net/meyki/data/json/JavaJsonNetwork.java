package net.meyki.data.json;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import net.meyki.skt.bean.PlaceList;
import net.meyki.skt.bean.PlaceLocation;
import net.meyki.skt.utils.AES;
import net.meyki.skt.utils.BaseCode64;
import net.meyki.skt.utils.JacksonUtil;
import net.meyki.skt.utils.Utils;
import net.meyki.data.client.domain.GetLbsPlaceList;
import net.meyki.data.client.request.SearchKeywordsExRequest;
import net.meyki.data.provider.DataJavaProvider;
import net.meyki.data.utils.LogUtils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.codehaus.jackson.type.TypeReference;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressLint("SimpleDateFormat")
public class JavaJsonNetwork extends
        AsyncTask<JavaCommonRequest, View, JavaCommonResponse> {

    /**
     * get方式的数据请求
     */
    public static final int TYPE_DEFAULT = 1;
    /**
     * get方式的LBS地址查询
     */
    public static final int TYPE_BAIDU_GET = 2;
    /**
     * post方式的上传图片
     */
    public static final int TYPE_UPLOAD_PHOTO = 3;
    /**
     * post方式的数据请求,文件和数据可以混合
     */
    public static final int TYPE_POST_DATA = 4;
    /**
     * put
     */
    public static final int TYPE_PUT_DATA = 5;
    /**
     * delete
     */
    public static final int TYPE_DELETE_DATA = 6;


    /**
     * customer get
     */
    public static final int TYPE_GET_CUSETOMER = 7;

    /**
     * customer post
     */
    public static final int TYPE_POST_CUSETOMER = 8;

    /**
     * DOWNLOAD
     * */
    public static final int TYPE_DOWNLOAD_DATA = 9;

    /**
     * JAVA BASE64
     */
    public static final int TYPE_ENCODE_BASE64 = 5;
    public static final int TYPE_ENCODE_DEFAULT = 6;
    /**
     * 调用接口响应结果，1：表示成功
     */
    public static final String SUCCESS = "1";
    /**
     * 调用接口响应结果，0 表示接口调用失败
     */
    public static final String ERROR = "0";
    // API執行成功
    public static final int RESULT_SUCCESS = 1;
    // API執行失败
    public static final int RESULT_FAILED = 2;
    public static final int RESULT_TOKEN = 3;

    public interface IJavaAsyworkCompleted {
        public boolean hasCancel(JavaCommonResponse result);
    }

    /**
     * json
     */
    public interface IJavaJsonResultListener {
        public void onNetworkRequest();

        public void onResultSuccess(JavaCommonResponse response);
    }

    private static final int DE_HttpNetTimeOut = 20000;
    private IJavaJsonResultListener mListener;
    private Context mct;
    private IJavaAsyworkCompleted mAsyListener;
    private String TAG = "JavaJsonNetwork";
    // 多平台登陆检测功能开关
    private boolean INFO_MODE = false;

    public JavaJsonNetwork(Context paramContext,
                           IJavaJsonResultListener paramListener) {
        // TODO Auto-generated constructor stub
        this.mct = paramContext;
        this.mListener = paramListener;
    }

    public String encrpt(String encode, String token) {
        if (TextUtils.isEmpty(encode)) {
            Log.i("tiger", "encrptCode is null");
            return "";
        }
        if (DataJavaProvider.AESMODE) {
            //AES加密时
            return AES.encrypt(encode, token);
        }
        return BaseCode64.encode(encode.getBytes());

    }

    private byte[] decrpt(String encodeddata) {
        if (TextUtils.isEmpty(encodeddata)) {
            Log.i("tiger", "decrpt is null");
            return null;
        }
        try {
            if (DataJavaProvider.AESMODE) {
                //AES解密时
                return AES.decrypt(encodeddata, DataJavaProvider.TOKEN).getBytes();
            }
            return BaseCode64.decode(encodeddata);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * get方式的数据请求
     *
     * @param paramRequest 请求参数列表
     * @return JavaCommonResponse 查询结果将json封装成arraylist方式返回
     * @throws IOException
     * @throws ClientProtocolException
     * @author tiger
     * @since 2015/01/29
     */
    public JavaCommonResponse JsonGetUrl(JavaCommonRequest paramRequest) {
        JavaCommonResponse result = new JavaCommonResponse();
        result.RequestSequenceId = paramRequest.RequestSequenceId;
        // 网络正常
        if (Utils.isNetworkOk(mct)) {
            HashMap<String, Object> mapper = getCommonInputMap(paramRequest);
            String url = "";
            Log.i(TAG, paramRequest.gson.toJson(getCommonInputMap(paramRequest)));
            Log.i(TAG, url);

            if (DataJavaProvider.AESMODE) {
                if (!mapper.containsKey("userId")) {
                    url = net.meyki.data.provider.DataJavaProvider.MEYKI_BASE_URL_JAVA
                            + paramRequest.getMethodName()
                            + "/"
                            + encrpt(paramRequest.gson.toJson(mapper), "3fkq2qAoJRU6LW71P0@0qVfecZQ8DfG2");
                    //非鉴权接口：包括不需要用户登录即可访问的接口，如用户注册、用户登录、忘记密码、检查手机号是否重复，易商首页不需要登录即可访问的接口。
                    url += "/?userId=0qVfecZQ8Df";
                    url += "&token=3fkq2qAoJRU6LW71P0@0qVfecZQ8DfG2";
                    System.out.println("-------!mapper.containsKey(\"userId\")--------" + url);
                } else {
                    url = net.meyki.data.provider.DataJavaProvider.MEYKI_BASE_URL_JAVA
                            + paramRequest.getMethodName()
                            + "/"
                            + encrpt(paramRequest.gson.toJson(mapper), DataJavaProvider.TOKEN);
                    //除过非鉴权接口外的接口
                    url += "/?userId=" + mapper.get("userId");
                    url += "&token=" + DataJavaProvider.TOKEN;
                    System.out.println("-------mapper.containsKey(\"userId\")--------" + url);
                }
            } else {
                url = net.meyki.data.provider.DataJavaProvider.MEYKI_BASE_URL_JAVA
                        + paramRequest.getMethodName()
                        + "/"
                        + encrpt(paramRequest.gson.toJson(mapper), DataJavaProvider.TOKEN);
            }
            Log.i(TAG, url);
            HttpGet request = new HttpGet(url);
            request.addHeader("Accept", "text/json;");
            HttpClient httpClient = getHttpClientSupportHttpsAndHttp();
            try {
                HttpResponse httpResponse = httpClient.execute(request);
                // 网络正常时http请求成功
                if (HttpStatus.SC_OK == httpResponse.getStatusLine().getStatusCode()) {
                    StringBuilder builder = new StringBuilder();
                    BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
                    for (String s = br.readLine(); s != null; s = br.readLine()) {
                        builder.append(s);
                    }
                    String response = builder.toString();
                    Log.i(TAG, response);

                    // 接口调用成功
                    if (JSON.parseObject(response) != null && SUCCESS.equals(JSON.parseObject(response).getString("status"))) {
                        JSONObject po = JSON.parseObject(response);
                        String encodedata = po.getString("data");
                        if (encodedata != null) {

                            String data = new String(decrpt(encodedata));
                            //Log.i(TAG, data);
                            LogUtils.showLogCompletion(TAG, data, 4000);
                            if (!TextUtils.isEmpty(po.getString("tokenExpired"))) {
                                result.result = RESULT_TOKEN;
                                result.token = po.getString("tokenExpired");
                                return result;
                            } else {
                                JavaCommonResponse tmp = paramRequest.getOutputResponse(data);
                                if (null != tmp) {
                                    result = tmp;
                                } else {
                                    result = new JavaCommonResponse();
                                }
                            }
                        }
                        result.result = RESULT_SUCCESS;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    } else {
                        // 接口调用失败
                        result.result = RESULT_FAILED;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    }
                } else {
                    result.result = RESULT_FAILED;
                    result.ErrMsg = "请求超时，请稍后再试！";
                    result.ErrCode = "M-000002";
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求超时
                result.result = RESULT_FAILED;
                result.ErrMsg = "请求超时，请稍后再试！";
                result.ErrCode = "M-000002";
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求正常，数据解析失败
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            } catch (Exception e) {
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            }
        } else {
            // 网络异常
            result.result = RESULT_FAILED;
            result.ErrMsg = "网络异常，请设置网络后再试！";
            result.ErrCode = "M-000004";
        }
        result.Response_id = paramRequest.getMethodName();
        result.RequestSequenceId = paramRequest.RequestSequenceId;
        return result;
    }


    /**
     * post方式上传图片
     *
     * @param paramRequest 请求参数列表
     * @return JavaCommonResponse 查询结果将json封装成arraylist方式返回
     * @author tiger
     * @since 2015/01/29
     */

    public JavaCommonResponse JsonPostPhot0(JavaCommonRequest paramRequest) {
        JavaCommonResponse result = new JavaCommonResponse();

        if (Utils.isNetworkOk(mct)) {
            String url = net.meyki.data.provider.DataJavaProvider.MEYKI_BASE_URL_JAVA
                    + paramRequest.getMethodName()
                    + "/"
                    + encrpt(paramRequest.gson.toJson(getCommonInputMap(paramRequest)), "");
            Log.i(TAG, paramRequest.gson.toJson(getCommonInputMap(paramRequest)));
            Log.i(TAG, url);

            HttpPost request = new HttpPost(url);
            HttpClient httpClient = getHttpClientSupportHttpsAndHttp();
            try {

                MultipartEntity entity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);

                // 在这里需要将btimap对象装换成file对象
                String filePath = Environment.getExternalStorageDirectory().getAbsolutePath()
                        + "/Android/data/cache/";
                File file = new File(filePath);
                // 判断文件夹是否存在，要是不存在的话则创建
                if (!file.exists()) {
                    file.mkdir();
                }
                File fileImage = new File(filePath + getPhotoFileName());
                if(!fileImage.exists()){
                    fileImage.createNewFile();
                }
                FileOutputStream outputStream = new FileOutputStream(fileImage);
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileImage));
                if (paramRequest.bitmap != null) {
                    long size = paramRequest.bitmap.getHeight() * paramRequest.bitmap.getWidth();
                    if (size <= 480000) {
                        paramRequest.bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bos);
                        Log.i(TAG, "case 800*600");
                    } else if (size <= 1024 * 768) {
                        paramRequest.bitmap.compress(Bitmap.CompressFormat.JPEG, 60, bos);
                        Log.i(TAG, "case 1024*768");
                    } else if (size <= 3120 * 4160) {
                        paramRequest.bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bos);
                        Log.i(TAG, "case 3120*4160");
                    } else {
                        paramRequest.bitmap.compress(Bitmap.CompressFormat.JPEG, 30, bos);
                        Log.i(TAG, "case defau;t");
                    }
                    Log.i(TAG, "file Height=" + paramRequest.bitmap.getHeight() + "width=" + paramRequest.bitmap.getWidth());
                    //paramRequest.bitmap.compress(Bitmap.CompressFormat.JPEG, 50, bos);
                }
                bos.flush();
                bos.close();
                Log.i(TAG, "file size=" + (fileImage.length() / 1024) + " KB");
                // 传入file对象
                entity.addPart("photo", new FileBody(fileImage));
                request.setEntity(entity);

                HttpResponse httpResponse = httpClient.execute(request);
                // 网络正常时http请求成功
                if (HttpStatus.SC_OK == httpResponse.getStatusLine().getStatusCode()) {
                    StringBuilder builder = new StringBuilder();
                    BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
                    for (String s = br.readLine(); s != null; s = br.readLine()) {
                        builder.append(s);
                    }
                    String response = builder.toString();
                    Log.i(TAG, response);

                    // 接口调用成功
                    if (JSON.parseObject(response) != null && SUCCESS.equals(JSON.parseObject(response).getString("status"))) {
                        if (JSON.parseObject(response).getString("data") != null) {
                            String data = new String(decrpt(JSON.parseObject(response).getString("data")));
                            Log.i(TAG, data);
                            JavaCommonResponse tmp = paramRequest.getOutputResponse(data);
                            if (null != tmp) {
                                result = tmp;
                            } else {
                                result = new JavaCommonResponse();
                            }
                        } else {
                            result = new JavaCommonResponse();
                        }
                        result.result = RESULT_SUCCESS;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    } else {
                        // 接口调用失败
                        result = new JavaCommonResponse();
                        result.result = RESULT_FAILED;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    }
                } else {
                    result.result = RESULT_FAILED;
                    result.ErrMsg = "请求超时，请稍后再试！";
                    result.ErrCode = "M-000002";
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求超时
                result.result = RESULT_FAILED;
                result.ErrMsg = "请求超时，请稍后再试！";
                result.ErrCode = "M-000002";
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求正常，数据解析失败
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            } catch (Exception e) {
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            }
        } else {
            // 网络异常
            result.result = RESULT_FAILED;
            result.ErrMsg = "网络异常，请设置网络后再试！";
            result.ErrCode = "M-000004";
        }
        result.Response_id = paramRequest.getMethodName();
        result.RequestSequenceId = paramRequest.RequestSequenceId;
        return result;
    }

    /**
     * post方式提交表单数据
     *
     * @param paramRequest 请求参数列表
     * @return JavaCommonResponse 查询结果将json封装成arraylist方式返回
     * @author tiger
     * @since 2015/01/29
     */

    public JavaCommonResponse MapPostUrl(JavaCommonRequest paramRequest) {
        JavaCommonResponse result = new JavaCommonResponse();

        // 网络正常
        if (Utils.isNetworkOk(mct)) {
            String url = net.meyki.data.provider.DataJavaProvider.MEYKI_BASE_URL_JAVA
                    + paramRequest.getMethodName()
                    + "/"
                    + encrpt(paramRequest.gson.toJson(getCommonInputMap(paramRequest)), "");
            Log.i(TAG, paramRequest.gson.toJson(getCommonInputMap(paramRequest)));
            Log.i(TAG, url);

            HttpPost request = new HttpPost(url);
            HttpClient httpClient = getHttpClientSupportHttpsAndHttp();

            try {
                request.setEntity(map2Namepair(getCommonInputMap(paramRequest)));
                HttpResponse httpResponse = httpClient.execute(request);

                if (HttpStatus.SC_OK == httpResponse.getStatusLine().getStatusCode()) {
                    StringBuilder builder = new StringBuilder();
                    BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
                    for (String s = br.readLine(); s != null; s = br.readLine()) {
                        builder.append(s);
                    }
                    String response = builder.toString();
                    Log.i(TAG, response);

                    // 接口调用成功
                    if (JSON.parseObject(response) != null && SUCCESS.equals(JSON.parseObject(response).getString("status"))) {
                        if (JSON.parseObject(response).getString("data") != null) {
                            String data = new String(decrpt(JSON.parseObject(response).getString("data")));
                            Log.i(TAG, data);
                            JavaCommonResponse tmp = paramRequest.getOutputResponse(data);
                            if (null != tmp) {
                                result = tmp;
                            } else {
                                result = new JavaCommonResponse();
                            }
                        }
                        result.result = RESULT_SUCCESS;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    } else {
                        // 接口调用失败
                        result.result = RESULT_FAILED;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    }
                } else {
                    result.result = RESULT_FAILED;
                    result.ErrMsg = "请求超时，请稍后再试！";
                    result.ErrCode = "M-000002";
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求超时
                result.result = RESULT_FAILED;
                result.ErrMsg = "请求超时，请稍后再试！";
                result.ErrCode = "M-000002";
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求正常，数据解析失败
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            } catch (Exception e) {
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            }
        } else {
            // 网络异常
            result.result = RESULT_FAILED;
            result.ErrMsg = "网络异常，请设置网络后再试！";
            result.ErrCode = "M-000004";
        }
        result.Response_id = paramRequest.getMethodName();
        result.RequestSequenceId = paramRequest.RequestSequenceId;
        return result;
    }

    public JavaCommonResponse JsonPutUrl(JavaCommonRequest paramRequest) {
        JavaCommonResponse result = new JavaCommonResponse();

        // 网络正常
        if (Utils.isNetworkOk(mct)) {
            String url = net.meyki.data.provider.DataJavaProvider.MEYKI_BASE_URL_JAVA
                    + paramRequest.getMethodName()
                    + "/"
                    + encrpt(paramRequest.gson.toJson(getCommonInputMap(paramRequest)), "");
            Log.i(TAG, paramRequest.gson.toJson(getCommonInputMap(paramRequest)));
            Log.i(TAG, url);

            HttpPost request = new HttpPost(url);
            HttpClient httpClient = getHttpClientSupportHttpsAndHttp();

            try {
                request.setEntity(map2Namepairput(getCommonInputMap(paramRequest)));
                HttpResponse httpResponse = httpClient.execute(request);

                if (HttpStatus.SC_OK == httpResponse.getStatusLine().getStatusCode()) {
                    StringBuilder builder = new StringBuilder();
                    BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
                    for (String s = br.readLine(); s != null; s = br.readLine()) {
                        builder.append(s);
                    }
                    String response = builder.toString();
                    Log.i(TAG, response);

                    // 接口调用成功
                    if (JSON.parseObject(response) != null && SUCCESS.equals(JSON.parseObject(response).getString("status"))) {
                        if (JSON.parseObject(response).getString("data") != null) {
                            String data = new String(decrpt(JSON.parseObject(response).getString("data")));
                            Log.i(TAG, data);
                            JavaCommonResponse tmp = paramRequest.getOutputResponse(data);
                            if (null != tmp) {
                                result = tmp;
                            } else {
                                result = new JavaCommonResponse();
                            }
                        }
                        result.result = RESULT_SUCCESS;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    } else {
                        // 接口调用失败
                        result.result = RESULT_FAILED;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    }
                }else {
                    result.result = RESULT_FAILED;
                    result.ErrMsg = "请求超时，请稍后再试！";
                    result.ErrCode = "M-000002";
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求超时
                result.result = RESULT_FAILED;
                result.ErrMsg = "请求超时，请稍后再试！";
                result.ErrCode = "M-000002";
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求正常，数据解析失败
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            } catch (Exception e) {
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            }
        } else {
            // 网络异常
            result.result = RESULT_FAILED;
            result.ErrMsg = "网络异常，请设置网络后再试！";
            result.ErrCode = "M-000004";
        }
        result.Response_id = paramRequest.getMethodName();
        result.RequestSequenceId = paramRequest.RequestSequenceId;
        return result;
    }

    public JavaCommonResponse JsonDeleteUrl(JavaCommonRequest paramRequest) {
        JavaCommonResponse result = new JavaCommonResponse();

        // 网络正常
        if (Utils.isNetworkOk(mct)) {
            String url = net.meyki.data.provider.DataJavaProvider.MEYKI_BASE_URL_JAVA
                    + paramRequest.getMethodName()
                    + "/"
                    + encrpt(paramRequest.gson.toJson(getCommonInputMap(paramRequest)), "");
            Log.i(TAG, paramRequest.gson.toJson(getCommonInputMap(paramRequest)));
            Log.i(TAG, url);

            HttpPost request = new HttpPost(url);
            HttpClient httpClient = getHttpClientSupportHttpsAndHttp();

            try {
                request.setEntity(map2Namepairdelete(getCommonInputMap(paramRequest)));
                HttpResponse httpResponse = httpClient.execute(request);

                if (HttpStatus.SC_OK == httpResponse.getStatusLine().getStatusCode()) {
                    StringBuilder builder = new StringBuilder();
                    BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
                    for (String s = br.readLine(); s != null; s = br.readLine()) {
                        builder.append(s);
                    }
                    String response = builder.toString();
                    Log.i(TAG, response);

                    // 接口调用成功
                    if (JSON.parseObject(response) != null && SUCCESS.equals(JSON.parseObject(response).getString("status"))) {
                        if (JSON.parseObject(response).getString("data") != null) {
                            String data = new String(decrpt(JSON.parseObject(response).getString("data")));
                            Log.i(TAG, data);
                            JavaCommonResponse tmp = paramRequest.getOutputResponse(data);
                            if (null != tmp) {
                                result = tmp;
                            } else {
                                result = new JavaCommonResponse();
                            }
                        }
                        result.result = RESULT_SUCCESS;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    } else {
                        // 接口调用失败
                        result.result = RESULT_FAILED;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    }
                }else {
                    result.result = RESULT_FAILED;
                    result.ErrMsg = "请求超时，请稍后再试！";
                    result.ErrCode = "M-000002";
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求超时
                result.result = RESULT_FAILED;
                result.ErrMsg = "请求超时，请稍后再试！";
                result.ErrCode = "M-000002";
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求正常，数据解析失败
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            } catch (Exception e) {
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            }
        } else {
            // 网络异常
            result.result = RESULT_FAILED;
            result.ErrMsg = "网络异常，请设置网络后再试！";
            result.ErrCode = "M-000004";
        }
        result.Response_id = paramRequest.getMethodName();
        result.RequestSequenceId = paramRequest.RequestSequenceId;
        return result;
    }

    private String getPhotoFileName() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "'IMG'_yyyyMMdd_HHmmss");
        return dateFormat.format(date) + ".png";
    }

    public HashMap<String, Object> getCommonInputMap(JavaCommonRequest paramRequest) {
        if (null != paramRequest) {
            HashMap<String, Object> mappers = paramRequest.getInputMap();
            if (null != mappers) {
                mappers.put("tag", net.meyki.data.provider.DataJavaProvider.mTag);
                mappers.put("os", net.meyki.data.provider.DataJavaProvider.mOs);
                mappers.put("vcode", net.meyki.data.provider.DataJavaProvider.mVcode);
                return mappers;
            }

        }
        return new HashMap<String, Object>();
    }

    @Override
    protected JavaCommonResponse doInBackground(JavaCommonRequest... arg0) {
        // TODO Auto-generated method stub
        JavaCommonRequest cr = arg0[0];
        if (null == cr) {
            return null;
        }

        if (cr.request_method == TYPE_DEFAULT) {
            return JsonGetUrl(cr);
        } else if (cr.request_method == TYPE_BAIDU_GET) {// baidu地图检索
            if (cr instanceof SearchKeywordsExRequest) {
                JavaCommonResponse crout = getLbsPlaceList(((SearchKeywordsExRequest) cr).query);
                if (null != crout) {
                    crout.result = RESULT_SUCCESS;
                } else {
                    crout = new JavaCommonResponse();
                    crout.result = RESULT_FAILED;
                }
                crout.RequestSequenceId = cr.RequestSequenceId;
                crout.Response_id = cr.getMethodName();
                return crout;
            }
        } else if (cr.request_method == TYPE_UPLOAD_PHOTO) {
            // 传图片
            return JsonPostPhot0(cr);
        } else if (cr.request_method == TYPE_POST_DATA) {
            // post方式处理数据
            return MapPostUrl(cr);
        } else if (cr.request_method == TYPE_PUT_DATA) {
            return JsonPutUrl(cr);
        } else if (cr.request_method == TYPE_DELETE_DATA) {
            return JsonDeleteUrl(cr);
        }else if (cr.request_method == TYPE_GET_CUSETOMER) {
            return customerGetUrl(cr);
        } else if (cr.request_method == TYPE_POST_CUSETOMER) {
            return customerPostUrl(cr);
        }

        return null;
    }

    /**
     * 百度LBS地址查询api
     *
     * @param query 查询关键字
     * @return JavaCommonResponse 查询结果将json封装成arraylist方式返回
     * @author tiger
     * @since 2015/01/29
     */
    public JavaCommonResponse getLbsPlaceList(String query) {
        URI url;
        String base = "http://api.map.baidu.com/place/v2/search?query=";
        String rear = "&region=%E5%85%A8%E5%9B%BD&output=json&ak=U34Ca4eTXYpB7P3PgGPm3oh8";

        try {
            url = new URI(base + query + rear);
            HttpGet request = new HttpGet(url);
            HttpClient httpClient = getHttpClientSupportHttpsAndHttp();
            //HttpClient httpClient = new DefaultHttpClient();
            //HttpParams param = httpClient.getParams();
            //HttpConnectionParams.setConnectionTimeout(param, DE_HttpNetTimeOut);
            //HttpConnectionParams.setSoTimeout(param, DE_HttpNetTimeOut);
            try {
                // Log.i("post", httpPost.toString());
                HttpResponse httpResponse = httpClient.execute(request);
                int ret = httpResponse.getStatusLine().getStatusCode();

                if (HttpStatus.SC_OK == ret) {
                    StringBuilder builder = new StringBuilder();
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(httpResponse.getEntity()
                                    .getContent(), "UTF-8"));
                    for (String s = br.readLine(); s != null; s = br.readLine()) {
                        builder.append(s);
                    }
                    Log.i("Jason", "output=" + builder.toString());

//					GetLbsPlaceList liulianBrandMessageList = (GetLbsPlaceList) JSONHelper
//							.toObj(builder.toString(), GetLbsPlaceList.class);
                    GetLbsPlaceList liulianBrandMessageList = JacksonUtil.readValue(builder.toString(), new TypeReference<GetLbsPlaceList>() {
                    });
                    if (null == liulianBrandMessageList) {
                        com.alibaba.fastjson.JSONObject jio = JSON
                                .parseObject(builder.toString());
                        if (null != jio) {
                            if (jio.getIntValue("status") == 0) {
                                liulianBrandMessageList = new GetLbsPlaceList();
                                liulianBrandMessageList.setStatus(0);
                                List<PlaceList> placelist = new ArrayList<PlaceList>();
                                // 检索成功
                                com.alibaba.fastjson.JSONArray arry = jio
                                        .getJSONArray("results");
                                for (Object object : arry) {
                                    if (object != null) {
                                        com.alibaba.fastjson.JSONObject ob = (JSONObject) object;
                                        PlaceList item = new PlaceList();
                                        item.setAddress(ob.getString("address"));
                                        item.setName(ob.getString("name"));
                                        /*item.setProvince(ob.getString("province"));
                                        item.setCity(ob.getString("city"));
										item.setCounty(ob.getString("district"));*/
                                        JSONObject loc = ob
                                                .getJSONObject("location");
                                        if (null != loc) {
                                            PlaceLocation location = new PlaceLocation();
                                            location.setLat(loc
                                                    .getDoubleValue("lat"));
                                            location.setLng(loc
                                                    .getDoubleValue("lng"));
                                            /*location.setProvince(loc.getString("province"));
                                            location.setCity(loc.getString("city"));
											location.setCounty(loc.getString("district"));*/
                                            item.setLocation(location);
                                        }
                                        placelist.add(item);
                                    }
                                    liulianBrandMessageList
                                            .setResults(placelist);
                                    JavaCommonResponse cr = new JavaCommonResponse();
                                    cr.setObj(liulianBrandMessageList
                                            .getResults());
                                    return cr;
                                }
                            }
                        }
                    } else {
                        JavaCommonResponse cr = new JavaCommonResponse();
                        cr.setObj(liulianBrandMessageList.getResults());
                        return cr;
                    }
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (URISyntaxException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onCancelled() {
        // TODO Auto-generated method stub
        super.onCancelled();
    }

    @Override
    protected void onPostExecute(JavaCommonResponse result) {
        // TODO Auto-generated method stub
        boolean isCancel = false;
        if (mAsyListener != null) {
            isCancel = mAsyListener.hasCancel(result);
        }
        if (isCancel == false && null != mListener && null != result) {
            if (result.result == RESULT_TOKEN) {
                Intent it = new Intent(mct, DataJavaProvider.mLoginClass);
                it.putExtra("autoclose", true);
                mct.startActivity(it);
                Toast.makeText(mct, "为了您的账户安全，请您再重新登录一次", Toast.LENGTH_SHORT).show();
            } else {
                mListener.onResultSuccess(result);
            }
        }
        super.onPostExecute(result);
    }

    @Override
    protected void onPreExecute() {
        // TODO Auto-generated method stub
        super.onPreExecute();
    }

    public void addDoworkCompletedNotify(IJavaAsyworkCompleted listener) {
        // TODO Auto-generated method stub
        this.mAsyListener = listener;
    }

    /**
     * 从map转换成post用的对象,以formdata方式提交
     *
     * @param params <String,String>的键值对
     * @param files  <String,File>的键值对
     * @return HttpEntity post发送用对象
     * @author tiger
     * @since 2015/01/29
     */
    public static HttpEntity makeMultipartEntity(List<NameValuePair> params,
                                                 final Map<String, File> files) {
        MultipartEntity entity = new MultipartEntity(
                HttpMultipartMode.BROWSER_COMPATIBLE);
        // builder.setCharset(Charset.forName("UTF-8")); //不要用这个，会导致服务端接收不到参数
        if (params != null && params.size() > 0) {
            for (NameValuePair p : params) {
                try {
                    entity.addPart(p.getName(), new StringBody(p.getValue()));
                } catch (UnsupportedEncodingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        if (files != null && files.size() > 0) {
            Set<Entry<String, File>> entries = files.entrySet();
            for (Entry<String, File> entry : entries) {
                entity.addPart(entry.getKey(), new FileBody(entry.getValue()));
            }
        }
        return entity;
    }

    /**
     * 从map转换成post用的名字对,以formdata方式提交
     *
     * @param params 可以是<String,String>或者<String,File>的键值对
     * @return HttpEntity post发送用对象
     * @author tiger
     * @since 2015/01/29
     */
    public static HttpEntity map2Namepair(HashMap<String, Object> params) {
        // TODO Auto-generated method stub
        if (null == params) {
            return new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
        } else {
            MultipartEntity entity = new MultipartEntity(
                    HttpMultipartMode.BROWSER_COMPATIBLE);
            if (params != null && params.size() > 0) {
                Set<Entry<String, Object>> entries = params.entrySet();
                for (Entry<String, Object> entry : entries) {
                    if (entry.getValue() instanceof File) {
                        // 文件key-file
                        entity.addPart(entry.getKey(), new FileBody(
                                (File) entry.getValue()));
                    } else if (entry.getValue() instanceof String) {
                        // 字符串key-value
                        try {
                            entity.addPart(entry.getKey(), new StringBody(
                                    (String) entry.getValue(),Charset.defaultCharset()));
                        } catch (UnsupportedEncodingException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
                return entity;
            }
            return entity;
        }
    }

    public static HttpEntity map2Namepairput(HashMap<String, Object> params) {
        // TODO Auto-generated method stub
        if (null == params) {
            return new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
        } else {
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Set<String> set = params.keySet();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String key = it.next();
                list.add(new BasicNameValuePair(key, (String) params.get(key)));
            }
            list.add(new BasicNameValuePair("_method", "PUT"));
            //url格式编码
            UrlEncodedFormEntity uefEntity = null;
            try {
                uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //post.setEntity(uefEntity);
            return uefEntity;
        }
    }

    public static HttpEntity map2Namepairdelete(HashMap<String, Object> params) {
        // TODO Auto-generated method stub
        if (null == params) {
            return new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
        } else {
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Set<String> set = params.keySet();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String key = it.next();
                if (params.get(key) instanceof String) {
                    list.add(new BasicNameValuePair(key, (String) params.get(key)));
                } else {
                    Object param = params.get(key);
                    JacksonUtil.toJSon(param);
                    list.add(new BasicNameValuePair(key, JacksonUtil.toJSon(param)));
                }
            }
            list.add(new BasicNameValuePair("_method", "DELETE"));
            //url格式编码
            UrlEncodedFormEntity uefEntity = null;
            try {
                uefEntity = new UrlEncodedFormEntity(list, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //post.setEntity(uefEntity);
            return uefEntity;
        }
    }

    public HttpClient getHttpClientSupportHttpsAndHttp() {
        try {
            HttpParams param = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(param, DE_HttpNetTimeOut);
            HttpConnectionParams.setSoTimeout(param, DE_HttpNetTimeOut);

            HttpProtocolParams.setVersion(param, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(param, HTTP.UTF_8);

            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            trustStore.load(null, null);

            SSLSocketFactory sf = new MySSLSocketFactory(trustStore);
            //允许所有主机的验证
            sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

            //设置http和https支持
            SchemeRegistry registry = new SchemeRegistry();
            registry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            registry.register(new Scheme("https", sf, 443));

            //获取httpclient
            ClientConnectionManager manager = new ThreadSafeClientConnManager(param, registry);
            return new DefaultHttpClient(manager, param);
        } catch (Exception e) {
            e.printStackTrace();
            return new DefaultHttpClient();
        }
    }

    /**
     * get方式的数据请求
     * @param paramRequest 请求参数列表
     * @return JavaCommonResponse 查询结果将json封装成arraylist方式返回
     * @throws IOException
     * @throws ClientProtocolException
     * @author tiger
     * @since 2015/01/29
     */

    public JavaCommonResponse customerGetUrl(JavaCommonRequest paramRequest) {
        JavaCommonResponse result = new JavaCommonResponse();
        // 网络正常
        if (Utils.isNetworkOk(mct)) {
            String url = DataJavaProvider.CUSTOMER_BASE_URL_JAVA
                    + paramRequest.getMethodName()
                    + "/"
                    + paramRequest.gson.toJson(getCommonInputMap(paramRequest));
            Log.i(TAG, paramRequest.gson.toJson(getCommonInputMap(paramRequest)));
            Log.i(TAG, url);

            HttpGet request = new HttpGet(url);
            //request.addHeader("Accept", "text/json;");
            HttpClient httpClient = getHttpClientSupportHttpsAndHttp();
            try {
                HttpResponse httpResponse = httpClient.execute(request);

                // 网络正常时http请求成功
                if (HttpStatus.SC_OK == httpResponse.getStatusLine().getStatusCode()) {
                    StringBuilder builder = new StringBuilder();
                    BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent()));
                    for (String s = br.readLine(); s != null; s = br.readLine()) {
                        builder.append(s);
                    }
                    String response = builder.toString();
                    Log.i(TAG, response);

                    // 接口调用成功
                    if (JSON.parseObject(response) != null && SUCCESS.equals(JSON.parseObject(response).getString("status"))) {
                        if (JSON.parseObject(response).getString("data") != null) {
                            String data = new String(BaseCode64.decode(JSON.parseObject(response).getString("data")));
                            Log.i(TAG, data);
                            result = paramRequest.getOutputResponse(data);
                        } else {
                            result = new JavaCommonResponse();
                        }
                        result.result = RESULT_SUCCESS;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    } else {
                        // 接口调用抛出异常
                        result = new JavaCommonResponse();
                        result.result = RESULT_FAILED;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    }
                } else {
                    result.result = RESULT_FAILED;
                    result.ErrMsg = "请求超时，请稍后再试！";
                    result.ErrCode = "M-000002";
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求超时
                result.result = RESULT_FAILED;
                result.ErrMsg = "请求超时，请稍后再试！";
                result.ErrCode = "M-000002";
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求正常，数据解析失败
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            } catch (Exception e) {
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            }
        } else {
            // 网络异常
            result.result = RESULT_FAILED;
            result.ErrMsg = "网络异常，请设置网络后再试！";
            result.ErrCode = "M-000004";
        }
        result.Response_id = paramRequest.getMethodName();
        result.RequestSequenceId = paramRequest.RequestSequenceId;
        return result;
    }

    /**
     * post方式提交表单数据
     *
     * @param paramRequest 请求参数列表
     * @return JavaCommonResponse 查询结果将json封装成arraylist方式返回
     * @author tiger
     * @since 2015/01/29
     */
    public JavaCommonResponse customerPostUrl(JavaCommonRequest paramRequest) {
        JavaCommonResponse result = new JavaCommonResponse();

        // 网络正常
        if (Utils.isNetworkOk(mct)) {
            String url = DataJavaProvider.CUSTOMER_BASE_URL_JAVA
                    + paramRequest.getMethodName();
//                    + "?"
//                    + getCommonInputMap(paramRequest).toString().getBytes();
//                    + BaseCode64.encode(paramRequest.gson.toJson(getCommonInputMap(paramRequest)).getBytes());
            Log.i(TAG, paramRequest.gson.toJson(getCommonInputMap(paramRequest)));
            Log.i(TAG, url);

            HttpPost request = new HttpPost(url);
            HttpClient httpClient = getHttpClientSupportHttpsAndHttp();
            try {
                request.setEntity(map2Namepair(getCommonInputMap(paramRequest)));
                HttpResponse httpResponse = httpClient.execute(request);

                if (HttpStatus.SC_OK == httpResponse.getStatusLine().getStatusCode()) {
                    StringBuilder builder = new StringBuilder();
                    BufferedReader br = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), Charset.defaultCharset()));
                    for (String s = br.readLine(); s != null; s = br.readLine()) {
                        builder.append(s);
                    }
                    String response = builder.toString();
                    Log.i(TAG, response);

                    // 接口调用成功
                    if (JSON.parseObject(response) != null && SUCCESS.equals(JSON.parseObject(response).getString("status"))) {
                        if (JSON.parseObject(response).getString("data") != null) {
//                            String data = new String(BaseCode64.decode(JSON.parseObject(response).getString("data")));//暂时不需要加密
                            String data = new String(JSON.parseObject(response).getString("data"));//暂时不需要加密
                            Log.i(TAG, data);
                            result = paramRequest.getOutputResponse(data);
                        } else {
                            result = new JavaCommonResponse();
                        }
                        result.result = RESULT_SUCCESS;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    } else {
                        // 接口调用失败
                        result = new JavaCommonResponse();
                        result.result = RESULT_FAILED;
                        result.ErrMsg = JSON.parseObject(response).getString("errMsg");
                        result.ErrCode = JSON.parseObject(response).getString("errCode");
                    }
                } else {
                    result.result = RESULT_FAILED;
                    result.ErrMsg = "请求超时，请稍后再试！";
                    result.ErrCode = "M-000002";
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求超时
                result.result = RESULT_FAILED;
                result.ErrMsg = "请求超时，请稍后再试！";
                result.ErrCode = "M-000002";
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                // 网络正常时http请求正常，数据解析失败
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            } catch (Exception e) {
                result.result = RESULT_FAILED;
                result.ErrMsg = "数据解析失败，请稍后再试！";
                result.ErrCode = "M-000003";
            }
        } else {
            // 网络异常
            result.result = RESULT_FAILED;
            result.ErrMsg = "网络异常，请设置网络后再试！";
            result.ErrCode = "M-000004";
        }
        result.Response_id = paramRequest.getMethodName();
        result.RequestSequenceId = paramRequest.RequestSequenceId;
        return result;
    }


}

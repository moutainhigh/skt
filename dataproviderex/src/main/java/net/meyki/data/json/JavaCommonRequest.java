package net.meyki.data.json;

import android.graphics.Bitmap;

import com.alibaba.fastjson.JSONException;
import com.google.gson.Gson;

import net.meyki.data.okhttp.OkHttpUtil.RequestType;
import net.meyki.data.provider.DataJavaProvider;

import java.io.File;
import java.util.HashMap;

public abstract class JavaCommonRequest {
	
	/**tag：0易家 1易商*/
	private static final String tag_distributon = "1";
	private static final String tag_client = "0";
	
	/** 方法名称 */
	private String methodName;
	
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	/** userId*/
	public String userId;
	
	/**shopId*/
	public String shopId;
	
	/** 请求序列编号 */
	public int RequestSequenceId;
	
	/** OS版本ID */
	public String dev_os = "android";
	
	/** 用于区分易商/易家用户 */
	public String dev_tag = tag_client;

	/** 请求方式 ，默认值为1（1：get 2:post）*/
	public int request_method = JavaJsonNetwork.TYPE_DEFAULT;
	public RequestType requestType = RequestType.GET;


	/** post上传照片时携带的参数 */
	public Bitmap bitmap;
	/** post上传文件时携带的参数 */
	public File file;

	/** 当前请求的页面，页面切换时使用*/
	public String status;
	/** 当前请求的分页，分页加载时使用 */
	public String pageNo;

	/** 分页加载时每页加载数量量  */
	public String pageSize = "10";

	/** 文件下载链接 */
	public String fileUrl;
	/** 文件下载路径  */
	public String filePath;
	/** 文件下载名称  */
	public String fileName;

	/** 序列化hashmap为json*/
	public Gson gson = new Gson();

	/** 提交给服务器的数据 */
	public abstract HashMap<String, Object> getInputMap();
	
	/** 从服务器获取的数据解析后的结果 */
	public abstract JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception;

	public HashMap<String, Object> initHashMap(){
		HashMap<String, Object> input = new HashMap<>();
		input.put("os", DataJavaProvider.mOs);
		input.put("tag", DataJavaProvider.mTag);
		input.put("vcode", DataJavaProvider.mVcode);
		return input;
	}

}
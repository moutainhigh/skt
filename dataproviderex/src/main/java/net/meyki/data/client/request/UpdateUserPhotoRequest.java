package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.UpdateUserPhotoReponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 1、用户上传头像
 * 
 * @author liyc
 * 
 */
public class UpdateUserPhotoRequest extends JavaCommonRequest {

	public UpdateUserPhotoRequest() {
		this.setMethodName("user/saveUserLogo");
		this.request_method = JavaJsonNetwork.TYPE_UPLOAD_PHOTO;
		requestType = OkHttpUtil.RequestType.POST;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> hashMap = initHashMap();
		hashMap.put("userId", userId);
		return hashMap;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
		return JSON.parseObject(json,UpdateUserPhotoReponse.class);
	}


}

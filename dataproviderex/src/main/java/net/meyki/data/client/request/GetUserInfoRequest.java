package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.GetUserInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 优惠券领取
 * 
 * @author liyc
 * 
 */
public class GetUserInfoRequest extends JavaCommonRequest {

	public GetUserInfoRequest() {
		setMethodName("user/getUserInfoClient");
		requestType = OkHttpUtil.RequestType.GET;
	}

	/***
	 * 摇一摇领取优惠券时使用
	 */
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = initHashMap();
		params.put("userId", userId);
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
		return JSON.parseObject(json,GetUserInfoResponse.class);
	}

}

package net.meyki.data.client.request;

import net.meyki.data.client.response.GetUserExtInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

public class GetUserExtInfoRequest extends JavaCommonRequest {

	public String ownerId;

	public GetUserExtInfoRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("community/queryUserInfo");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("userId", userId);
		param.put("ownerId", ownerId);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		GetUserExtInfoResponse crp = new GetUserExtInfoResponse();
		crp = JacksonUtil.readValue(json, GetUserExtInfoResponse.class);
		return crp;
	}

}

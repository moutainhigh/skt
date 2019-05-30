package net.meyki.data.client.request;

import net.meyki.data.client.response.ActGetChargeDetailResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

public class ActGetChargeDetailRequest extends JavaCommonRequest {

	public String activesId;
	
	public ActGetChargeDetailRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("actives/viewActives");
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("userId", userId);
		param.put("activesId", activesId);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		ActGetChargeDetailResponse rs = new ActGetChargeDetailResponse();
		rs = JacksonUtil.readValue(json, ActGetChargeDetailResponse.class);
		return rs;
	}

}

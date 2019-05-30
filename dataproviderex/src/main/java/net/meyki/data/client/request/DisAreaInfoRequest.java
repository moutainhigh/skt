package net.meyki.data.client.request;

import net.meyki.data.client.response.DisAreaInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

public class DisAreaInfoRequest extends JavaCommonRequest {


	public DisAreaInfoRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("/v3/disc/getDisAreaInfo");
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		DisAreaInfoResponse rs = new DisAreaInfoResponse();
		rs = JacksonUtil.readValue(json, DisAreaInfoResponse.class);
		return rs;
	}

}

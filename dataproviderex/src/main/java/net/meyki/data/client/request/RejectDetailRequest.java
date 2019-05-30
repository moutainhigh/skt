package net.meyki.data.client.request;

import net.meyki.data.client.response.MoneyRefundResponse;
import net.meyki.data.client.response.RejectDetailResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

public class RejectDetailRequest extends JavaCommonRequest {
	public  String orderId;
	public  String refondId;

	public RejectDetailRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("v4/v409refond/rejectDetail");
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("orderId", orderId);
		param.put("refondId", refondId);
		param.put("userId",userId);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		RejectDetailResponse rs = new RejectDetailResponse();
		rs = JacksonUtil.readValue(json, RejectDetailResponse.class);
		return rs;
	}

}

package net.meyki.data.client.request;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.FreeBenefitDetailResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import org.codehaus.jackson.type.TypeReference;

import java.util.HashMap;

public class FreeBenefitDetailRequest extends JavaCommonRequest {

	public String id;

	public FreeBenefitDetailRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("free/getFreeInfo");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("shopId", shopId);
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("id", id);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		FreeBenefitDetailResponse rs = new FreeBenefitDetailResponse();
		rs = JacksonUtil.readValue(json, new TypeReference<FreeBenefitDetailResponse>(){});
		return rs;
	}

}

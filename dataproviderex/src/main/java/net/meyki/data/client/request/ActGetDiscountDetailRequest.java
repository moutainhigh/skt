package net.meyki.data.client.request;

import net.meyki.data.client.response.ActGetDiscountDetailResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

public class ActGetDiscountDetailRequest extends JavaCommonRequest {
	
	public String saleInfoId;
	
	public ActGetDiscountDetailRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("saleinfoImage/getInfo");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("shopId", shopId);
		param.put("saleInfoId", saleInfoId);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		ActGetDiscountDetailResponse rs = new ActGetDiscountDetailResponse();
		rs = JacksonUtil.readValue(json, ActGetDiscountDetailResponse.class);
		return rs;
	}

}

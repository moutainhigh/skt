package net.meyki.data.client.request;

import net.meyki.data.client.response.QueryDistrictShopNameResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取当前位置特色馆名称
 */
public class QueryDistrictShopName extends JavaCommonRequest {

	public String countryName;

	public QueryDistrictShopName() {
		// TODO Auto-generated constructor stub
		setMethodName("v4/homeEhIndex/queryDistrictShopName");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("tag", dev_tag);
		param.put("os", dev_os);
		param.put("countryName", countryName);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		QueryDistrictShopNameResponse rs = new QueryDistrictShopNameResponse();
		rs = JacksonUtil.readValue(json, QueryDistrictShopNameResponse.class);
		return rs;
	}

}

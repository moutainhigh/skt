package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.GetBankListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 查询银行卡
 * 
 * @author hulei
 * 
 */
public class GetBankListRequest extends JavaCommonRequest {

	public GetBankListRequest() {
		this.setMethodName("user/getBankList");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		GetBankListResponse glr = JSON.parseObject(json, GetBankListResponse.class);
		return glr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("userId", userId);
		return in;
	}

}

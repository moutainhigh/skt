package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 设置银行卡为默认
 * 
 * @author liyc
 * 
 */
public class BankCardDefaultRequest extends JavaCommonRequest {
	public String bankId;
	public BankCardDefaultRequest() {
		this.setMethodName("user/setBankDefault");
		requestType = OkHttpUtil.RequestType.PUT;
		request_method = JavaJsonNetwork.TYPE_PUT_DATA;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in =  initHashMap();
		in.put("userId",userId);
		in.put("bankId", bankId);
		return in;
	}

}

package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;


/**
 * 取消绑定银行卡
 * 
 * @author liyc
 * 
 */
public class DeleteBankCardRequest extends JavaCommonRequest {
	public String bankId;
	public DeleteBankCardRequest() {
		this.setMethodName("user/deleteBank");
		requestType = OkHttpUtil.RequestType.DELETE;
		request_method = JavaJsonNetwork.TYPE_DELETE_DATA;
	}


	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return null;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("userId", userId);
		in.put("bankId", bankId);
		return in;
	}

}

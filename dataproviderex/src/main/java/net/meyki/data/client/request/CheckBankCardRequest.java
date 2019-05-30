package net.meyki.data.client.request;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.CheckBankCardResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import org.codehaus.jackson.type.TypeReference;

import java.util.HashMap;

/**
 * 从服务器加载银行卡列表信息
 * 
 * @author hulei
 * 
 */
public class CheckBankCardRequest extends JavaCommonRequest {
	public String bankNo;

	public CheckBankCardRequest() {
		this.setMethodName("user/getAllBank");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		CheckBankCardResponse cr = new CheckBankCardResponse();
		cr = JacksonUtil.readValue(json,
				new TypeReference<CheckBankCardResponse>() {
				});
		return cr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("userId", userId);
		in.put("bankNo", bankNo);
		return in;
	}

}

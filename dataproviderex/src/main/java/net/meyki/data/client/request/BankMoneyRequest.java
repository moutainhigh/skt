package net.meyki.data.client.request;

import net.meyki.data.client.response.BankMoneyResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取提现记录
 * 
 * @author liyc
 * 
 */
public class BankMoneyRequest extends JavaCommonRequest {
	public String bankId;
	public String bankNo;
	public String pageNo;
	public String pageSize;

	public BankMoneyRequest() {
		this.setMethodName("user/getBankMoneyLog");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		BankMoneyResponse br = new BankMoneyResponse();
		br = JacksonUtil.readValue(json, BankMoneyResponse.class);
		return br;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("os", dev_os);
		in.put("tag", dev_tag);
		in.put("bank_no", bankNo);
		in.put("pageNo", pageNo);
		in.put("pageSize", pageSize);
		return in;
	}

}

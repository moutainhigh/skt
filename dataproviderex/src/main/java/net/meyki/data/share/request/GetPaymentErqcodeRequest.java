package net.meyki.data.share.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.PaymentBean;
import net.meyki.data.share.response.GetPaymentErqcodeResponse;

import java.util.HashMap;

/**
 * 获取收款二维码
 * 
 * @author
 * 
 */
public class GetPaymentErqcodeRequest extends JavaCommonRequest {
	public String money;
	public GetPaymentErqcodeRequest() {
		this.setMethodName("user/getPaymentQr");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		GetPaymentErqcodeResponse er = new GetPaymentErqcodeResponse();
		er.payment =  JSON.parseObject(json, PaymentBean.class);
		return er;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("userId", userId);
		in.put("money", money);
		return in;
	}

}

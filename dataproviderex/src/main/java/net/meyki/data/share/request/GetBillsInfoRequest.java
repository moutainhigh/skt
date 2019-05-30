package net.meyki.data.share.request;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.PaymentCountBean;
import net.meyki.data.share.response.GetBillsInfoResponse;

import java.util.HashMap;

/**
 * 付款  请求付款状态
 * 
 * @author
 * 
 */
public class GetBillsInfoRequest extends JavaCommonRequest {
	public String billsId;
	public GetBillsInfoRequest() {
		this.setMethodName("user/getBillsInfo");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		GetBillsInfoResponse er = new GetBillsInfoResponse();
		er.payCount = JSON.parseObject(json, PaymentCountBean.class);
		if (TextUtils.isEmpty(er.payCount.logo)){
			er.payCount.logo = er.payCount.userLogo;
		}
		return er;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("userId", userId);
		in.put("billsId", billsId);
		return in;
	}
}

package net.meyki.data.share.request;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;


import net.meyki.data.distributon.response.FreeBenefitListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.share.domain.CheckPaymentStatusBean;
import net.meyki.data.share.response.CheckPaymentStatusResponse;
import net.meyki.data.utils.JacksonUtil;

/**
 * 
 * 收款界面使用 用于检测 对方用户是否已经支付
 * @author hulei
 * 
 */
public class CheckPaymentStatusRequest extends JavaCommonRequest {
	public String billsId;
	public CheckPaymentStatusRequest() {
		this.setMethodName("user/checkBillsUserInfo");
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		CheckPaymentStatusResponse sr = new CheckPaymentStatusResponse();
		sr.status = JacksonUtil.readValue(json, CheckPaymentStatusBean.class);
		return sr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = new HashMap<String, Object>();
		in.put("os", dev_os);
		in.put("tag", dev_tag);
		in.put("userId", userId);
		in.put("billsId", billsId);
		return in;
	}

}

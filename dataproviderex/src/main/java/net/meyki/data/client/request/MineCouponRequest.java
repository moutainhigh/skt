package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.ActGetDiscountDetailResponse;
import net.meyki.data.client.response.MineCouponResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * hl 我的消费劵
 */
public class MineCouponRequest extends JavaCommonRequest {

	public String fkTicketId;
	public String originType;
//	来源类型(1=手机发送,2=面对面,3=好友赠送,4=福袋,5=退款,6=消费)
//	消费券种类ID
	public MineCouponRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("v4/amount/userapp/getAmountInfo");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = initHashMap();
		param.put("userId", userId);
		param.put("originType", originType);
		param.put("fkTicketId", fkTicketId);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		MineCouponResponse rs = JSON.parseObject(json, MineCouponResponse.class);
		return rs;
	}

}

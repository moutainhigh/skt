package net.meyki.data.client.request;

import net.meyki.data.client.response.QueryLogisticResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 1、查询物流详情
 * 
 * @author liyc
 * 
 */
public class QueryLogisticRequest extends JavaCommonRequest {
	public String orderId; //订单号 ,退款传refondID,订单传orderId
	public String type; //0退款单 1物流单
	public QueryLogisticRequest() {
		this.setMethodName("v4/v409refond/queryOrderLogistic");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("orderId",orderId);
		params.put("userId",userId);
		params.put("type",type);
		return params;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		QueryLogisticResponse qr=null;
		qr= FastJsonUtil.getObjectTFromJson(paramStream,QueryLogisticResponse.class);
		return qr;
	}

}

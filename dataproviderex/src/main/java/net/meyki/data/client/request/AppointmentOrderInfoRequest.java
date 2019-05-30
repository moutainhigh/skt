package net.meyki.data.client.request;

import net.meyki.data.client.response.AppointmentOrderInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 订单详细页面
 * @author liyc
 *
 */
public class AppointmentOrderInfoRequest extends JavaCommonRequest {

	public AppointmentOrderInfoRequest() {
		this.setMethodName("v3/orderInfo/getAppointmentOrderInfoDetail");
		requestType = OkHttpUtil.RequestType.GET;
	}

	public String orderId;
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = initHashMap();
		param.put("orderId", orderId);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		if (null == json) {
			return null;
		}
		AppointmentOrderInfoResponse oir = FastJsonUtil.getObjectTFromJson(json,AppointmentOrderInfoResponse.class);
		return oir;
	}
}

package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import java.util.HashMap;

//2.订单确认收货
public class OrderShipRequest extends JavaCommonRequest {

	public String orderId;

	public OrderShipRequest() {
		this.setMethodName("superiorProducts/confirmDeliver");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> param = initHashMap();
		param.put("userId", userId);
		param.put("orderId", orderId);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return null;
	}
}

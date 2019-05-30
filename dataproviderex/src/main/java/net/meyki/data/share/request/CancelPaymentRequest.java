package net.meyki.data.share.request;

import java.util.HashMap;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;

/**
 * 用户登录请求
 * 
 * @author hulei
 * 
 */
public class CancelPaymentRequest extends JavaCommonRequest {
	public String billsId;
	public CancelPaymentRequest() {
		this.setMethodName("user/cancelBills");
		request_method = JavaJsonNetwork.TYPE_PUT_DATA;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		return null;
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

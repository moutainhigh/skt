package net.meyki.data.share.request;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;


import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
/**
 *
 * @author hulei
 * 
 */
public class ConfirmPaymentRequest extends JavaCommonRequest {
	public String billsId;
	public ConfirmPaymentRequest() {
		this.setMethodName("user/payedBills");
		request_method = JavaJsonNetwork.TYPE_POST_DATA;
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

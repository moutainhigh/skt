package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import java.util.HashMap;

public class FindPassOneNewRequest extends JavaCommonRequest {

	public String phone;

	public FindPassOneNewRequest() {
		setMethodName("user/checkPhone");
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> in = initHashMap();
		in.put("phone", phone);
		return in;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		return null;
	}

}

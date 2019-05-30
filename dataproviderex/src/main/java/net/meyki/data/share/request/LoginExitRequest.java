package net.meyki.data.share.request;

import java.util.HashMap;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

public class LoginExitRequest extends JavaCommonRequest {

	public LoginExitRequest() {
		setMethodName("user/loginOut");
		request_method = JavaJsonNetwork.TYPE_PUT_DATA;
		requestType = OkHttpUtil.RequestType.PUT;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = initHashMap();
		in.put("userId", userId);
		return in;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		return null;
	}

}

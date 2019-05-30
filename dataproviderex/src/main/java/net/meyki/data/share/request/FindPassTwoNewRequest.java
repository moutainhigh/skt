package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import java.util.HashMap;

public class FindPassTwoNewRequest extends JavaCommonRequest {

	public String loginName;
	public String password;
	public String verifyCode;
	
	public FindPassTwoNewRequest(){
		setMethodName("user/forgetLoginPassword");
		requestType = OkHttpUtil.RequestType.GET;
	}


	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> in = initHashMap();
		in.put("phone", loginName);
		in.put("loginPassword", password);
		in.put("verifyCode",verifyCode);
		return in;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		// TODO Auto-generated method stub
		return null;
	}

}

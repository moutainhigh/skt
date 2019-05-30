package net.meyki.data.share.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.share.response.UserRegNewResponse;

import java.util.HashMap;

public class UserRegNewRequest extends JavaCommonRequest {


	public String phone; //	是	String	手机号码
	public String verifyCode; //	是	String	验证码
	public String password; //	是	String	密码

	public UserRegNewRequest() {
		setMethodName("user/userRegister");
		requestType = OkHttpUtil.RequestType.GET;
	}
	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> in = initHashMap();
		in.put("phone", phone);
		in.put("verifyCode", verifyCode);
		in.put("loginPassword", password);
		return in;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String paramStream) {
		return JSON.parseObject(paramStream, UserRegNewResponse.class);
	}

}

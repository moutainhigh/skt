package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import java.util.HashMap;

public class ModifyLoginPswRequest extends JavaCommonRequest {

	public String oldPass;
	public String newPass;

	public ModifyLoginPswRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("user/resetLoginPassword");
		requestType = OkHttpUtil.RequestType.POST;
	}
	
	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = initHashMap();
		param.put("userId",userId);
		param.put("oldPassword", oldPass);
		param.put("newPassword", newPass);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		return null;
	}

}

package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

public class ModifyAccountPswRequest extends JavaCommonRequest {

	public String oldPass;
	public String newPass;

	public ModifyAccountPswRequest() {
		// TODO Auto-generated constructor stub
		setMethodName("user/modifyChargePass");
		request_method = JavaJsonNetwork.TYPE_PUT_DATA;
		requestType = OkHttpUtil.RequestType.PUT;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> param = initHashMap();
		param.put("userId",userId);
		param.put("oldPass", oldPass);
		param.put("newPass", newPass);
		return param;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		// TODO Auto-generated method stub
		return null;
	}
}

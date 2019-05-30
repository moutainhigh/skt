package net.meyki.data.share.request;

import java.util.HashMap;


import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.share.domain.UserChargeBean;
import net.meyki.data.share.response.UserChargrResponse;
import net.meyki.data.utils.JacksonUtil;

/**
 * 用户登录请求
 * 
 * @author hulei
 * 
 */
public class UserChargrRequest extends JavaCommonRequest {
	public String paytype;
	public String money;

	public UserChargrRequest() {
		this.setMethodName("user/charge");
		request_method = JavaJsonNetwork.TYPE_POST_DATA;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		UserChargrResponse cr = new UserChargrResponse();
		cr.charge = JacksonUtil.readValue(json, UserChargeBean.class);
		return cr;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = new HashMap<String, Object>();
		in.put("userId", userId);
		in.put("paytype", paytype);
		in.put("money", money);
		return in;
	}

}

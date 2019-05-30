package net.meyki.data.share.request;

import com.alibaba.fastjson.JSON;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.share.domain.UserLoginBean;
import net.meyki.data.share.response.UserLoginResponse;
import java.util.HashMap;

/**
 * 用户登录请求
 * @author liyc
 *
 */
public class UserLoginRequest extends JavaCommonRequest {

	public UserLoginRequest() {
		this.setMethodName("user/userLogin");
		requestType = OkHttpUtil.RequestType.GET;
	}

	/**
	 * 用户登录名
	 */
	private String loginName;
	/**
	 * 用户密码
	 */
	private String password;


	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		HashMap<String, Object> in = initHashMap();
		in.put("phone", loginName);
		in.put("loginPassword", password);
		return in;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		UserLoginResponse rr = new UserLoginResponse();
		rr.login = JSON.parseObject(json, UserLoginBean.class);
		return rr;
	}

}

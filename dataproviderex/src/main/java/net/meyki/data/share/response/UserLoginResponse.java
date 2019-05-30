package net.meyki.data.share.response;


import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.UserLoginBean;

/**
 * 用户登录响应
 * @author Administrator
 */
public class UserLoginResponse extends JavaCommonResponse {
	/** 用户登录响应的实体bean */
	public UserLoginBean login = new UserLoginBean();

}

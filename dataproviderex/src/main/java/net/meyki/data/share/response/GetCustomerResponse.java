package net.meyki.data.share.response;

import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

/***
 * 会员活动列表时调用
 * @author liyc
 *
 */
public class GetCustomerResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3047404125068257609L;
	public String loginName;
	public String showName;
	public String cusMUserId;
	public String cusMUserPhoto;
}

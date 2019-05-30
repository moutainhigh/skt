package net.meyki.data.share.domain;

import java.io.Serializable;
/**
 * 红包领取记录
 * 
 * @author Administrator
 *
 */
public class GetRedBagRecord implements Serializable{

	private static final long serialVersionUID = -5483550541707042198L;

	public String is_check;
	public String loginName;
	public double money;
	public int status;
	public String tag;
	public String updatetime;
	public String userName;
	public String userPhoto;
	public String user_id;

}

package meyki.distribution.dataprovider.domain;

import java.io.Serializable;
/**
 * 用户信息实体类
 * */
public class UserInfo implements Serializable{
	
	private static final long serialVersionUID = 4814145131454107023L;
	private String realname;
	private String retail_id;
	private String delete;
	private String check;
	private String validated;
	private String phone;
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getRetail_id() {
		return retail_id;
	}
	public void setRetail_id(String retail_id) {
		this.retail_id = retail_id;
	}
	public String getDelete() {
		return delete;
	}
	public void setDelete(String delete) {
		this.delete = delete;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getValidated() {
		return validated;
	}
	public void setValidated(String validated) {
		this.validated = validated;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserInfo [realname=" + realname + ", retail_id=" + retail_id
				+ ", delete=" + delete + ", check=" + check + ", validated="
				+ validated + ", phone=" + phone + "]";
	}
	
}

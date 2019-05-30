package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * 红包对应的实体类
 * @author liyc
 */
public class RedBagInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8798963386905277386L;

	private String is_check;
	private String left_money;
	private String left_num;
	private String num;
	private String red_packet_id;
	private String shop_id;
	private String tag;
	private String total_money;
	private String update_time;
	private String userName;
	private String userPhoto;
	private String user_id;
	
	public String getIs_check() {
		return is_check;
	}
	public void setIs_check(String is_check) {
		this.is_check = is_check;
	}
	public String getLeft_money() {
		return left_money;
	}
	public void setLeft_money(String left_money) {
		this.left_money = left_money;
	}
	public String getLeft_num() {
		return left_num;
	}
	public void setLeft_num(String left_num) {
		this.left_num = left_num;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getRed_packet_id() {
		return red_packet_id;
	}
	public void setRed_packet_id(String red_packet_id) {
		this.red_packet_id = red_packet_id;
	}
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTotal_money() {
		return total_money;
	}
	public void setTotal_money(String total_money) {
		this.total_money = total_money;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

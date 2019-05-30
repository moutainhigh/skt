package meyki.distribution.dataprovider.bean;

import java.io.Serializable;

/**
 * 红包对应的实体类
 * @author liyc
 */
public class RedBagInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 红包id */
	private int red_packet_id;
	/** 红包总金额 */
	private double total_money;
	/** 红包个数 */
	private int num;
	/**创建的用户id */
	private int user_id;
	/** 添加时间 */
	private String update_time;

	/** 领取金额  */
	private double left_money;
	/** 红包领取数量  */
	private int left_num;
	/** 区分易商和易家用户 0：易家1：易商 */
	private int tag;
	/** 用户logo */
	private String userPhoto;
	private String userName;
	
	private String shopImg;
	
	private String shopName;
	
	private int shopId;
	
	private String is_check;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIs_check() {
		return is_check;
	}
	public void setIs_check(String is_check) {
		this.is_check = is_check;
	}
	public int getRed_packet_id() {
		return red_packet_id;
	}
	public void setRed_packet_id(int red_packet_id) {
		this.red_packet_id = red_packet_id;
	}
	
	public double getTotal_money() {
		return total_money;
	}
	public void setTotal_money(double total_money) {
		this.total_money = total_money;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getLeft_money() {
		return left_money;
	}
	public void setLeft_money(double left_money) {
		this.left_money = left_money;
	}
	public int getLeft_num() {
		return left_num;
	}
	public void setLeft_num(int left_num) {
		this.left_num = left_num;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
}

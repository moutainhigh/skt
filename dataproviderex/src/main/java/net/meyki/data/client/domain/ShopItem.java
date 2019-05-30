package net.meyki.data.client.domain;

import net.meyki.data.client.domain.ShopItemInter;

import java.io.Serializable;
import java.util.ArrayList;


public class ShopItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4894392435928095240L;
	private int shopId;//店铺id
	private int userId;//用户id
	private String shopImg;//店铺logo
	private String shopName;//店铺名称
	private String shopAddress;//店铺地址
	private String shopDesc;//店铺介绍
	private String shopActiveType;//array('满减','折扣','新品','福利',...),
	private String shopDistance;//店铺距
	private String shopTel;//电话
	private String shippingMess;//配送描述
	private String longitude;//'longitude'=>经度,
	private String latitude;//'latitude'=>维度,
	
		
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getShippingMess() {
		return shippingMess;
	}
	public void setShippingMess(String shippingMess) {
		this.shippingMess = shippingMess;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getShopTel() {
		return shopTel;
	}
	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}
	private ArrayList<ShopItemInter> keywordGoods = new ArrayList<ShopItemInter>();
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
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
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopDesc() {
		return shopDesc;
	}
	public void setShopDesc(String shopDesc) {
		this.shopDesc = shopDesc;
	}
	public String getShopActiveType() {
		return shopActiveType;
	}
	public void setShopActiveType(String shopActiveType) {
		this.shopActiveType = shopActiveType;
	}
	public String getShopDistance() {
		return shopDistance;
	}
	public void setShopDistance(String shopDistance) {
		this.shopDistance = shopDistance;
	}
	public ArrayList<ShopItemInter> getKeywordGoods() {
		return keywordGoods;
	}
	public void setKeywordGoods(ArrayList<ShopItemInter> keywordGoods) {
		this.keywordGoods = keywordGoods;
	}
	
	
}

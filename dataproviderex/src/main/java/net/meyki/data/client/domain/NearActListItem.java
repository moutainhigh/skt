package net.meyki.data.client.domain;

import java.io.Serializable;

public class NearActListItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3894285283868823131L;

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	/**
	 * 
	 */
	public String shopId;
	public String shopName;
	public String shopDistance;
	public String activeId;
	public String activeTitle;
	public String activeImg;
	public String activeType;
	public String activeClassify;
	public String activeStartTime;
	public String activeEndTime;
	public String activeDes;
	public String bonusNum;
	public String shopImg;



	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopDistance() {
		return shopDistance;
	}

	public void setShopDistance(String shopDistance) {
		this.shopDistance = shopDistance;
	}

	public String getActiveId() {
		return activeId;
	}

	public void setActiveId(String activeId) {
		this.activeId = activeId;
	}

	public String getActiveTitle() {
		return activeTitle;
	}

	public void setActiveTitle(String activeTitle) {
		this.activeTitle = activeTitle;
	}

	public String getActiveImg() {
		return activeImg;
	}

	public void setActiveImg(String activeImg) {
		this.activeImg = activeImg;
	}

	public String getActiveType() {
		return activeType;
	}

	public void setActiveType(String activeType) {
		this.activeType = activeType;
	}

	public String getActiveClassify() {
		return activeClassify;
	}

	public void setActiveClassify(String activeClassify) {
		this.activeClassify = activeClassify;
	}

	public String getActiveStartTime() {
		return activeStartTime;
	}

	public void setActiveStartTime(String activeStartTime) {
		this.activeStartTime = activeStartTime;
	}

	public String getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(String activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public String getActiveDes() {
		return activeDes;
	}

	public void setActiveDes(String activeDes) {
		this.activeDes = activeDes;
	}

	public String getBonusNum() {
		return bonusNum;
	}

	public void setBonusNum(String bonusNum) {
		this.bonusNum = bonusNum;
	}

	public String getShopImg() {
		return shopImg;
	}

	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
}

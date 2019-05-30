package net.meyki.data.share.domain;

import java.io.Serializable;

/***
 * 用户群组列表对应的实体类
 * @author Administrator
 *
 */
public class ShopFansListItem  implements Serializable{

	public String userName;
	public String userId;
	public String userPhoto;
	public String isCheck;
	public String tag;
	public String loginName;
	public String shopAddress;
	public String userPhone;
	public String shopImg;
	public String shopName;
	public String shopId;
	public String communityName;
	public String communityId;
	public String communityMemNum;
	public String communityOwnerName;
	public String ringGroupId;

	public String getRemarkName() {
		return remarkName;
	}

	public void setRemarkName(String remarkName) {
		this.remarkName = remarkName;
	}

	public String remarkName;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
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

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCommunityMemNum() {
		return communityMemNum;
	}

	public void setCommunityMemNum(String communityMemNum) {
		this.communityMemNum = communityMemNum;
	}

	public String getCommunityOwnerName() {
		return communityOwnerName;
	}

	public void setCommunityOwnerName(String communityOwnerName) {
		this.communityOwnerName = communityOwnerName;
	}

	public String getRingGroupId() {
		return ringGroupId;
	}

	public void setRingGroupId(String ringGroupId) {
		this.ringGroupId = ringGroupId;
	}
}

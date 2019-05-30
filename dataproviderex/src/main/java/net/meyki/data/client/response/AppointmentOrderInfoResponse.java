package net.meyki.data.client.response;


import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by chao on 2016/5/7.
 */
public class AppointmentOrderInfoResponse extends JavaCommonResponse {
    public String orderId;
    public String createTime;
    public String contact;
    public String mobile;
    public String goodsId;
    public String goodsImg;
    public String goodsDesc;
    public String goodsPrice;
    public String shopName;
    public String marketPrice;
    public String shopAddress;
    public String orderSn;
    public String goodsName;
    public String goodsUnit;

    public String specCount;
    public String specImg;
    public String specName;
    public String specPrice;
    public String specUnit;
    public String specId;


    public String userId;//					out		String				YES		买家用户id
    public String shopUserId;//					out		String				YES		商家用户id
    public String userName;//					out		String				YES		用户名称
    public String tag;//					out		String				YES		               具体映射详见下方备注
    public String userPhoto;//					out		String				YES		用户头像
    public String loginName;//					out		String				YES		登陆名称
    public String shopTel;//商铺电话
    public String isCollect;//是否已关注 0否 1是

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getShopAddres() {
        return shopAddress;
    }

    public void setShopAddres(String shopAddres) {
        shopAddress = shopAddres;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getSpecCount() {
        return specCount;
    }

    public void setSpecCount(String specCount) {
        this.specCount = specCount;
    }

    public String getSpecImg() {
        return specImg;
    }

    public void setSpecImg(String specImg) {
        this.specImg = specImg;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public String getSpecPrice() {
        return specPrice;
    }

    public void setSpecPrice(String specPrice) {
        this.specPrice = specPrice;
    }

    public String getSpecUnit() {
        return specUnit;
    }

    public void setSpecUnit(String specUnit) {
        this.specUnit = specUnit;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getShopUserId() {
        return shopUserId;
    }

    public void setShopUserId(String shopUserId) {
        this.shopUserId = shopUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getShopTel() {
        return shopTel;
    }

    public void setShopTel(String shopTel) {
        this.shopTel = shopTel;
    }

    public String getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(String isCollect) {
        this.isCollect = isCollect;
    }

    @Override
    public String toString() {
        return "AppointmentOrderInfoResponse{" +
                "orderId='" + orderId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", contact='" + contact + '\'' +
                ", mobile='" + mobile + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", shopName='" + shopName + '\'' +
                ", marketPrice='" + marketPrice + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", orderSn='" + orderSn + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", specCount='" + specCount + '\'' +
                ", specImg='" + specImg + '\'' +
                ", specName='" + specName + '\'' +
                ", specPrice='" + specPrice + '\'' +
                ", specUnit='" + specUnit + '\'' +
                ", specId='" + specId + '\'' +
                ", userId='" + userId + '\'' +
                ", shopUserId='" + shopUserId + '\'' +
                ", userName='" + userName + '\'' +
                ", tag='" + tag + '\'' +
                ", userPhoto='" + userPhoto + '\'' +
                ", loginName='" + loginName + '\'' +
                ", shopTel='" + shopTel + '\'' +
                ", isCollect='" + isCollect + '\'' +
                '}';
    }
}

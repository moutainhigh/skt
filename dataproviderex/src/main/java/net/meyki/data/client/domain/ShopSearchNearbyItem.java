package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/4/28.
 */
public class ShopSearchNearbyItem implements Serializable {
    public String shopId;
    public String shopName;
    public String shopImg;
    public String shopAddress;
    public String shopDesc;
    public String shopActiveType;
    public String distance;
    public String isSend;
    public String shopType;
    public String longitude;
    public String latitude;
    public String shippingDes;
    public String shopTel;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
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

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
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

    public String getShippingDes() {
        return shippingDes;
    }

    public void setShippingDes(String shippingDes) {
        this.shippingDes = shippingDes;
    }

    public String getShopTel() {
        return shopTel;
    }

    public void setShopTel(String shopTel) {
        this.shopTel = shopTel;
    }
}

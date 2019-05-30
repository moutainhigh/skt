package net.meyki.data.concoupon.domain;

import java.io.Serializable;

/**
 * 获取店铺关注信息
 * Created by Knight on 2017/3/30.
 */

public class ShopFansdataBean implements Serializable {
    private String isHasFollow;//是否已关注 0已关注 1 未关注
    private String oKey;//口令
    private String luckbagKey;//已关注：返回福袋口令、未关注：返回null；
    private String shopDetailAddres;//店铺详细地址
    private String shopCate;
    private String shopName;//店铺名称
    private String onLineFlag;//是否线上：1 线上 2 线下
    private String longitude;//经度
    private String latitude;//维度

    public String getIsHasFollow() {
        return isHasFollow;
    }

    public void setIsHasFollow(String isHasFollow) {
        this.isHasFollow = isHasFollow;
    }

    public String getoKey() {
        return oKey;
    }

    public void setoKey(String oKey) {
        this.oKey = oKey;
    }

    public String getLuckbagKey() {
        return luckbagKey;
    }

    public void setLuckbagKey(String luckbagKey) {
        this.luckbagKey = luckbagKey;
    }

    public String getShopDetailAddres() {
        return shopDetailAddres;
    }

    public void setShopDetailAddres(String shopDetailAddres) {
        this.shopDetailAddres = shopDetailAddres;
    }

    public String getShopCate() {
        return shopCate;
    }

    public void setShopCate(String shopCate) {
        this.shopCate = shopCate;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOnLineFlag() {
        return onLineFlag;
    }

    public void setOnLineFlag(String onLineFlag) {
        this.onLineFlag = onLineFlag;
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
}

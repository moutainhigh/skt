package net.meyki.data.client.domain;

/**
 * 项目名称：user-4.5.0
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/20 15:21
 * 修改人：meyki-bear
 * 修改时间：2017/6/20 15:21
 * 修改备注：
 */

public class CountrySearchShopBean {
   private String  shopName	;//YES	店铺名称
   private String  shopImg	;//YES	图片
   private String  shopId	;//YES	店铺id
   private String  shopDesc	;//YES	店铺简介
    private String proxyId;//特产馆代理 id
    public String getShopName() {
        return shopName;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
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

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }
}

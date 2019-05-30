package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Knight on 2017/4/18.
 */

public class RecommendGoodsBean implements Serializable{
        private String goodsName;//商品名称
        private String goodsId;//商品ID
        private String goodsPrice;//商品价格
        private String province;//省
        private String city;//市
        private String county;//区
        private String goodsImg;//图片
        private String isTicket;//是否有抵金券
        private String createTime;//建立时间
        private String goodsUnit;//商品单位
        private String salesVolume;//销售
        private String orderSource;//是否参与活动商品
        public String defaultSpecName;//商品默认规格
        public String paymentCount;  //付款人数

    public String getDefaultSpecName() {
        return defaultSpecName;
    }

    public void setDefaultSpecName(String defaultSpecName) {
        this.defaultSpecName = defaultSpecName;
    }

    public String getCreateTime() {
        return createTime;
    }


    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public String getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(String salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getIsTicket() {
        return isTicket;
    }

    public void setIsTicket(String isTicket) {
        this.isTicket = isTicket;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}

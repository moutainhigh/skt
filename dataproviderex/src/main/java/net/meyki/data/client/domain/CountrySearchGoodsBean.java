package net.meyki.data.client.domain;

import java.util.ArrayList;

/**
 * 项目名称：user-4.5.0
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/20 15:20
 * 修改人：meyki-bear
 * 修改时间：2017/6/20 15:20
 * 修改备注：
 */

public class CountrySearchGoodsBean {
   private String  goodsName	;//YES	商品名称
   private String  goodsId	;//YES	商品ID
   private String  goodsImg	;//YES	商品图片
   private String  goodsPrice	;//YES	商品价格
   private String  payCount	;//YES	付款人数
   private String  origin	;//YES	产地
   private String  isCoupon	;//String	是否抵金券：0：否；1：是
   private ArrayList<SpecBean> specList	;//YES	规格列表

    public ArrayList<SpecBean> getSpecList() {
        return specList;
    }

    public void setSpecList(ArrayList<SpecBean> specList) {
        this.specList = specList;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getPayCount() {
        return payCount;
    }

    public void setPayCount(String payCount) {
        this.payCount = payCount;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getIsCoupon() {
        return isCoupon;
    }

    public void setIsCoupon(String isCoupon) {
        this.isCoupon = isCoupon;
    }
}

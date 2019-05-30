package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Knight on 2017/6/22.
 */

public class SearchFilterBean implements Serializable {

    public String goodsId;		    //	商品ID
    public String goodsName;		//	商品名称
    public String goodsImg;		//	图片
    public String goodsPrice;		//	商品价格
    public String payCount;	    //	付款人数
    public String isCoupon;		//	是否抵金券：0：是；1：否
    public String origin;	        //	产地
    public List<SpecList> specList; //规格list



    public class SpecList{
        public String specName;
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

    public String getIsCoupon() {
        return isCoupon;
    }

    public void setIsCoupon(String isCoupon) {
        this.isCoupon = isCoupon;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPayCount() {
        return payCount;
    }

    public void setPayCount(String payCount) {
        this.payCount = payCount;
    }

    public List<SpecList> getSpecList() {
        return specList;
    }

    public void setSpecList(List<SpecList> specList) {
        this.specList = specList;
    }
}

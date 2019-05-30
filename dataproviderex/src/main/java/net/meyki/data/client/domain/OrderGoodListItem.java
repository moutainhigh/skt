package net.meyki.data.client.domain;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * Created by chao on 2016/5/6.
 */
public class OrderGoodListItem implements Serializable {
    public String shopName;
    public String marketPrice;
    public String goodsUnit;//商品單位
    public String specImg;
    public String goodsId;//商品ID
    public String specId;//规格id
    public String specName;//规格名称
    public String specPrice;//规格价格
    public String specImgSrc;//规格图片
    public String specCount;//规格数量
    public String specUnit;//规格单位
    public String goodsDesc;//商品描述
    public String goodsCount;//商品数量
    public String goodsImg;//商品图片地址
    public String shopId;//商铺ID
    public String goodsPrice;//价格
    public String goodsName;//商品名称
    public String orderSource;
    public String isRefund; //是否支持退款 1支持 2不支持
    public String getSpecImg(){
        return (TextUtils.isEmpty(specImgSrc)?(TextUtils.isEmpty(specImg)?goodsImg:specImg):specImgSrc);
    }
    //商品价格
    public String getGoodsPrice(){
        return marketPrice;
    }
    //市场价格
    public String getMarketPrice(){
        return TextUtils.isEmpty(specPrice)?goodsPrice:specPrice;
    }
    //返回规格
    public String getGoodsUnit(){
        return TextUtils.isEmpty(specUnit)?goodsUnit:specUnit;
    }

}

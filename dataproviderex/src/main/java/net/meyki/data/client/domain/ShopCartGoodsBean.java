package net.meyki.data.client.domain;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * 购物车商品列表
 * Created by lxy on 2016/7/4.
 */
public class ShopCartGoodsBean implements Serializable{
    /*
    * */
    public String gallerys;	//
    public String gallerysDetail;//
    public String isSupportLogistic;	//	是否支持物流配送
    public String loginName;		//
    public String logisticDesc;	//
    public String merchantDesc;	//
    public String shopImg;//
    public String warnStock;//
    public String invoiceDesc;//
    public String isMerchant;//
    public String isPhoneOrder;//
    public String userId;//
    public String isDelivery;//
    public String isOrder;//
    public String goodsId;
    public String goodsSpec;//商品信息
    public String goodsStock;//商品库存
    public String saleCount;//销售量
    public String expressPrice;//快递费用
    public String isOnline;//是否支持在线购买
    public String isShipping;//是否支持配送
    public String shippingDes;//配送描述
    public String isInvoice;//是否支持发票
    public String warnStork;//	警告库存
    public String isRefund;//商品数量
    public String shopType;//店铺类型
    public String goodsName;//	商品ID  /*推荐新增里面为数量*/
    public String marketPrice;//商品市场价
    public String shopPrice;//商品销售价
    public String shopName;//店铺名称
    public String goodsDesc;//	商品描述
    public String goodsNum;//商品描述
    public String goodsImg;//	商品图片
    public String shopingCartGoodsId;//商品主键
    public String isChoose;//是否选择
    public boolean isEdit;// 是否可编辑
    /*推荐新增*/
    public String goodsUnit;//商品单位
    public String status;//0不支持在线  1 配送 2 到店 3电话预约
    public String flag;//1有折扣 2无折扣
    public String isNewGoods;//0 1

    public String specCount;//库存
    public String specImg;
    public String specName;
    public String specPrice;
    public String specUnit;
    public String specId;
    public String discount;

    public int isValid;//商品是否有效 0：无效 1：有效

    //商品价格
    public String getGoodsPrice(){
        return marketPrice;
    }
    //市场价格
    public String getMarketPrice(){
        return TextUtils.isEmpty(specPrice)?shopPrice:specPrice;
    }
    //规格单位
    public String getGoodsUnit(){
        return TextUtils.isEmpty(specUnit)?goodsUnit:specUnit;
    }

}

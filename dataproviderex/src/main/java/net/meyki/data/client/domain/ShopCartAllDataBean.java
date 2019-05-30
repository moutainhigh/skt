package net.meyki.data.client.domain;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/7.
 */
public class ShopCartAllDataBean implements Serializable {
    public String gallerys;	//
    public String gallerysDetail;//
    public String isSupportLogistic;	//	是否支持物流配送
    public String loginName;		//
    public String logisticDesc;	//
    public String merchantDesc;	//
    public String shopImg;//
    public String status;	//
    public String warnStock;//
    public String goodsSpec;//商品信息
    public String goodsStock;//商品库存
    public String saleCount;//销售量
    public String expressPrice;//快递费用
    public String warnStork;//	警告库存
    public String shopId;//店铺ID
    public String isOnline;//是否支持在线购买
    public String isShipping;//是否支持配送
    public String shippingDes;//配送描述
    public String shopName;//店铺名称
    public String shopType;//店铺类型：1普通店铺，2自营商铺
    public String isInvoice;//是否支持发票
    public String isShopChoose;//
    public boolean isShopSelect;//商铺是否显示
    public boolean isShow;//商家标题是否显示
    public boolean isLinShow;//分割线是否显示
    public String invoiceDesc;//
    public String isMerchant;//
    public String goodsUnit;//
    public String isPhoneOrder;//
    public String userId;//
    public String isDelivery;//
    public String isOrder;//
    public String cate;//
    public String deliveryDesc;//配送描述
    public String operatorsId;//特色館id


    public String goodsId;
    public String goodsName;//	商品ID
    public String marketPrice;//商品市场价
    public String shopPrice;//商品销售价
    public String goodsDesc;//	商品描述
    public String goodsNum;//商品描述
    public String goodsImg;//	商品图片
    public String shopingCartGoodsId;//商品主键
    public String isChoose;//是否选择
    public boolean isEdit;// 是否可编辑
    public String isRefund;//是否支持退订单

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

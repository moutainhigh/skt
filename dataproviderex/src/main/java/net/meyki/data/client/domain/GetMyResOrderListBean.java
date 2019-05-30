package net.meyki.data.client.domain;

import android.text.TextUtils;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class GetMyResOrderListBean {
    public String shopName;//				out		String								YES		店铺名称
    public String goodsSrc;//				out		String								YES		图片地址
    public String goodsName;//				out		String								YES		名称
    public String goodsId;//				out		String								YES		商品ID
    public String shopId;//				out		String								YES		店铺ID
    public String marketPrice;//				out		String								YES		市场价
    public String goodsPrice;//				out		String								YES		商品价格
    public String orderId;

    public String orderSn;
    public boolean isShopChoose;//
    public boolean isShowShop;//商铺是否显示
    public boolean isShowEdit;
    public boolean isChoose;//是否选中
    public boolean isLinShow;//分割线是否显示
    public String shopCate;
    public String goodsUnit;//商品單位

    public String specCount;
    public String specImg;
    public String specName;
    public String specPrice;
    public String specUnit;
    public String specId;

    //商品价格
    public String getGoodsPrice(){
        return marketPrice;
    }
    //市场价格
    public String getMarketPrice(){
        return TextUtils.isEmpty(specPrice)?goodsPrice:specPrice;
    }
    //规格单位
    public String getGoodsUnit(){
        return TextUtils.isEmpty(specUnit)?goodsUnit:specUnit;
    }
}

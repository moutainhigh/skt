package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *  购物车列表
 * Created by lxy on 2016/7/4.
 */
public class ShopCartBean implements Serializable{
    public String shopId;//店铺ID
    public String isOnline;//是否支持在线购买
    public String isShipping;//是否支持配送
    public String shippingDes;//配送描述
    public String isInvoice;//是否支持发票
    public String shopName;//店铺名称
    public String shopType;//店铺类型：1普通店铺，2自营商铺
    public String isChoose;//
    public String discount; //折扣
    public String operatorsId;//特色館id
    public String cate;
    public List<ShopCartGoodsBean> goodsList = new ArrayList<ShopCartGoodsBean>();
}

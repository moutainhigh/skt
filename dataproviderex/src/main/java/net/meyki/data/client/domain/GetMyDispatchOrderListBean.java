package net.meyki.data.client.domain;

/**
 * Created by meiqi on 2016/9/22.
 */
public class GetMyDispatchOrderListBean {

    public String shopName;//				out		String								YES		店铺名称
    public String goodsSrc;//				out		String								YES		图片地址
    public String goodsName;//				out		String								YES		名称
    public String goodsId;//				out		String								YES		商品ID
    public String shopId;//				out		String								YES		店铺ID
    public String marketPrice;//				out		String								YES		市场价
    public String goodsPrice;//				out		String								YES		商品价格
    public String orderId;
    public String goodsCount;               //单件商品数量    2016-9-22 ZDB  增加商户配送页面 接口调试
    public String goodsUnit;          // 商品单位    2016-9-22 ZDB  增加商户配送页面 接口调试
    public int totalRecords;       //该店铺所选商品总数   2016-9-22 ZDB  增加商户配送页面 接口调试
    public String isTag;
    public String orderSn;
    public boolean isShopChoose;//
    public boolean isShowShop;//商铺是否显示
    public boolean isShowEdit;
    public boolean isChoose;//是否选中
    public boolean isLinShow;//分割线是否显示
    public String shopCate;
    public String specName;

}

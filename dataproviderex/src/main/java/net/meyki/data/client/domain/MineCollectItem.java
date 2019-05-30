package net.meyki.data.client.domain;

/**
 * Created by Administrator on 2016/5/17
 */
public class MineCollectItem {

    public String collectId;//收藏主键
    public String collectIdentity;//收藏ID(商品ID)
    public String collectType;//1 区县 3 商品
    public String flag;// 商品上下架
    public String operatorsId;// 平台管理员主键
    public String districtLogo;// 区县logo
    public String districtDesc;//区县简介
    public String orderSource;//是否参与活动0 否 1 是
    public String proxyId;// 代理商ID （区县主键）
    public String shopId;// 店铺ID
    public String shopName;//店铺名称
    public String goodsImg;//店铺图片
    public String goodsName;//商品名称
    public String goodsId;//商品ID
    public String shopPrice;//商品价格
    public String specPrice;//规格价格
    public String specImg;//规格图片
    public String showName;
    public String showImg;
    public String showDesc;
    public String cate;




    public boolean isShopChoose;//是否处于店铺被选中状态
    public boolean isChoose;//是否处于单个商品被选中状态
    public int title = 0;
}

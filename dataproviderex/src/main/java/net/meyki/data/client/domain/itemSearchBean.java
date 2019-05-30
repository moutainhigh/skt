package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 邹德滨 2016-12-13 易家二级页面 item属性
 * Created by Administrator on 2016/12/13.
 */

public class itemSearchBean implements Serializable {

    public String attrCatId ;//
    public String createTime;
    public String deliverPrice;//
    public String districtHistory;
    public String districtLogo;
    public String endTime;//抢购结束时间
    public String featureDesc;//特色馆描述
    public String featureId;//特色馆id
    public String featureName;//特色馆名称
    public String featureSrc;//特色馆图片
    public String goodsDesc;
    public String goodsDetail;
    public String goodsId;//商品id
    public String goodsImg;//商品图片
    public String goodsList;
    public String goodsName;//商品名称
    public String goodsPrice;//商品价格
    public String goodsSlideList;
    public String goodsSrc;
    public String goodsUnit;//商品单位
    public String isCollect;
    public String isDiscount;
    public String isNew;//是否新品:0:是；1：否
    public String itemId;//栏目id
    public String itemName;//栏目名称
    public String itemNum;
    public String leftTime;//系统时间
    public String origin;//产地
    public String price;
    public String proxyId;
    public String proxyName;
    public String sendTime;//发货时间
    public String shopId;
    public String shopName;
    public String shopPrice;
    public String special;
    public String templateUrl;
    public String orderSource; //0/1
    public String goodsSpecCount;
    public String isConsumer; //0无 1有
    public String defaultSpecName;// 商品规格
    @Override
    public String toString() {
        return "itemSearchBean{" +
                "attrCatId" + attrCatId +
                "createTime" + createTime +
                "deliverPrice"+deliverPrice+
                "districtHistory"+ districtHistory +
                "districtLogo"+districtLogo +
                "endTime" + endTime +
                "featureId" + featureId +
                "featureName" + featureName +
                "featureSrc" + featureSrc +
                "featureDesc" + featureDesc +
                "goodsDesc" + goodsDesc +
                "goodsDetail" + goodsDetail +
                "goodsName" + goodsName +
                "goodsId" + goodsId +
                "goodsImg" + goodsImg +
                "goodsPrice" + goodsPrice +
                "goodsUnit" + goodsUnit +
                "goodsList" + goodsList +
                "goodsSlideList" + goodsSlideList +
                "goodsSrc" + goodsSrc +
                "isCollect" + isCollect +
                "isDiscount" + isDiscount +
                "isNew" + isNew +
                "itemId" + itemId +
                "itemName" + itemName +
                "itemNum" + itemNum +
                "leftTime" + leftTime +
                "origin" + origin +
                "price" + price +
                "proxyId" + proxyId +
                "proxyName" + proxyName +
                "sendTime" + sendTime +
                "shopId" + shopId +
                "shopName" + shopName +
                "shopPrice" + shopPrice +
                "special" + special +
                "templateUrl" + templateUrl +"}";


    }
}

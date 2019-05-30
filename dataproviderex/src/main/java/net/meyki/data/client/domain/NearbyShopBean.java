package net.meyki.data.client.domain;

/**
 * Created by lxy on 2016/7/9.
 */
public class NearbyShopBean {
    /*
    * "createTime":"",
            "creater":"",
            "distance":"905",
            "isSend":"",
            "modifier":"",
            "modifyTime":"",
            "os":"",
            "shippingDes":"购物满59",
            "shopActiveType":"3",
            "shopAddress":"雁塔区电子城街道融鑫路1号",
            "shopDesc":"",
            "shopId":"0204d82bf25f41fd8716caa5e239a0c1",
            "shopImg":"http://i1.meyki.net/communitycphoto/52c155065c654029b8ed4f62d4b2ffdd.jpg",
            "shopName":"嘹咋咧",
            "shopType":"2",
            "tId":"205",
            "tag":""*/
    public String createTime;
    public String creater;
    public String distance;//				out		String								YES		距离
    public String isSend;//				out		String								YES		是否支持配送
    public String modifier;
    public String modifyTime;
    public String os;
    public String shippingDes;
    public String shopActiveType;//	array('1','2','3','4','5'),//说明：0福利，1折扣，2会员，3新品，4满减，5优惠券
    public String shopAddress;//		商铺地址
    public String isShipping;//				out		String								YES		是否支持配送
    public String shopDesc;
    public String shopId;//			店铺id
    public String shopImg;//				店铺图片
    public String shopName;//				店铺名称
    public String shopType;//		商铺类型 ：生鲜蔬果…
    public String tId;
    public String tag;
    public String cate;//
    public String shopTel;// 店铺分类类别（1：优质店铺，2：周末去哪儿）
}

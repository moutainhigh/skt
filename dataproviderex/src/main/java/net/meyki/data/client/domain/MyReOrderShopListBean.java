package net.meyki.data.client.domain;

import android.text.TextUtils;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class MyReOrderShopListBean {

    public String status;//				YES		订单状态1:待付款；2:待发货；3:已发货；4:已签收；5:退货中；6:已退货；7:拒绝退货；8:退款中；9:已退款；10:已取消；11:已超时 12 拒绝退款;13 客户端已删除，14：未处理；15：已处理
    public String shopName;//									YES		店铺名称
    public String shopId;//										YES		店铺ID
    public String shopCate;//										YES		1：优质店铺 2：周末去哪
    public String orderSn;//										YES		订单编号
    public String orderId;//								YES		订单id
    public String goodsSrc;//											YES		图片地址
    public String goodsPrice;//										YES		价格
    public String goodsName;//										YES		名称
    public String goodsId;//											YES		商品ID
    public String goodsCount="0";//											YES		商品数量
    public String createTime;//									YES		下单时间
    public String marketPrice;//市场价
    public String shopCat;//											YES		1：优质店铺 2：周末去哪
    public boolean isShowShop;//是否显示商铺信息
    public long surplusTime;//剩余时间（单位秒）
    public String minute;
    public String second;
    public String operatorsId;

    public String refondId;  //退款id 当该订单有退款操作时返回  OPTION
    public String refondStatus; //退款状态 0：退款中；1：同意退款申请；2：同意退款；3：拒绝退款 返回为空时则没有退款操作 OPTION
    public String applyType; //退货申请类型:0:退款；1：退货退款 OPTION
    public String applyTime; //申请提交时间  OPTION
    public String refondFee; //退款金额
    public String deadLine; // 到期时间 OPTION

    public boolean isShopChoose;//
    public boolean isShowEdit;
    public boolean isChoose;//是否选中
    public String goodsUnit;//商品單位

    public String specCount;
    public String specImg;
    public String specImgSrc;
    public String specName;
    public String specPrice;
    public String specUnit;
    public String specId;
    public String sysTime;//提现发货时间
    public String saveTime;//上次提醒时间
    public boolean isClick;//是否可以近行点击
    public String isConsumer	;		//是否有抵用金1：是2：否
    public String consumerClass	;		//抵用券类型;0:美齐；1：大唐
    public String consumer		;		//抵用金额(提交订单时已计入金额)
    public String expressPrice;         //运费
    public  int sendedCount;		//int	YES	已发货数量
    public String getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(String expressPrice) {
        this.expressPrice = expressPrice;
    }

    //获取商品价格
    public String getGoodsPrice(){
        return marketPrice;
    }
    //获取市场价格
    public String getMarketPrice(){
        return TextUtils.isEmpty(specPrice)?goodsPrice:specPrice;
    }
    //获取规格单位
    public String getGoodsUnit(){
        return TextUtils.isEmpty(specUnit) ? goodsUnit : specUnit;
    }

    @Override
    public String toString() {
        return "MyReOrderShopListBean{" +
                "status='" + status + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopId='" + shopId + '\'' +
                ", shopCate='" + shopCate + '\'' +
                ", orderSn='" + orderSn + '\'' +
                ", orderId='" + orderId + '\'' +
                ", goodsSrc='" + goodsSrc + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", goodsCount='" + goodsCount + '\'' +
                ", createTime='" + createTime + '\'' +
                ", marketPrice='" + marketPrice + '\'' +
                ", shopCat='" + shopCat + '\'' +
                ", isShowShop=" + isShowShop +
                ", surplusTime=" + surplusTime +
                ", minute='" + minute + '\'' +
                ", second='" + second + '\'' +
                ", operatorsId='" + operatorsId + '\'' +
                ", refondId='" + refondId + '\'' +
                ", refondStatus='" + refondStatus + '\'' +
                ", applyType='" + applyType + '\'' +
                ", applyTime='" + applyTime + '\'' +
                ", refondFee='" + refondFee + '\'' +
                ", deadLine='" + deadLine + '\'' +
                ", isShopChoose=" + isShopChoose +
                ", isShowEdit=" + isShowEdit +
                ", isChoose=" + isChoose +
                ", goodsUnit='" + goodsUnit + '\'' +
                ", specCount='" + specCount + '\'' +
                ", specImg='" + specImg + '\'' +
                ", specImgSrc='" + specImgSrc + '\'' +
                ", specName='" + specName + '\'' +
                ", specPrice='" + specPrice + '\'' +
                ", specUnit='" + specUnit + '\'' +
                ", specId='" + specId + '\'' +
                ", sysTime='" + sysTime + '\'' +
                ", saveTime='" + saveTime + '\'' +
                ", isClick=" + isClick +
                ", isConsumer='" + isConsumer + '\'' +
                ", consumerClass='" + consumerClass + '\'' +
                ", consumer='" + consumer + '\'' +
                '}';
    }
}

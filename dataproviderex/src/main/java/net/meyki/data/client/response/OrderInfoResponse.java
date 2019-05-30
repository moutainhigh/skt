package net.meyki.data.client.response;


import net.meyki.data.client.domain.OrderGoodListItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chao on 2016/5/7.
 */
public class OrderInfoResponse extends JavaCommonResponse {
    //public OrderInfoItem data = new OrderInfoItem();
    public String orderSn;//订单编号
    public String orderId;//订单id
    public String status;//当前订单的状态 订单状态 1:待付款；2:待发货；3:已发货；4:已签收；5:退货中；6:已退货；7:拒绝退货；8:退款中；9:已退款；10:已取消；11:已超时
//    public String userId;
    public String totalPrice;//总价
    public String createTime;//下单时间
    public String logisticsNum;//物流单号
    public String logisticsMsg;//物流状态
    public String refondId;//退款id 当该订单有退款操作时返回
    public String refondStatus;//退款状态 0：退款中；1：同意退款申请；2：同意退款；3：拒绝退款；4：买家已发货，等待卖家确认收货 返回为空时则没有退款操作
    public String payTime;
    public String receiver;//联系人
    public String address;//收货地址
    public String mobile;//联系电话
    public String userMobile;
    public String county;
    public String province;
    public String city;
    public String deliverType; //（is_deliver=0时有效） 0-物流快递 1-商家配送 2 3预定订单
    public String deliverDesc;//配送条件
    public String isDeliver;//是否配送 0配送  1不支持配送
    public String certificate;//是否配送
    public String invoiceDesc;//发票备注
    public String isInvoce;//是否配送是否支持发票（0：不支持 1：到店索取，2：邮寄发票）
    public String common;//备注
    public String estimatedTime;//当订单为商家配送时，返回，表示预计到达时间
    public long surplusTime;//剩余时间（单位秒）
    public String isShow;//订单是否可以退款（超过三天就不可以退款）
    public String shipStatus;//1未发货；2：已发货
    public String consumer;	//out		String								YES		抵用金额
    public String consumerClass;	//out		String								YES		抵用券类型;0:美齐；1：大唐
    public String isConsumer;		//out		String								YES		是否有抵用金1：是2：否

    public String isCoupon; //是否使用代金券支付 1是2否
    public String coupon; //代金券支付的金额
    public String userId;//					out		String				YES		买家用户id
    public String shopUserId;//					out		String				YES		商家用户id
    public String userName;//					out		String				YES		用户名称
    public String tag;//					out		String				YES		               具体映射详见下方备注
    public String userPhoto;//					out		String				YES		用户头像
    public String loginName;//					out		String				YES		登陆名称
    public String shopTel;//商铺电话
    public String isCollect;//是否已关注 0否 1是

    public  int sendedCount;		//int	YES	已发货数量
    public List<OrderGoodListItem> goodsList = new ArrayList<OrderGoodListItem>();
    public String sysTime;//系统时间
    public String nowTime;//系统时间
//    public String tag;//店铺
    public String expressPrice;

}

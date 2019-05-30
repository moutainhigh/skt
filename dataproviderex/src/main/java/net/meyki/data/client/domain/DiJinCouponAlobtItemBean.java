package net.meyki.data.client.domain;

/**
 * 已收(消费)优惠卷列表
 * Created by lxy on 2017/3/28 0028.
 */
public class DiJinCouponAlobtItemBean {
    /**
     * */
    public String ticketName;//				out		String								YES		消费券名称
    public String shopId;//				out		String								YES		商家id
    public String shopName;//				out		String								YES		商家名称
    public String originType;//				out		String								YES		来源类型(1=手机发送,2=面对面,3=好友赠送,4=福袋,5=退款,6=消费)已消费消费卷数据时消费券来源 0：美齐  1：大唐
    public String amount;//				out		String								YES		消费券金额
    public String createTime;//				out		String								YES		创建时间
    public String orderId;//
    public String payPrice;//


    //已消费优惠卷多的参数
    public String amountUse;	//			out		String								YES		消费券消费总金额
    public String shopCount;	//			out		String								YES		购买商品数
    public String shopPrice;	//			out		String								YES		商品总价
    public String Price;		//		out		String								YES		实付金额
}

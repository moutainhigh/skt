package net.meyki.data.client.domain;

/**
 * 退货退款的列表实体类
 */
public class MyReturnGoodListBean {
    public String refounId;  //退款id 当该订单有退款操作时返回
    public String refoundStatus; //退款状态 0：退款中；1：同意退款申请；2：同意退款；3：拒绝退款 返回为空时则没有退款操作
    public String applyType; //退货申请类型:0:退款；1：退货退款
    public String applyTime; //申请提交时间
    public String DeadLine; // 到期时间
}

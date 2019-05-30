package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/1/14.
 */
public class RejectDetailBen implements Serializable {
    public String orderId;//订单id
    public String refondId;				//退款id
    public String orderStatus;				//货物状态
    public String applyReason;				//申请原因
    public String applyFee;				//申请金额
    public String refondStatus;				//退款状态 0：退款中；1：同意退款申请；2：同意退款；3：拒绝退款；4：买家已发货，等待卖家确认收货 返回为空时则没有退款操作
    public String refondType;				//退货申请类型:0:退款；1：退货退款
    public String status;				//0：同意1:拒绝
    public String verifyInfo;				//审核信息
    public String refondDesc;				//退款原因说明
    public String returnReceiver;				//退货信息收件人
    public String returnMobile;				//退货信息电话
    public String returnAddress;				//退货信息收货地址
    public String shopName	;			//店铺名称
    public String shopTel;				//店铺电话
    public String province;				//省
    public String city;				//市
    public String area;				//区
    public String address;				//地址
    public String postCode;				//邮编
    public String sendNum;				//快递单号
    public String sendLogistic;				//快递公司名称
    public String img1;				//凭证1
    public String img2;				//凭证2
    public String img3;				//凭证3
    public String refondApplyTime;				//退款申请时间
    public String refondEndTime;				//退款到期时间
    public String createTime;				//
    public String isReceived;				//1:未收到货0：收到货了
    public String refondSn;				//退款编号

    public String sysDate;//当前系统时间

}

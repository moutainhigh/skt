package net.meyki.data.concoupon.domain;

import java.io.Serializable;

/**
 * 项目名称：4.2.8
 * 类描述：明细实体类
 * 创建人：xyp
 * 创建时间：2017/3/24 10:38
 * 修改人：meyki-bear
 * 修改时间：2017/3/24 10:38
 * 修改备注：
 */

public class ConcouDetailBean implements Serializable{

    private String fkFundPoolId; //资金池id
    private String fkBatchId;//批次id
    private String fkTicketId;//消费券种类id
    private String ticketName;//易商用户or易家用户ID
    private String fkAuthUserId;//派发员类型(1=易商用户,2=易家用户)
    private String shopId;//商家id
    private String originType;//来源类型(1=手机发送,2=面对面)
    private String amount;//消费券金额
    private String state;//领取状态(1=已领取)
    private String createTime;//创建时间
    private String isRegister;//是否已注册？？
    private String receiveUserId;//领取用户id
    private String receiveUserTel;//领取用户手机号
    private String contactsTel;//联系人电话
    private String receiveTime;//领取时间

    public String getFkFundPoolId() {
        return fkFundPoolId;
    }

    public void setFkFundPoolId(String fkFundPoolId) {
        this.fkFundPoolId = fkFundPoolId;
    }

    public String getFkBatchId() {
        return fkBatchId;
    }

    public void setFkBatchId(String fkBatchId) {
        this.fkBatchId = fkBatchId;
    }

    public String getFkTicketId() {
        return fkTicketId;
    }

    public void setFkTicketId(String fkTicketId) {
        this.fkTicketId = fkTicketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getFkAuthUserId() {
        return fkAuthUserId;
    }

    public void setFkAuthUserId(String fkAuthUserId) {
        this.fkAuthUserId = fkAuthUserId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getOriginType() {
        return originType;
    }

    public void setOriginType(String originType) {
        this.originType = originType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getIsRegister() {
        return isRegister;
    }

    public void setIsRegister(String isRegister) {
        this.isRegister = isRegister;
    }

    public String getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public String getReceiveUserTel() {
        return receiveUserTel;
    }

    public void setReceiveUserTel(String receiveUserTel) {
        this.receiveUserTel = receiveUserTel;
    }

    public String getContactsTel() {
        return contactsTel;
    }

    public void setContactsTel(String contactsTel) {
        this.contactsTel = contactsTel;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }
}

package net.meyki.data.concoupon.domain;

import java.io.Serializable;

/**
 * 福袋是否被领取的实体类
 * Created by Knight on 2017/3/30.
 */

public class SendConCouponInfoBean implements Serializable {

    private String fkFundPoolId;//资金池ID
    private String batchId;//批次ID
    private String fkTicketId;//消费券种类ID
    private String loginName;//派发人员账号
    private String authUserId;//易商用户or易家用户ID
    private String authType;//派发员类型
    private String amountTotal;//消费券总金额
    private String authAmount;//当前批次消费券授权信息
    private String receiveAmount;//当前批次消费券已派发金额
    private String receiveUserCount;//领取用户数
    private String state;//状态（0开启 1 禁用 2删除）
    private String contacts;//联系人
    private String contactsTel;//联系人电话
    private String createTime;//创建日期

    public String getFkFundPoolId() {
        return fkFundPoolId;
    }

    public void setFkFundPoolId(String fkFundPoolId) {
        this.fkFundPoolId = fkFundPoolId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getFkTicketId() {
        return fkTicketId;
    }

    public void setFkTicketId(String fkTicketId) {
        this.fkTicketId = fkTicketId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getAuthUserId() {
        return authUserId;
    }

    public void setAuthUserId(String authUserId) {
        this.authUserId = authUserId;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(String amountTotal) {
        this.amountTotal = amountTotal;
    }

    public String getAuthAmount() {
        return authAmount;
    }

    public void setAuthAmount(String authAmount) {
        this.authAmount = authAmount;
    }

    public String getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(String receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public String getReceiveUserCount() {
        return receiveUserCount;
    }

    public void setReceiveUserCount(String receiveUserCount) {
        this.receiveUserCount = receiveUserCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactsTel() {
        return contactsTel;
    }

    public void setContactsTel(String contactsTel) {
        this.contactsTel = contactsTel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}

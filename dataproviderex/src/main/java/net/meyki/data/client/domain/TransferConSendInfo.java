package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/7.
 */
public class TransferConSendInfo implements Serializable {

    private String account; //领取人的昵称
    private String amount; //消费券金额
    private String createTime; //消费券领取时间
    private String mobile; //消费券领取方的phone

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}

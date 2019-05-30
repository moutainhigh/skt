package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/1/19.
 */

public class BankCardListBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8123878232493371476L;
    private String bankId;
    private String userId;
    private String bankNo;
    private String bankUser;
    private String bankName;
    private String createTime;
    private String logo;
    private String isDefault;
    public String getBankId() {
        return bankId;
    }
    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getBankNo() {
        return bankNo;
    }
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }
    public String getBankUser() {
        return bankUser;
    }
    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getIsDefault() {
        return isDefault;
    }
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }


}

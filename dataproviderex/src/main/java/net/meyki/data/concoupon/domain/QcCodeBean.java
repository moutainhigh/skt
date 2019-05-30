package net.meyki.data.concoupon.domain;

import java.io.Serializable;

/**
 * Created by Knight on 2017/3/30.
 */

public class QcCodeBean implements Serializable {

    private String qcCodeUrl;
    private String originShopId;
    private String originUserId;
    private String counponAmount;
    private String qcCodeFlag;

    public String getQcCodeUrl() {
        return qcCodeUrl;
    }

    public void setQcCodeUrl(String qcCodeUrl) {
        this.qcCodeUrl = qcCodeUrl;
    }

    public String getOriginShopId() {
        return originShopId;
    }

    public void setOriginShopId(String originShopId) {
        this.originShopId = originShopId;
    }

    public String getOriginUserId() {
        return originUserId;
    }

    public void setOriginUserId(String originUserId) {
        this.originUserId = originUserId;
    }

    public String getCounponAmount() {
        return counponAmount;
    }

    public void setCounponAmount(String counponAmount) {
        this.counponAmount = counponAmount;
    }

    public String getQcCodeFlag() {
        return qcCodeFlag;
    }

    public void setQcCodeFlag(String qcCodeFlag) {
        this.qcCodeFlag = qcCodeFlag;
    }
}

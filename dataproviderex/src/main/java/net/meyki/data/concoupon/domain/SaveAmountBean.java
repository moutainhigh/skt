package net.meyki.data.concoupon.domain;

import java.io.Serializable;

/**
 * 效验并保存消费券接口
 * Created by Knight on 2017/3/30.
 */

public class SaveAmountBean implements Serializable {
    public String luckybagPrice;
    public String shopId;
    public String shopName;
    public String shopType;
    private String agentUserId;//特产馆代理ID

    public String getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(String agentUserId) {
        this.agentUserId = agentUserId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getLuckybagPrice() {
        return luckybagPrice;
    }

    public void setLuckybagPrice(String luckybagPrice) {
        this.luckybagPrice = luckybagPrice;
    }


}

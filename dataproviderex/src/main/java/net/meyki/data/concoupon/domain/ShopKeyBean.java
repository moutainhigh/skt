package net.meyki.data.concoupon.domain;

import java.io.Serializable;

/**
 * 福袋-获取口令-获取店铺口令
 * Created by Knight on 2017/3/30.
 */

public class ShopKeyBean implements Serializable {
    private String isHasKey;//是否有口令
    private String luckbagKey;//福袋口令
    private String keyOriginType;//福袋口令来源

    public String getIsHasKey() {
        return isHasKey;
    }

    public void setIsHasKey(String isHasKey) {
        this.isHasKey = isHasKey;
    }

    public String getLuckbagKey() {
        return luckbagKey;
    }

    public void setLuckbagKey(String luckbagKey) {
        this.luckbagKey = luckbagKey;
    }

    public String getKeyOriginType() {
        return keyOriginType;
    }

    public void setKeyOriginType(String keyOriginType) {
        this.keyOriginType = keyOriginType;
    }
}

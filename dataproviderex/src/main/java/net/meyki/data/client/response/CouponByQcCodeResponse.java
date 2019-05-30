package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Daimhim on 2017/4/7.
 */

public class CouponByQcCodeResponse extends JavaCommonResponse {
    private String counponAmount;		//领券金额
    private String counponType;		//派券方标识： 0:美齐 1：大唐
    private String counponShopName;		//派券方名称
    private String shoppingMallId;		//商城ID
    private String shoppingMallName;		//商城名称

    public String getCounponAmount() {
        return counponAmount;
    }

    public void setCounponAmount(String counponAmount) {
        this.counponAmount = counponAmount;
    }

    public String getCounponType() {
        return counponType;
    }

    public void setCounponType(String counponType) {
        this.counponType = counponType;
    }

    public String getCounponShopName() {
        return counponShopName;
    }

    public void setCounponShopName(String counponShopName) {
        this.counponShopName = counponShopName;
    }

    public String getShoppingMallId() {
        return shoppingMallId;
    }

    public void setShoppingMallId(String shoppingMallId) {
        this.shoppingMallId = shoppingMallId;
    }

    public String getShoppingMallName() {
        return shoppingMallName;
    }

    public void setShoppingMallName(String shoppingMallName) {
        this.shoppingMallName = shoppingMallName;
    }
}

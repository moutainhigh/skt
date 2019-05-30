package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

/**
 * Created by Administrator on 2017/4/7.
 */
public class GetLuckyBagDetailResponse extends JavaCommonResponse {

    private String shopId; //店铺ID
    private String luckybagId; //福袋ID
    private String amountTotal; // 福袋总金额
    private String luckybagCount; //福袋总数量
    private String luckybagPrice; //福袋单价
    private String isHaskey; //是否有口令：N:否 Y:是
    private String luckybagKey; //口令
    private String keyOriginType; //福袋口令来源(1=线上,2=线下)
    private String state; //福袋状态(0=进行中,1=已领取,2=已撤回)
    private String luckybagReceiveCount; //已领数量
    private String amountUse; // 已领金额
    private String createDate; //创建时间

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getLuckybagId() {
        return luckybagId;
    }

    public void setLuckybagId(String luckybagId) {
        this.luckybagId = luckybagId;
    }

    public String getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(String amountTotal) {
        this.amountTotal = amountTotal;
    }

    public String getLuckybagCount() {
        return luckybagCount;
    }

    public void setLuckybagCount(String luckybagCount) {
        this.luckybagCount = luckybagCount;
    }

    public String getLuckybagPrice() {
        return luckybagPrice;
    }

    public void setLuckybagPrice(String luckybagPrice) {
        this.luckybagPrice = luckybagPrice;
    }

    public String getIsHaskey() {
        return isHaskey;
    }

    public void setIsHaskey(String isHaskey) {
        this.isHaskey = isHaskey;
    }

    public String getLuckybagKey() {
        return luckybagKey;
    }

    public void setLuckybagKey(String luckybagKey) {
        this.luckybagKey = luckybagKey;
    }

    public String getKeyOriginType() {
        return keyOriginType;
    }

    public void setKeyOriginType(String keyOriginType) {
        this.keyOriginType = keyOriginType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLuckybagReceiveCount() {
        return luckybagReceiveCount;
    }

    public void setLuckybagReceiveCount(String luckybagReceiveCount) {
        this.luckybagReceiveCount = luckybagReceiveCount;
    }

    public String getAmountUse() {
        return amountUse;
    }

    public void setAmountUse(String amountUse) {
        this.amountUse = amountUse;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}

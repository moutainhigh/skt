package net.meyki.data.concoupon.domain;

import net.meyki.data.share.domain.Dynamic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 项目名称：4.2.0
 * 类描述：
 * 创建人：meyki-bear
 * 创建时间：2017/2/14 19:48
 * 修改人：meyki-bear
 * 修改时间：2017/2/14 19:48
 * 修改备注：
 */

public class LuckBagBean implements Serializable {
    private String fkTicketId; //消费券种类ID
    private String luckybagId; //福袋ID
    private String shopId; //商家Id
    private String shopName; //商家名称
    private String luckybagLat; //商家坐标纬度
    private String luckybagLon; //商家坐标经度
    private String shopDetailAddress; //商家详细地址
    private String shopImg; //店铺图片
    private String amountTotal; //福袋总金额
    private String luckybagCount; //福袋数量
    private String luckybagPrice; //福袋单价
    private String state; //福袋状态 (0=进行中,1=已领完,2=已撤回)
    private String isHaskey; //是否有口令
    private String luckybagKey;//福袋口令
    private String keyOriginType; //口令来源((1=线上,2=线下))
    private String createUser; //福袋创建者
    private String createTime;//福袋创建时间
    public String ticketType; //消费券种类：0美齐1大唐
    private String agentUserId;//特产馆代理ID
    private String status; //是否已经领取 0未领取，1已领取

   private String userId; //	String	YES	用户id
   private String configId; //	String	YES	用户发券配置id
   private String latitude; //	String	YES	商铺经度
   private String longitude; //	String	YES	商铺维度

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(String agentUserId) {
        this.agentUserId = agentUserId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    private ArrayList<Dynamic> list; //领取动态

    public String getFkTicketId() {
        return fkTicketId;
    }

    public void setFkTicketId(String fkTicketId) {
        this.fkTicketId = fkTicketId;
    }

    public String getLuckybagId() {
        return luckybagId;
    }

    public void setLuckybagId(String luckybagId) {
        this.luckybagId = luckybagId;
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

    public String getLuckybagLat() {
        return luckybagLat;
    }

    public void setLuckybagLat(String luckybagLat) {
        this.luckybagLat = luckybagLat;
    }

    public String getLuckybagLon() {
        return luckybagLon;
    }

    public void setLuckybagLon(String luckybagLon) {
        this.luckybagLon = luckybagLon;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ArrayList<Dynamic> getList() {
        return list;
    }

    public void setList(ArrayList<Dynamic> list) {
        this.list = list;
    }

    public String getShopDetailAddress() {
        return shopDetailAddress;
    }

    public void setShopDetailAddress(String shopDetailAddress) {
        this.shopDetailAddress = shopDetailAddress;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String pUserId) {
        userId = pUserId;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String pConfigId) {
        configId = pConfigId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String pLatitude) {
        latitude = pLatitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String pLongitude) {
        longitude = pLongitude;
    }
}

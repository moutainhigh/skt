package net.meyki.data.client.domain;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/24.
 */
public class TransferConItem implements Serializable {
//    "amount":600,
//            "createTime":1492066930000,
//            "distributeUserAccount":"17319453369",
//            "distributeUserId":"2307e52005834d1083b686df108ab702",
//            "distributeUserName":"苹果@",
//            "fkGiveTicketId":"69e7a027bfa7429ca2939049fe021bac",
//            "giveHistoryId":"931be5e820c7451e8ad88907f3029b42",
//            "giveType":4,
//            "id":180,
//            "receiveUserAccount":"",
//            "receiveUserId":"",
//            "receiveUserName":"",
//            "remark":"定时任务处理!",
//            "ticketId":"14d63d470fa011e7a65f00163e0029fb",
//            "ticketName":"美齐抵金券",
//            "ticketType":"0",
//            "userId":""
    private int id;
    private String fkGiveTicketId;//互转id
    private String distributeUserId;//转增人,发红包用户ID
    private String distributeUserAccount;//派发人手机
    private String distributeUserName;//派发人名称
    private String receiveUserId;//被转增人，领红包人ID
    private String receiveUserAccount;//接收人手机
    private String receiveUserName;//接收人名称
    private String ticketName;//消费券名称
    private String ticketId;//消费券种类ID
    private int giveType;//1=转赠好友,2=转赠社群,3=领取,4=超时返还 9付券
    private float amount;//消费券金额
    private long createTime;//创建时间 是一个时间戳，在请求后被手动格式化，格式化后放入createTimeFormate
    private String createTimeFormate;//格式化后的创建时间
    private String remark;//json字符串，判断是单聊还是群聊
    private String ticketType; //0美齐 1大唐
    private String giveHistoryId;
    //下面两个是reamrk,json的解析值
    private String orgin; //0社群，1好友
    private String orginId;//没用过
    private String shopImg;//商铺Logo

    public String getGiveHistoryId() {
        return giveHistoryId;
    }

    public void setGiveHistoryId(String giveHistoryId) {
        this.giveHistoryId = giveHistoryId;
    }

    public String getFkGiveTicketId() {
        return fkGiveTicketId;
    }

    public void setFkGiveTicketId(String fkGiveTicketId) {
        this.fkGiveTicketId = fkGiveTicketId;
    }

    public String getDistributeUserId() {
        return distributeUserId;
    }

    public void setDistributeUserId(String distributeUserId) {
        this.distributeUserId = distributeUserId;
    }

    public String getDistributeUserAccount() {
        return distributeUserAccount;
    }

    public void setDistributeUserAccount(String distributeUserAccount) {
        this.distributeUserAccount = distributeUserAccount;
    }

    public String getDistributeUserName() {
        return distributeUserName;
    }

    public void setDistributeUserName(String distributeUserName) {
        this.distributeUserName = distributeUserName;
    }

    public String getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(String receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    public String getReceiveUserAccount() {
        return receiveUserAccount;
    }

    public void setReceiveUserAccount(String receiveUserAccount) {
        this.receiveUserAccount = receiveUserAccount;
    }

    public String getReceiveUserName() {
        return receiveUserName;
    }

    public void setReceiveUserName(String receiveUserName) {
        this.receiveUserName = receiveUserName;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

//    public String getGiveType() {
//        return giveType;
//    }
//
//    public void setGiveType(String giveType) {
//        this.giveType = giveType;
//    }
//
//    public String getAmount() {
//        return amount;
//    }
//
//    public void setAmount(String amount) {
//        this.amount = amount;
//    }
//
//    public String getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(String createTime) {
//        this.createTime = createTime;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGiveType() {
        return giveType;
    }

    public void setGiveType(int giveType) {
        this.giveType = giveType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrgin() {
        if(TextUtils.isEmpty(orgin)){
            try {
                JSONObject obj = new JSONObject(remark);
                orgin =obj.optString("orgin");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public String getOrginId() {

        if(TextUtils.isEmpty(orginId)){
            try {
                JSONObject obj = new JSONObject(remark);
                orgin =obj.optString("orginId");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return orginId;
    }

    public void setOrginId(String orginId) {
        this.orginId = orginId;
    }

    public String getCreateTimeFormate() {
        return createTimeFormate;
    }

    public void setCreateTimeFormate(String createTimeFormate) {
        this.createTimeFormate = createTimeFormate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }
}

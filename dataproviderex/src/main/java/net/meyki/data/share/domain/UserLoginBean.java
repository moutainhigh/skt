package net.meyki.data.share.domain;

import java.io.Serializable;

/**
 * 用户登录成功响应的bean
 *
 * @author liyc
 */
public class UserLoginBean implements Serializable {
    private String userId;//用户id
//    private String shopId;//店铺id
    private String total;//可用金额
   // private String userSex;//性别
//    private String showName;//会员名称
//    private String image;//用户头像
    private String token;//令牌
    private String qrCode;//二维码
    private String status;//是否有支付密码 0 没有 1 有


    private String userLogo; //	String	是	用户头像
    private String phone; //	String	是	手机号
    private String sex; //	String	是	用户性别 0:男,1:女
    private String nickName; //	String	是	昵称
    private String userSig;//	String	是	用户登录云通讯的签名
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUserSex() {
        return sex;
    }

    public void setUserSex(String userSex) {
        this.sex = userSex;
    }

    public String getShowName() {
        return nickName;
    }

    public void setShowName(String showName) {
        this.nickName = showName;
    }

    public String getImage(){
        return userLogo;
    }
    public void setImage(String image){
        this.userLogo = image;
    }

    public String getUserSig() {
        return userSig;
    }

    public void setUserSig(String pUserSig) {
        userSig = pUserSig;
    }
    //    public String getShopId() {
//        return shopId;
//    }
//
//    public void setShopId(String shopId) {
//        this.shopId = shopId;
//    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}

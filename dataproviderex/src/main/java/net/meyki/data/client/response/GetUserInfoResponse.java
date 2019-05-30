package net.meyki.data.client.response;

import net.meyki.data.json.JavaCommonResponse;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/4/28.
 */
public class GetUserInfoResponse extends JavaCommonResponse implements Serializable {
    public String total;  //		String	OPTION	可用金额
    public String userSex;  //		String	OPTION	性别 0女 1男
    public String qrCode;  //		String	OPTION	二维码
    public String showName;  //		String	OPTION	会员名称
    public String image;  //		String	OPTION	用户头像
    public String cashCouponFlag;  //		String	OPTION	派券管理标识 0：无 1：有
    public String collectCount;  //		String	OPTION	收藏数量
    public String followerCount;  //		String	OPTION	关注数量
    public String footprintCount;  //		String	OPTION	足迹数量
    public String cashAmountTotal;//抵金券总额

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCashCouponFlag() {
        return cashCouponFlag;
    }

    public void setCashCouponFlag(String cashCouponFlag) {
        this.cashCouponFlag = cashCouponFlag;
    }

    public String getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(String collectCount) {
        this.collectCount = collectCount;
    }

    public String getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(String followerCount) {
        this.followerCount = followerCount;
    }

    public String getFootprintCount() {
        return footprintCount;
    }

    public void setFootprintCount(String footprintCount) {
        this.footprintCount = footprintCount;
    }

    public String getCashAmountTotal() {
        return cashAmountTotal;
    }

    public void setCashAmountTotal(String cashAmountTotal) {
        this.cashAmountTotal = cashAmountTotal;
    }

    @Override
    public String toString() {
        return "GetUserInfoResponse{" +
                "total='" + total + '\'' +
                ", userSex='" + userSex + '\'' +
                ", qrCode='" + qrCode + '\'' +
                ", showName='" + showName + '\'' +
                ", image='" + image + '\'' +
                ", cashCouponFlag='" + cashCouponFlag + '\'' +
                ", collectCount='" + collectCount + '\'' +
                ", followerCount='" + followerCount + '\'' +
                ", footprintCount='" + footprintCount + '\'' +
                ", cashAmountTotal='" + cashAmountTotal + '\'' +
                '}';
    }
}

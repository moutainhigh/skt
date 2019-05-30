package net.meyki.data.share.domain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 项目名称：3.4.6_2
 * 类描述：空闲客服的实体类
 * 创建人：meyki-bear
 * 创建时间：2016/12/13 18:37
 * 修改人：meyki-bear
 * 修改时间：2016/12/13 18:37
 * 修改备注：
 */

public class FreeCustomerBean implements Parcelable {
    public String createTime;// 创建时间
    public String creater;//创建人
    public String csUserAccount;//客服账号(环信账号)
    public String csUserImg;//客服头像
    public String csUserLv;//客服等级(1=青铜,2=白银,3=黄金,4=钻石,…)
    public String csUserName;//客服姓名
    public String csUserNickname;//昵称
    public String csUserPwd;//	123456(密文)
    public String csUserState;//客服状态(1=停用,2=启用)
    public String csUserTel;//客服电话
    public String csUserType;//客服类型(1=易家,2=易商,3=易农)
    public String id;//客服ID
    public String modifier;//更新人
    public String modifyTime;//更新时间
    public String remark;//备注
    public String isOnline;
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public void setCsUserAccount(String csUserAccount) {
        this.csUserAccount = csUserAccount;
    }

    public void setCsUserImg(String csUserImg) {
        this.csUserImg = csUserImg;
    }

    public void setCsUserLv(String csUserLv) {
        this.csUserLv = csUserLv;
    }

    public void setCsUserName(String csUserName) {
        this.csUserName = csUserName;
    }

    public void setCsUserNickname(String csUserNickname) {
        this.csUserNickname = csUserNickname;
    }

    public void setCsUserPwd(String csUserPwd) {
        this.csUserPwd = csUserPwd;
    }

    public void setCsUserState(String csUserState) {
        this.csUserState = csUserState;
    }

    public void setCsUserTel(String csUserTel) {
        this.csUserTel = csUserTel;
    }

    public void setCsUserType(String csUserType) {
        this.csUserType = csUserType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getCreater() {
        return creater;
    }

    public String getCsUserAccount() {
        return csUserAccount;
    }

    public String getCsUserImg() {
        return csUserImg;
    }

    public String getCsUserLv() {
        return csUserLv;
    }

    public String getCsUserName() {
        return csUserName;
    }

    public String getCsUserNickname() {
        return csUserNickname;
    }

    public String getCsUserPwd() {
        return csUserPwd;
    }

    public String getCsUserState() {
        return csUserState;
    }

    public String getCsUserTel() {
        return csUserTel;
    }

    public String getCsUserType() {
        return csUserType;
    }

    public String getId() {
        return id;
    }

    public String getModifier() {
        return modifier;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.createTime);
        dest.writeString(this.creater);
        dest.writeString(this.csUserAccount);
        dest.writeString(this.csUserImg);
        dest.writeString(this.csUserLv);
        dest.writeString(this.csUserName);
        dest.writeString(this.csUserNickname);
        dest.writeString(this.csUserPwd);
        dest.writeString(this.csUserState);
        dest.writeString(this.csUserTel);
        dest.writeString(this.csUserType);
        dest.writeString(this.id);
        dest.writeString(this.modifier);
        dest.writeString(this.modifyTime);
        dest.writeString(this.remark);
    }

    public FreeCustomerBean() {
    }

    protected FreeCustomerBean(Parcel in) {
        this.createTime = in.readString();
        this.creater = in.readString();
        this.csUserAccount = in.readString();
        this.csUserImg = in.readString();
        this.csUserLv = in.readString();
        this.csUserName = in.readString();
        this.csUserNickname = in.readString();
        this.csUserPwd = in.readString();
        this.csUserState = in.readString();
        this.csUserTel = in.readString();
        this.csUserType = in.readString();
        this.id = in.readString();
        this.modifier = in.readString();
        this.modifyTime = in.readString();
        this.remark = in.readString();
    }

    public static final Creator<FreeCustomerBean> CREATOR = new Creator<FreeCustomerBean>() {
        @Override
        public FreeCustomerBean createFromParcel(Parcel source) {
            return new FreeCustomerBean(source);
        }

        @Override
        public FreeCustomerBean[] newArray(int size) {
            return new FreeCustomerBean[size];
        }
    };
}

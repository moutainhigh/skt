package net.meyki.data.client.response;

import net.meyki.data.client.domain.TransferConSendInfo;
import net.meyki.data.json.JavaCommonResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */
public class TransferConSendDetailResponse extends JavaCommonResponse {

    private String nickName; //消费券转赠方的昵称
    private String remark; //消费券转赠的备注
    private String avatar; //消费券转赠方的头像
    private String totalRecords; //总记录数
    private String givePrice; //转赠单价
    private String giveCount; //转赠总数量
    private String state; //状态(0=未领取,1=已领完，2=超时返还)
    private List<TransferConSendInfo> list = new ArrayList<>();

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<TransferConSendInfo> getList() {
        return list;
    }

    public void setList(List<TransferConSendInfo> list) {
        this.list = list;
    }

    public String getGivePrice() {
        return givePrice;
    }

    public void setGivePrice(String givePrice) {
        this.givePrice = givePrice;
    }

    public String getGiveCount() {
        return giveCount;
    }

    public void setGiveCount(String giveCount) {
        this.giveCount = giveCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

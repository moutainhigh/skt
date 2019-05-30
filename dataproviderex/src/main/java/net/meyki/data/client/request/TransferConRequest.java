package net.meyki.data.client.request;

import net.meyki.data.client.response.TransferConResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/3/28.
 */
public class TransferConRequest extends JavaCommonRequest {

    private String amount; //转增金额
    private String transferUserId; //转赠对方id
    private String communityId; //转赠群id
    private String ticketId; //转赠模式 0美齐/1大唐
    private String giveCount; //转赠数量 群为>=1,个人为1
    private String remark; //备注（可选）
    private String content; //消息结构体
    private String giveType;

    public TransferConRequest(){
        setMethodName("v4/luckybag/userapp/transfer");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<>();
        input.put("userId", userId);
        input.put("amount", amount);
        input.put("transferUserId", transferUserId);
        input.put("communityId", communityId);
        input.put("giveType", giveType);
        input.put("ticketId", ticketId);
        input.put("giveCount", giveCount);
        input.put("remark", remark);
        input.put("content", content);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        TransferConResponse cr = JacksonUtil.readValue(json, TransferConResponse.class);
        return cr;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setGiveType(String giveType) {
        this.giveType = giveType;
    }

    public void setGiveCount(String giveCount) {
        this.giveCount = giveCount;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTransferUserId(String transferUserId) {
        this.transferUserId = transferUserId;
    }

    public void setTicketType(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

}

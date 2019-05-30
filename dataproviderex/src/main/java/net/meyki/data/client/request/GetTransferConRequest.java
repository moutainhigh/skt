package net.meyki.data.client.request;

import net.meyki.data.client.response.GetTransferConResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.utils.JacksonUtil;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/3/28.
 */
public class GetTransferConRequest extends JavaCommonRequest {

    private String giveTicketId;
    private String ticketType;
    private String content;
    private String communityId;
    private String transferUserId;

    public GetTransferConRequest(){
        setMethodName("v4/luckybag/userapp/getLuckybag");
        request_method = JavaJsonNetwork.TYPE_POST_DATA;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<>();
        input.put("userId", userId);
        input.put("giveTicketId", giveTicketId);
        input.put("ticketId", ticketType);
        input.put("content", content);
        input.put("communityId", communityId);
        input.put("transferUserId", transferUserId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        GetTransferConResponse cr = JacksonUtil.readValue(json, GetTransferConResponse.class);
        return cr;
    }

    public void setGiveTicketId(String giveTicketId) {
        this.giveTicketId = giveTicketId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getTransferUserId() {
        return transferUserId;
    }

    public void setTransferUserId(String transferUserId) {
        this.transferUserId = transferUserId;
    }

}

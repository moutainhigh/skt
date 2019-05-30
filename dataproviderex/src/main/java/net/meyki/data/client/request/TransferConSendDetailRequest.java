package net.meyki.data.client.request;

import net.meyki.data.client.response.TransferConSendDetailResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/7.
 */
public class TransferConSendDetailRequest extends JavaCommonRequest {

    private String giveTicketId;

    public TransferConSendDetailRequest(){
        setMethodName("v4/luckybag/lookCouponDetailList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<>();
        input.put("userId", userId);
        input.put("giveTicketId", giveTicketId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        TransferConSendDetailResponse cr = JacksonUtil.readValue(json, TransferConSendDetailResponse.class);
        return cr;
    }

    public String getGiveTicketId() {
        return giveTicketId;
    }

    public void setGiveTicketId(String giveTicketId) {
        this.giveTicketId = giveTicketId;
    }

}

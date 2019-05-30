package net.meyki.data.client.request;

import net.meyki.data.client.response.GetTicketAmountResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/8.
 */
public class GetTicketAmountRequest extends JavaCommonRequest {

    private String ticketId;

    public GetTicketAmountRequest(){
        setMethodName("v4/ticket/getUserTicketAmount");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<>();
        input.put("userId", userId);
        input.put("ticketId", ticketId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        GetTicketAmountResponse cr = JacksonUtil.readValue(json, GetTicketAmountResponse.class);
        return cr;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

}

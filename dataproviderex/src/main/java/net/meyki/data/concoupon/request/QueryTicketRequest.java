package net.meyki.data.concoupon.request;

import net.meyki.data.concoupon.response.QueryTicketResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Knight on 2017/3/30.
 */

public class QueryTicketRequest extends JavaCommonRequest{
     public String fkFundPoolId;
    public String fkBatchId;
    public String originShopId;
    public  String originUserId;
    public  String originType;
    public  String userPhone;
    public  String userId;
    public  String amount;

    public QueryTicketRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/ticket/userapp/saveTicket");
    }


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = new HashMap<>();
        map.put("fkFundPoolId",fkFundPoolId);
        map.put("fkBatchId",fkBatchId);
        map.put("originShopId",originShopId);
        map.put("originUserId",originUserId);
        map.put("originType",originType);
        map.put("userPhone",userPhone);
        map.put("userId",userId);
        map.put("amount",amount);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        QueryTicketResponse qtr;
        qtr = JacksonUtil.readValue(json,QueryTicketResponse.class);
        return qtr;
    }
}

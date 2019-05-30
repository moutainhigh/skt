package net.meyki.data.concoupon.request;

import net.meyki.data.concoupon.response.QueryConMoneyAmountResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Knight on 2017/3/30.
 */

public class QueryConMoneyAmountRequest extends JavaCommonRequest {

    public  String fkFundPoolId;
    public String fkBatchId;
    public String amount;

    public QueryConMoneyAmountRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/ticket/userapp/queryTicketAmount");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = new HashMap<>();
        map.put("fkFundPoolId",fkFundPoolId);
        map.put("fkBatchId",fkBatchId);
        map.put("amount",amount);
        map.put("userId",userId);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        QueryConMoneyAmountResponse mar;
        mar = JacksonUtil.readValue(json, QueryConMoneyAmountResponse.class);
        return mar;
    }
}

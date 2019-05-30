package net.meyki.data.client.request;

import net.meyki.data.client.response.OrderInfoListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/4.
 */
public class OrderInfoListRequest extends JavaCommonRequest {

    public String orderId;

    public OrderInfoListRequest(){
        this.setMethodName("superiorProducts/getLogisticsInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = new HashMap<String, Object>();
        in.put("userId",userId);

        in.put("orderId",orderId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        OrderInfoListResponse lr = new OrderInfoListResponse();
        lr = JacksonUtil.readValue(json,OrderInfoListResponse.class);
        return lr;

    }
}

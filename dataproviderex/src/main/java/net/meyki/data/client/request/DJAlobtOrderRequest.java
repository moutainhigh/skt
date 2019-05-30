package net.meyki.data.client.request;

import net.meyki.data.client.response.DJAlobtOrderResponse;
import net.meyki.data.client.response.DiJinCouponAlobtResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 已消费消费卷订单详情
 * Created by lxy on 2017/4/7 0007.
 */
public class DJAlobtOrderRequest extends JavaCommonRequest {
    public DJAlobtOrderRequest(){
        setMethodName("v4/luckybag/getConsumeLuckybagOrderDetailList");
    }
    public String shopId;//						in		String				YES		店铺ID
    public String payAllNum;//						in		String				YES			支付订单序列号
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = initHashMap();
        input.put("shopId",shopId);
        input.put("payAllNum",payAllNum);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        DJAlobtOrderResponse response = new DJAlobtOrderResponse();
        response = JacksonUtil.readValue(json, DJAlobtOrderResponse.class);
        return response;
    }
}

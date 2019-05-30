package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import net.meyki.data.client.response.OrderInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 订单详细页面
 * @author liyc
 */
public class OrderInfoRequest extends JavaCommonRequest {

    public String orderId;

    public OrderInfoRequest() {
        this.setMethodName("v4/goodsInfo/orderInfoDetailV4");
        request_method = JavaJsonNetwork.TYPE_POST_DATA;
        requestType = OkHttpUtil.RequestType.POST;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param = initHashMap();
        param.put("orderId", orderId);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        OrderInfoResponse oir = JSON.parseObject(json, OrderInfoResponse.class);
        return oir;
    }

}

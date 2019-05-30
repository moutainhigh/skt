package net.meyki.data.client.request;

import net.meyki.data.client.domain.OrderInfoBean;
import net.meyki.data.client.domain.UserAddressItem;
import net.meyki.data.client.response.EditCartNumResponse;
import net.meyki.data.client.response.OrderManagerResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/5/4.
 */
public class OrderManagerRequest extends JavaCommonRequest {


    public OrderManagerRequest() {
        this.setMethodName("v3/orderInfo/getOrderInfoIndex");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = initHashMap();
        input.put("userId",userId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        OrderManagerResponse or = new OrderManagerResponse();
        or = FastJsonUtil.getObjectTFromJson(json, OrderManagerResponse.class);
        return or;
    }
}

package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.ReminderReponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 催单请求
 * Created by Daimhim on 2016/12/27.
 */
public class ReminderRequest extends JavaCommonRequest {

    public String orderId;

    public ReminderRequest() {
        setMethodName("v3/orderInfo/remindShip");
        request_method = JavaJsonNetwork.TYPE_PUT_DATA;
        requestType = OkHttpUtil.RequestType.PUT;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = initHashMap();
        input.put("orderId",orderId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        ReminderReponse reminderReponse = JSON.parseObject(json, ReminderReponse.class);
        return reminderReponse;
    }

}

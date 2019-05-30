package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.GetAmountResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * hl 2017-3-28
 * 消费劵首页
 */
public class GetAmountRequest extends JavaCommonRequest {

    public String password;

    public GetAmountRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/amount/userapp/getAmountIndex");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param = initHashMap();
        param.put("userId", userId);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetAmountResponse rs = JSON.parseObject(json, GetAmountResponse.class);
        return rs;
    }
}

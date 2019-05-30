package net.meyki.data.client.request;

import net.meyki.data.client.response.ExchangePageResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/1/19.
 */

public class ExchangePageRequest extends JavaCommonRequest {
    public ExchangePageRequest() {
        this.setMethodName("user/exchange");
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        ExchangePageResponse rr = new ExchangePageResponse();
        rr = JacksonUtil.readValue(json, ExchangePageResponse.class);
        return rr;
    }
    public String vcode;
    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> in = initHashMap();
        in.put("userId", userId);
        return in;
    }

}

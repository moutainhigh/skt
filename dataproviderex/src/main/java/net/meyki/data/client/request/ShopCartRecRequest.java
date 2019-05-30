package net.meyki.data.client.request;

import net.meyki.data.client.response.ShopCartRecResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class ShopCartRecRequest extends JavaCommonRequest {
    public ShopCartRecRequest(){
        this.setMethodName("v3/orderInfo/recommendGoodsList");
    }
    public String userId;

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = new HashMap<String, Object>();
        input.put("userId",userId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        ShopCartRecResponse sc = new ShopCartRecResponse();
        sc = JacksonUtil.readValue(json, ShopCartRecResponse.class);
        return sc;
    }
}

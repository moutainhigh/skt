package net.meyki.data.client.request;

import net.meyki.data.client.response.ApplyForReturnResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;
import net.meyki.data.utils.JacksonUtil;
import net.meyki.data.client.response.GetShopCartResponse;
import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/4.
 */
public class GetShopCartListRequest extends JavaCommonRequest {
    public GetShopCartListRequest(){
        this.setMethodName("v3/shop/queryShoppingList");
    }

    public int tag;//0:易家 1:易商
    public String os;//客户端类型
    public String userId;//用户id

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = initHashMap();
        input.put("userId",userId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetShopCartResponse sc = new GetShopCartResponse();
        sc = FastJsonUtil.getObjectTFromJson(json, GetShopCartResponse.class);
        return sc;
    }
}

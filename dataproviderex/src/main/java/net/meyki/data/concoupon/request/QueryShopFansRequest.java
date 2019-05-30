package net.meyki.data.concoupon.request;

import net.meyki.data.concoupon.response.QueryShopFansResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import org.json.JSONObject;

import java.util.HashMap;

/**
 *福袋-领取消费券-检测关注店铺状态
 * Created by Knight on 2017/3/30.
 */

public class QueryShopFansRequest extends JavaCommonRequest{
    public String userId;
    public String shopId;
    public String luckybagId; //福袋id
    public QueryShopFansRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/luckybag/userapp/queryShopSetFans");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = initHashMap();
        map.put("userId",userId);
        map.put("shopId",shopId);
        map.put("luckybagId",luckybagId);
        return map;

    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        JSONObject object = new JSONObject(json);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",object);
        QueryShopFansResponse cir;
        cir = JacksonUtil.readValue(jsonObject.toString(),QueryShopFansResponse.class);
        return cir;
    }
}

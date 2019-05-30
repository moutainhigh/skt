package net.meyki.data.concoupon.request;

import net.meyki.data.concoupon.response.QueryShopKeyResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 福袋-获取口令-获取店铺口令
 * Created by Knight on 2017/3/30.
 */

public class QueryShopKeyRequest extends JavaCommonRequest {
    public String luckbagId;
    public String userId;
    public String shopId;

    public QueryShopKeyRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/luckybag/userapp/getShopKey");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = new HashMap<>();
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        QueryShopKeyResponse skr;
        skr = JacksonUtil.readValue(json, QueryShopKeyResponse.class);
        return skr;
    }
}

package net.meyki.data.concoupon.request;

import net.meyki.data.concoupon.response.QuerySaveAmountResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.utils.JacksonUtil;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * 验证和保存福袋信息
 * Created by Knight on 2017/3/30.
 */

public class QuerySaveAmountRequest extends JavaCommonRequest {

    public String userId;
    public  String shopId;
    public String luckybagKey;
    public String luckybagId;

    public QuerySaveAmountRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/luckybag/userapp/saveAmount");
        request_method = JavaJsonNetwork.TYPE_POST_DATA;
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = initHashMap();
        map.put("userId",userId);
        map.put("shopId",shopId);
        map.put("luckybagKey",luckybagKey);
        map.put("luckybagId",luckybagId);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        JSONObject js=new JSONObject(json);
        JSONObject js1=new JSONObject();
        js1.put("data",js);
        QuerySaveAmountResponse sar;
        sar = JacksonUtil.readValue(js1.toString(), QuerySaveAmountResponse.class);
        return sar;
    }
}

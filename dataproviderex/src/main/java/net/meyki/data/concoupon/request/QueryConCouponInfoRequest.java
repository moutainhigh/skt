package net.meyki.data.concoupon.request;

import net.meyki.data.concoupon.response.QueryConCouponInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * 派券管理首页-获取派券信息
 * Created by Knight on 2017/3/23.
 */

public class QueryConCouponInfoRequest extends JavaCommonRequest{
    public String userId;

    public QueryConCouponInfoRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/ticket/userapp/getTicketIndex");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
       HashMap<String,Object> map = new HashMap<>();
        map.put("userId",userId);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        JSONObject json_new = new JSONObject(json);
        JSONObject object = new JSONObject();
        object.put("data",json_new);
        QueryConCouponInfoResponse qc;
        qc = JacksonUtil.readValue(object.toString(), QueryConCouponInfoResponse.class);
        return qc;
    }
}

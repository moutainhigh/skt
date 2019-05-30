package net.meyki.data.client.request;

import android.text.TextUtils;

import net.meyki.data.client.response.GetNearbyInfoResponse;
import net.meyki.data.client.response.GetOrderListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * get near info
 *
 * @author hl
 */
public class GetNearbyInfoRequest extends JavaCommonRequest {

    public GetNearbyInfoRequest() {
        setMethodName("v3/homepageItem/queryIndexInfo");// 这里填写的请求的action
    }

    public String locateType;
    public String longitude;
    public String latitude;
    public String city;
    public String radius;
    public String userId;
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        params.put("locateType", locateType);
        params.put("longitude", longitude);
        params.put("latitude", latitude);
        params.put("radius", radius);
        return params;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        GetNearbyInfoResponse cr = new GetNearbyInfoResponse();
        cr = JacksonUtil.readValue(json, GetNearbyInfoResponse.class);
        return cr;
    }
}

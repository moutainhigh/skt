package net.meyki.data.client.request;

import android.text.TextUtils;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.CouponByQcCodeResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Daimhim on 2017/4/7.
 */

public class GetCouponByQcCodeRequest extends JavaCommonRequest {

    public String couponDataJson;//		领券json
    public String userId;

    public GetCouponByQcCodeRequest() {
        setMethodName("v4/luckybag/get701CouponByQcCode");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = initHashMap();
        in.put("couponDataJson",couponDataJson);
        in.put("userId",userId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json){

        CouponByQcCodeResponse vcbqcr = null;
        if (!TextUtils.isEmpty(json)){
            vcbqcr = JacksonUtil.readValue(json, CouponByQcCodeResponse.class);
        }
        return vcbqcr;
    }
}

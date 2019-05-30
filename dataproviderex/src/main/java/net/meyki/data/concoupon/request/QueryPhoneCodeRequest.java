package net.meyki.data.concoupon.request;

import net.meyki.data.concoupon.response.QueryPhoneCodeResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Knight on 2017/3/30.
 */

public class QueryPhoneCodeRequest extends JavaCommonRequest {
    public String userPhone;

    public QueryPhoneCodeRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/luckybag/getVerificationCode");
    }


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = new HashMap<>();
        map.put("userPhone",userPhone);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        JSONObject jsonObject = new JSONObject(json);
        JSONObject object = new JSONObject();
        object.put("data",jsonObject);
        QueryPhoneCodeResponse pcr;
        pcr = JacksonUtil.readValue(object.toString(),QueryPhoneCodeResponse.class);
        return pcr;
    }
}

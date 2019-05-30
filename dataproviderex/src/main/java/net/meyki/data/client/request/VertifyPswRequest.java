package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

public class VertifyPswRequest extends JavaCommonRequest {

    public String password;

    public VertifyPswRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("user/verifyChargePass");
        request_method = JavaJsonNetwork.TYPE_POST_DATA;
        requestType = OkHttpUtil.RequestType.POST;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> param = initHashMap();
        param.put("userId",userId);
        param.put("password", password);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        return null;
    }
}

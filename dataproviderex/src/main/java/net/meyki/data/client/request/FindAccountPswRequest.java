package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

public class FindAccountPswRequest extends JavaCommonRequest {

    public String phone;
    public String newPass;
    public String veriCode;
    public FindAccountPswRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("user/findChargePass");
//        request_method = JavaJsonNetwork.TYPE_PUT_DATA;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> param = initHashMap();
        param.put("userId", userId);
        param.put("phone", phone);
        param.put("newPass", newPass);
        param.put("veriCode", veriCode);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        JavaCommonResponse response;
        response = FastJsonUtil.getObjectTFromJson(json, JavaCommonResponse.class);
        return response;
    }
}

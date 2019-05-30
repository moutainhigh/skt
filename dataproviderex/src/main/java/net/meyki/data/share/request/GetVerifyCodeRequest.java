package net.meyki.data.share.request;

import com.alibaba.fastjson.JSON;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetVerfyCodeResponse;
import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/10.
 */
public class GetVerifyCodeRequest extends JavaCommonRequest{

    public String userPhone;
    public String code;

    public GetVerifyCodeRequest(){
        setMethodName("user/getVerificationCode");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param = initHashMap();
        param.put("phone", userPhone);
        param.put("code", code);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetVerfyCodeResponse cr = JSON.parseObject(json, GetVerfyCodeResponse.class);
        return cr;
    }

}

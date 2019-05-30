package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetUserStatusResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/10.
 */
public class GetUserStatusRequest extends JavaCommonRequest{

    public String phone;

    public GetUserStatusRequest(){
        setMethodName("user/checkUserOnlineStatus");
    }

    @Override
    public HashMap<String, Object> getInputMap(){
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("userId", userId);
        param.put("tag", dev_tag);
        param.put("os", dev_os);
        param.put("phone", phone);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json){
        GetUserStatusResponse cr = new GetUserStatusResponse();
        cr = JacksonUtil.readValue(json, GetUserStatusResponse.class);
        return cr;
    }
}

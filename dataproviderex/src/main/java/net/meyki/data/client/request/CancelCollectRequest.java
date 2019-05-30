package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/4.
 */
public class CancelCollectRequest extends JavaCommonRequest{


    public String collectIdentity;
    public String collectType;
    public CancelCollectRequest(){
        requestType = OkHttpUtil.RequestType.DELETE;
        this.setMethodName("tastes/cancelCollect");
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = initHashMap();
        in.put("collectIdentity",collectIdentity);
        in.put("collectType",collectType);
        in.put("userId",userId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}

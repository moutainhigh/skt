package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/1/19.
 */

public class SaveExchangeRequest extends JavaCommonRequest {
    public String total;
    public String bankId;
    public SaveExchangeRequest() {
        this.setMethodName("user/saveExchange");
        request_method = JavaJsonNetwork.TYPE_POST_DATA;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> in = new HashMap<String, Object>();
        in.put("os", this.dev_os);
        in.put("tag", this.dev_tag);
        in.put("userId", userId);
        in.put("total", total);
        in.put("bankId", bankId);
        return in;
    }

}

package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;
import java.util.HashMap;

/**
 * 删除订单时请求
 * Created by Administrator on 2016/5/7.
 */
public class DelOrderRequest  extends JavaCommonRequest{
    public String orderId;

    public DelOrderRequest(){
        setMethodName("superiorProducts/deleteOrder");
        request_method = JavaJsonNetwork.TYPE_DELETE_DATA;
        requestType = OkHttpUtil.RequestType.DELETE;

    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in =initHashMap();
        in.put("userId",userId);
        in.put("orderId",orderId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }

}

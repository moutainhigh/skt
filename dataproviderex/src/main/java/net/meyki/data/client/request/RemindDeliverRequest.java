package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 易家 发货提醒请求
 * Created by Administrator on 2016/5/6.
 */
public class RemindDeliverRequest extends JavaCommonRequest {

    public String orderId;

    public String content;


    public RemindDeliverRequest(){
        this.setMethodName("superiorProducts/remindDeliver");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in  = new HashMap<String, Object>();
        in.put("orderId",orderId);
        in.put("content",content);
        in.put("userId",userId);
        in.put("shopId",shopId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {

        return null;
    }
}

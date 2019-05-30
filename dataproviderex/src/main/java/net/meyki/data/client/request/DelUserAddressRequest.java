package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/4.
 */
public class DelUserAddressRequest  extends JavaCommonRequest{

    public String deliveryAddressId;

    public DelUserAddressRequest(){
        this.setMethodName("goods/orderAddressDelete");
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in =initHashMap();
        in.put("userId",userId);
        in.put("deliveryAddressId",deliveryAddressId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}

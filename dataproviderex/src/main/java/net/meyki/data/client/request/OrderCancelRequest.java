package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;



//2.取消订单
public class OrderCancelRequest extends JavaCommonRequest {

    public String orderId;
    public String cancelCode;


    public OrderCancelRequest() {
        this.setMethodName("superiorProducts/cancelOrderInfoForShop");
    }


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param = initHashMap();
        param.put("userId", userId);
        param.put("orderId", orderId);
        param.put("cancelCode", cancelCode);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
//        if (null == json) {
//            return null;
//        }
//        CommonResponse cr = new CommonResponse();
//        cr.RequestSequenceId = RequestSequenceId;
//        ansyisCommonObjectResponse(cr, json);
        return null;
    }
}

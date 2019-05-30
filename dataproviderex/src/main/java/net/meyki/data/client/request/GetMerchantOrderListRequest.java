package net.meyki.data.client.request;

import android.text.TextUtils;

import net.meyki.data.client.response.GetMerchantOrderListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Daimhim on 2016/12/12.
 */

public class GetMerchantOrderListRequest extends JavaCommonRequest {

    public String status;//订单状态 :0：全部；2:待发货 （去发货）3:待收货（已发货）;4:已完成 10:已取消
    public String orderType;//	配送：0；不派送：1
    public String pageNo;//	页码
    public String userId;//		tag为0传
    public GetMerchantOrderListRequest() {
        this.setMethodName("v3/orderInfo/merchantOrderList");
    }


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = new HashMap<String, Object>();
        input.put("userId",userId);
        input.put("status",status);
        input.put("orderType",orderType);
        input.put("pageNo",pageNo);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetMerchantOrderListResponse gmolr = new GetMerchantOrderListResponse();
        if (!TextUtils.isEmpty(json)){
            gmolr = JacksonUtil.readValue(json,GetMerchantOrderListResponse.class);
        }
        return gmolr;
    }
}

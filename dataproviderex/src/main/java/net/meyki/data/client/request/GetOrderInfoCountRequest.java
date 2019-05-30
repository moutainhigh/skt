package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.GetOrderInfoCountResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 项目名称：net.meyki.data.client.request
 * 项目版本：user-4.5.0
 * 创建人：Daimhim
 * 创建时间：2017/6/28 9:08
 * 修改人：Daimhim
 * 修改时间：2017/6/28 9:08
 * 类描述：
 * 修改备注：
 */

public class GetOrderInfoCountRequest extends JavaCommonRequest {
    public String userId;  //	是	string	用户ID
    public String orderType;  //	是	string	订单分类：0：物流快递，3：商家配送，1：到店消费
    public GetOrderInfoCountRequest() {
        setMethodName("v4/orderInfo/getOrderInfoCount");
        requestType = OkHttpUtil.RequestType.GET;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("userId",userId);
        hashMap.put("orderType",orderType);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return JSON.parseObject(json,GetOrderInfoCountResponse.class);
    }
}

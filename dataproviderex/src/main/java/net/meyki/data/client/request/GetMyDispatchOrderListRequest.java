package net.meyki.data.client.request;

import net.meyki.data.client.response.GetMyDispatchOrderListResponse;
import net.meyki.data.client.response.GetMyResOrderListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取预定订单
 * Created by lxy on 2016/8/16 0016.
 */
public class GetMyDispatchOrderListRequest extends JavaCommonRequest{
    public GetMyDispatchOrderListRequest(){
//        this.setMethodName("v3/orderInfo/getOrderInfoList");
        this.setMethodName("v3/orderInfo/merchantOrderList");
    }
    public String userId;//						in		String								OPTION	用户ID							tag为0传
    public String pageNo;//						in		String								YES		页码							tag为1传

    @Override
    public HashMap<String,Object> getInputMap() {
        HashMap<String,Object> input = new HashMap<String, Object>();
        input.put("userId",userId);
        input.put("pageNo",pageNo);
        input.put("tag",dev_tag);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        //GetMyResOrderListResponse sc = new GetMyResOrderListResponse();
        //sc = JacksonUtil.readValue(json, GetMyResOrderListResponse.class);
        GetMyDispatchOrderListResponse sc = new GetMyDispatchOrderListResponse();
        sc = JacksonUtil.readValue(json, GetMyDispatchOrderListResponse.class);
        return sc;
    }
}

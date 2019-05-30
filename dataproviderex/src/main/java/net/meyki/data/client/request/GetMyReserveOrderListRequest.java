package net.meyki.data.client.request;

import net.meyki.data.client.response.GetMyReserveOrderListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 预定商铺列表
 * Created by lxy on 2016/8/16 0016.
 */
public class GetMyReserveOrderListRequest extends JavaCommonRequest {
    public GetMyReserveOrderListRequest(){
        this.setMethodName("v3/orderInfo/getOrderInfoList");
    }
    public String refondStatus; //查询退货退款 0不是，1是 ,如果是1，则status不需要传
    public String status;//订单状态
    public String orderType;	//												OPTION		城市
    public String pageNo;	//													YES		页码
    public String userId;

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = new HashMap<String, Object>();
        input.put("userId",userId);
        input.put("status",status);
        input.put("orderType",orderType);
        input.put("pageNo",pageNo);
        input.put("tag",dev_tag);
        input.put("refondStatus",refondStatus);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetMyReserveOrderListResponse sc = new GetMyReserveOrderListResponse();
        sc = JacksonUtil.readValue(json, GetMyReserveOrderListResponse.class);
        return sc;
    }
}

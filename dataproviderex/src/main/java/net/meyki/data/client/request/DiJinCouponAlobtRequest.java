package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.DiJinCouponAlobtResponse;
import net.meyki.data.client.response.GetShopCartResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取已收优惠卷列表数据
 * Created by lxy on 2017/3/28 0028.
 */
public class DiJinCouponAlobtRequest extends JavaCommonRequest {
    public DiJinCouponAlobtRequest(){
        setMethodName("v4/amount/userapp/getReceivedAmount");
    }
    public String userId;//						in		String								YES		用户Id
    public String pageSize;//						in		String								YES		每页显示的数量
    public String pageNo;//						in		String								YES		请求的页数
    public String ticketCategory;//				in		String								YES		消费券种类
    public String fkTicketId;//					in		String								YES		消费券种类ID

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = initHashMap();
        input.put("userId",userId);
        input.put("pageSize",pageSize);
        input.put("pageNo",pageNo);
        input.put("ticketCategory",ticketCategory);
        input.put("fkTicketId",fkTicketId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        DiJinCouponAlobtResponse response =   JSON.parseObject(json, DiJinCouponAlobtResponse.class);
        return response;
    }
}

package net.meyki.data.client.request;


import net.meyki.data.client.response.GetOrderListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/4.
 */
public class GetOrderListRequest extends JavaCommonRequest {
    public String status;
    public GetOrderListRequest(){
        this.setMethodName("superiorProducts/queryOrderList");
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = new HashMap<String, Object>();
        in.put("userId",userId);
        in.put("pageNo",pageNo);
        in.put("pageSize",pageSize);
        in.put("status",status);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String paramStream) {

        GetOrderListResponse rs = JacksonUtil.readValue(paramStream,GetOrderListResponse.class);
        if(rs == null){
            rs  = new GetOrderListResponse();
        }
        return rs;
    }
}

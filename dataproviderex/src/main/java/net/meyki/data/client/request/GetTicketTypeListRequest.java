package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.GetTicketTypeListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/8.
 */
public class GetTicketTypeListRequest extends JavaCommonRequest {

    public GetTicketTypeListRequest(){
        setMethodName("v4/ticket/getAllTicketCategoryList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = initHashMap();
        input.put("userId",userId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        GetTicketTypeListResponse cr = JSON.parseObject(json, GetTicketTypeListResponse.class);
        return cr;
    }

}

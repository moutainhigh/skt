package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.GetTransferConListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by zhaolifeng on 2017/3/29
 * 抵金券互转记录列表.
 */
public class GetTransferConListRequest extends JavaCommonRequest {

    public String originType; //0全部 3转赠 5领取

    public GetTransferConListRequest() {
        setMethodName("v4/amount/userapp/getGiveAmountInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = initHashMap();
        input.put("userId", userId);
        input.put("pageNo", String.valueOf(pageNo));
        input.put("pageSize", String.valueOf(pageSize));
        input.put("originType", originType);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        GetTransferConListResponse cr = JSON.parseObject(json, GetTransferConListResponse.class);
        ;
        return cr;
    }


}

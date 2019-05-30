package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.RecommendItemResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Knight on 2017/4/18.
 */

public class RecommendItemRequest extends JavaCommonRequest {

    public RecommendItemRequest() {
        this.setMethodName("v4/classSearch/getSelectedClassList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map =initHashMap();
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        RecommendItemResponse rir;
        rir = JSON.parseObject(json,RecommendItemResponse.class);
        return rir;
    }
}

package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.SearchFilterAreaResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 首页推荐筛选地区查询
 * Created by Knight on 2017/6/20.
 */

public class SearchFilterAreaRequest extends JavaCommonRequest {
    public String userId;
    public String categoryId;

    public SearchFilterAreaRequest() {
    setMethodName("v4/homeEhIndex/getAreaByCate");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = initHashMap();
        map.put("userId",userId);
        map.put("categoryId",categoryId);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws  Exception {
        SearchFilterAreaResponse response;
        response = JSON.parseObject(json,SearchFilterAreaResponse.class);
        return response;
    }
}

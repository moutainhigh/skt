package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.SearchFilterSortResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 获取首页推荐筛选分类信息
 * Created by Knight on 2017/6/20.
 */

public class SearchFilterSortRequest extends JavaCommonRequest {

    public String userId;

    public SearchFilterSortRequest() {
        setMethodName("v4/homeEhIndex/getFilterCategories");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = initHashMap();
        map.put("userId",userId);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        SearchFilterSortResponse response;
        response = JSON.parseObject(json,SearchFilterSortResponse.class);
        return response;
    }
}

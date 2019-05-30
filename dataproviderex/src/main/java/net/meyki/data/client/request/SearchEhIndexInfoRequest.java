package net.meyki.data.client.request;

import net.meyki.data.client.response.SearchEhIndexInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 邹德滨 2016-12-13 易家二级页面 搜索功能请求
 * Created by Administrator on 2016/12/13.
 */

public class SearchEhIndexInfoRequest extends JavaCommonRequest {

    public String type, itemId,keywords;//type:首页传0，二级页面传1，itemId：栏目id

    public SearchEhIndexInfoRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/homeEhIndex/queryEhIndexInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> param =initHashMap();
        param.put("userId", userId);
        param.put("type", type);
        param.put("itemId", itemId);
        param.put("keywords",keywords);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        SearchEhIndexInfoResponse rs;
        rs = FastJsonUtil.getObjectTFromJson(json, SearchEhIndexInfoResponse.class);
        return rs;
    }

}

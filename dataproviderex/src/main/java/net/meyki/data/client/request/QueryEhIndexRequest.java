package net.meyki.data.client.request;

import net.meyki.data.client.response.QueryEhIndexResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 易家首页栏目查询
 */
public class QueryEhIndexRequest extends JavaCommonRequest {


    public QueryEhIndexRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/homeEhIndex/queryEhIndexItem");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> param = initHashMap();
        param.put("userId", userId);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        QueryEhIndexResponse rs = new QueryEhIndexResponse();
        rs = FastJsonUtil.getObjectTFromJson(json, QueryEhIndexResponse.class);
        return rs;
    }

}

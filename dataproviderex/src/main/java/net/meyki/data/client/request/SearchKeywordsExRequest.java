package net.meyki.data.client.request;

import net.meyki.data.client.response.SearchKeyResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/4/28.
 */
public class SearchKeywordsExRequest  extends JavaCommonRequest {
    public String query;
    public String genre; //	是	String	热词搜索类型（1：活动，2：店铺）

    public SearchKeywordsExRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("index/getKeywords");
        request_method =  net.meyki.data.json.JavaJsonNetwork.TYPE_BAIDU_GET;
        requestType = OkHttpUtil.RequestType.GET;
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param = initHashMap();
        param.put("userId", query);
        param.put("genre", genre);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return FastJsonUtil.getObjectTFromJson(json, SearchKeyResponse.class);
    }
}

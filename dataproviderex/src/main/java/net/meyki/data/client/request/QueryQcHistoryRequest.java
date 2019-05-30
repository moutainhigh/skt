package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.QueryQcHistoryResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * c查询二维码扫描记录列表
 * Created by Administrator on 2017/5/9 0009.
 */
public class QueryQcHistoryRequest extends JavaCommonRequest {
    public QueryQcHistoryRequest() {
        setMethodName("v4/qcHistory/queryQcHistory");
        requestType = OkHttpUtil.RequestType.GET;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("userId",userId);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        QueryQcHistoryResponse queryQcHistoryResponse = FastJsonUtil.getObjectTFromJson(json,QueryQcHistoryResponse.class);
        return queryQcHistoryResponse;
    }
}

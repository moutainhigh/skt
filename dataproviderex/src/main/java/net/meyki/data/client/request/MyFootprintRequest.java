package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.MyFootprintResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 我的足迹
 * Created by Administrator on 2017/5/9 0009.
 */
public class MyFootprintRequest extends JavaCommonRequest {
    public MyFootprintRequest() {
//        setMethodName("v4/qcHistory/queryQcHistory");
        setMethodName("v4/footPrint/getFootPrintInfoList");
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
        MyFootprintResponse queryQcHistoryResponse = FastJsonUtil.getObjectTFromJson(json,MyFootprintResponse.class);
        return queryQcHistoryResponse;
    }
}

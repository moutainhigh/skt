package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class AddQcHistoryRequest extends JavaCommonRequest {
    public String goodsId;

    public AddQcHistoryRequest() {
        setMethodName("v4/qcHistory/addQcHistory");
        requestType = OkHttpUtil.RequestType.POST;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("goodsId", goodsId);
        hashMap.put("userId", userId);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return null;
    }
}

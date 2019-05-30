package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 删除足迹记录
 * Created by Administrator on 2017/5/9 0009.
 */
public class MyFootprintDeleteRequest extends JavaCommonRequest {
    public String userId;          //当前登录用户ID
//    public String[] goodsIds;          //ID的字符串，多个逗号隔开
    public   com.alibaba.fastjson.JSONArray goodsIds;
    public MyFootprintDeleteRequest() {
        setMethodName("v4/footPrint/deleteMyFootPrint");
        requestType = OkHttpUtil.RequestType.POST;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("userId",userId);
        hashMap.put("goodsIds",goodsIds);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return null;
    }
}

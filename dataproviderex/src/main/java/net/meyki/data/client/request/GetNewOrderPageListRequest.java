package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.GetNewOrderPageListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 项目名称：net.meyki.data.client.request
 * 项目版本：user-4.5.0
 * 创建人：Daimhim
 * 创建时间：2017/6/28 18:36
 * 修改人：Daimhim
 * 修改时间：2017/6/28 18:36
 * 类描述：
 * 修改备注：
 */

public class GetNewOrderPageListRequest extends JavaCommonRequest {
    public GetNewOrderPageListRequest() {
        setMethodName("v4/orderInfo/getNewOrderPageList");
        requestType = OkHttpUtil.RequestType.GET;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("userId",userId);
        hashMap.put("pageNo",pageNo);
        hashMap.put("pageSize",pageSize);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return JSON.parseObject(json,GetNewOrderPageListResponse.class);
    }
}

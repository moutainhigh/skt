package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.SearchCountryResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 项目名称：user-4.5.0
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/20 16:41
 * 修改人：meyki-bear
 * 修改时间：2017/6/20 16:41
 * 修改备注：
 */

public class SearchCountryRequest extends JavaCommonRequest {
    public String keyWord;

    public SearchCountryRequest() {
        setMethodName("v4/homeEhIndex/indeShopSearch");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> map = initHashMap();
        map.put("userId", userId);
        map.put("keyWord", keyWord);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return JSON.parseObject(json, SearchCountryResponse.class);
    }
}

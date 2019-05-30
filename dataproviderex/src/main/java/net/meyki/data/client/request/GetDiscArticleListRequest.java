package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.GetDiscArticleListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 项目名称：4.4.6
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/6 10:47
 * 修改人：meyki-bear
 * 修改时间：2017/6/6 10:47
 * 修改备注：
 */

public class GetDiscArticleListRequest extends JavaCommonRequest {
    public GetDiscArticleListRequest() {
        setMethodName("v4/ehDiscover/getDiscArticleList");
    }


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String ,Object> map=initHashMap();
        map.put("userId",userId);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        GetDiscArticleListResponse gda= JSON.parseObject(json,GetDiscArticleListResponse.class);
        return gda;
    }
}

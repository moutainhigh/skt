package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.DiscoverTagListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 项目名称：net.meyki.data.client.request
 * 项目版本：user-trunk
 * 创建人：Daimhim
 * 创建时间：2017/6/5 10:40
 * 修改人：Daimhim
 * 修改时间：2017/6/5 10:40
 * 类描述：
 * 修改备注：
 */

public class GetTagArticleListRequest extends JavaCommonRequest {
    public GetTagArticleListRequest() {
        setMethodName("v4/ehDiscover/getTagArticleList");
        requestType = OkHttpUtil.RequestType.GET;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        return initHashMap();
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return FastJsonUtil.getObjectTFromJson(json, DiscoverTagListResponse.class);
    }
}

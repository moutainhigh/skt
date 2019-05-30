package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.DiscTagArticleListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 项目名称：net.meyki.data.client.request
 * 项目版本：user-trunk
 * 创建人：Daimhim
 * 创建时间：2017/6/5 11:21
 * 修改人：Daimhim
 * 修改时间：2017/6/5 11:21
 * 类描述：改版】发现普通标签页文章列表
 * 修改备注：
 */

public class GetDiscTagArticleListRequest extends JavaCommonRequest {
    public String userId;   //	OPTION	String	当前用户Id
    public String pageNo;   //	OPTION	String	页码
    public String tagId;   //	YES	String	标签id 【tagType为0时传】

    public GetDiscTagArticleListRequest() {
        setMethodName("v4/ehDiscover/getDiscTagArticleList");
        requestType = OkHttpUtil.RequestType.GET;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("userId", userId);
        hashMap.put("pageNo", pageNo);
        hashMap.put("tagId", tagId);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return JSON.parseObject(json, DiscTagArticleListResponse.class);
    }
}

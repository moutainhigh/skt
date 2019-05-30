package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.FCArticleResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 发现文章列表
 * Created by lxy on 2017/6/7 0007.
 */
public class FCArticleRequest extends JavaCommonRequest {
    public FCArticleRequest(){
        this.setMethodName("v4/ehDiscover/getDiscTagArticleList");
    }
    public String userId;
    public String pageNo;
    public String tagId;//标签id
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = initHashMap();
        input.put("userId",userId);
        input.put("pageNo",pageNo);
        input.put("tagId",tagId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        FCArticleResponse sc = new FCArticleResponse();
        sc = FastJsonUtil.getObjectTFromJson(json, FCArticleResponse.class);
        return sc;
    }
}

package net.meyki.data.client.request;

import net.meyki.data.client.response.ArticleKeywordResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/6.
 */
public class ArticleKeywordRequest extends JavaCommonRequest {

    public ArticleKeywordRequest(){
        setMethodName("v3/homepageItem/getKeywords");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("userId", userId);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        ArticleKeywordResponse cr = JacksonUtil.readValue(json, ArticleKeywordResponse.class);
        return cr;
    }
}

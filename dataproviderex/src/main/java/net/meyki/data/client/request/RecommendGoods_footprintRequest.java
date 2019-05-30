package net.meyki.data.client.request;

import net.meyki.data.client.response.RecommendGoodsResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by Knight on 2017/4/18.
 */

public class RecommendGoods_footprintRequest extends JavaCommonRequest {
    public String keyWords;
    public String sortType;
    public String pageSize;
    public String pageNo;
    public String firstCategoryId;
    public String categoryId;
    public RecommendGoods_footprintRequest() {
        this.setMethodName("v4/classSearch/getClassSearchResultList");
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = initHashMap();
        map.put("firstCategoryId",firstCategoryId);
        map.put("keyWords",keyWords);
        map.put("sortType",sortType);
        map.put("pageSize",pageSize);
        map.put("pageNo",pageNo);
        map.put("categoryId",categoryId);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        RecommendGoodsResponse rgr ;
        rgr = FastJsonUtil.getObjectTFromJson(json,RecommendGoodsResponse.class);
        return rgr;
    }
}

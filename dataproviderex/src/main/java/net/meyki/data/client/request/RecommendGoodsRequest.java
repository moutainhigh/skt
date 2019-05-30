package net.meyki.data.client.request;

import net.meyki.data.client.response.RecommendGoodsResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Knight on 2017/4/18.
 */

public class RecommendGoodsRequest extends JavaCommonRequest {
    public String recommendCategoryId;
    public String firstCategoryId;
    public String keyWords;
    public String sortType;
    public String categoryId;
    public List<String> areaCode;
    public String maxPrice;
    public String minPrice;
    public String pageSize;
    public String pageNo;


    public RecommendGoodsRequest() {
        this.setMethodName("v4/classSearch/getClassSearchResultList");
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = initHashMap();
        map.put("recommendCategoryId",recommendCategoryId);
        map.put("firstCategoryId",firstCategoryId);
        map.put("keyWords",keyWords);//搜索关键词
        map.put("sortType",sortType);//排序类型
        map.put("categoryId",categoryId);
        map.put("areaCode",areaCode);
        map.put("maxPrice",maxPrice);
        map.put("minPrice",minPrice);
        map.put("pageSize",pageSize);//每页显示数量
        map.put("pageNo",pageNo);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        RecommendGoodsResponse rgr ;
        rgr = FastJsonUtil.getObjectTFromJson(json,RecommendGoodsResponse.class);
        return rgr;
    }
}

package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.SearchFilterResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Knight on 2017/6/22.
 */

public class SearchFilterRequest extends JavaCommonRequest {

    public String vcode;	//		版本号
    public String os;	//	 	android或ios
    public String tag;	//	 	0易家 1易商 2特产馆
    public String userId;	//	 	用户ID
    public String keyWord;	//	 	搜所关键字
    public String sortType;	//	 	排序类型：0 最新降序 1：销量升序 2：销量倒序 3：价格升序 4：价格降序
    public String categoryId;	//	 	分类id
    public List<String> areaCode;	//	 	地区ID
    public String maxPrice;	//		最高价
    public String minPrice;	//		最低价

    public SearchFilterRequest() {
        setMethodName("v4/homeEhIndex/indexGoodsSearch");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> map = initHashMap();
        map.put("userId",userId);
        map.put("keyWord",keyWord);
        map.put("sortType",sortType);
        map.put("categoryId",categoryId);
        map.put("areaCode",areaCode);
        map.put("maxPrice",maxPrice);
        map.put("minPrice",minPrice);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        SearchFilterResponse response;
        response = JSON.parseObject(json,SearchFilterResponse.class);
        return response;
    }
}

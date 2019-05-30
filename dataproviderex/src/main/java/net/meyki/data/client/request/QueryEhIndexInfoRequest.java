package net.meyki.data.client.request;

import net.meyki.data.client.response.QueryEhIndexInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;
import java.util.List;

/**
 * 获取首页栏目明细信息
 */
public class QueryEhIndexInfoRequest extends JavaCommonRequest {

    public String type, itemId,keywords;//type:首页传0，二级页面传1，itemId：栏目id
    public String sortType;	//	 	排序类型：0 最新降序 1：销量升序 2：销量倒序 3：价格升序 4：价格降序
    public String categoryId;	//	 	分类id
    public List<String> areaCode;	//	 	地区ID
    public String maxPrice;	//		最高价
    public String minPrice;	//		最低价
    public QueryEhIndexInfoRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/homeEhIndex/queryEhIndexInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> param = initHashMap();
        param.put("userId", userId);
        param.put("type", type);
        param.put("itemId", itemId);
        param.put("keywords",keywords);
        param.put("sortType",sortType);
        param.put("categoryId",categoryId);
        param.put("areaCode",areaCode);
        param.put("maxPrice",maxPrice);
        param.put("minPrice",minPrice);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        QueryEhIndexInfoResponse rs ;
        rs = FastJsonUtil.getObjectTFromJson(json, QueryEhIndexInfoResponse.class);
        return rs;
    }

}

package net.meyki.data.client.request;

import net.meyki.data.client.response.QueryDistrictShopListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 获取特色馆列表
 */
public class QueryDistrictShopListRequest extends JavaCommonRequest {
    public String selectType;//1:推荐；2：销量
    public QueryDistrictShopListRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/homeEhIndex/queryDistrictShopList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        // TODO Auto-generated method stub
        HashMap<String, Object> param =initHashMap();
        param.put("tag", dev_tag);
        param.put("os", dev_os);
        param.put("userId", userId);
        param.put("pageNo", pageNo);
        param.put("pageSize", pageSize);
        param.put("selectType", selectType);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        // TODO Auto-generated method stub
        QueryDistrictShopListResponse rs = new QueryDistrictShopListResponse();
        rs = FastJsonUtil.getObjectTFromJson(json,QueryDistrictShopListResponse.class);
        return rs;
    }

}

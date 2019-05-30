package net.meyki.data.share.request;


import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.share.response.StoreMoreGoodListResponse;

import java.util.HashMap;

/**
 * 120 更多列表(折扣)
 */
public class StoreMoreGoodListRequest extends JavaCommonRequest {


    public StoreMoreGoodListRequest() {
        setMethodName("index/getDiscountsClient");// 这里需要传入请求的action
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("pageSize", pageSize);
        params.put("shopId", shopId);
        params.put("pageNo", pageNo);
        return params;
    }

    @Override
    public net.meyki.data.json.JavaCommonResponse getOutputResponse(String paramStream) {
        // TODO Auto-generated method stub
        if (null == paramStream) {
            return null;
        }
//		StoreMoreGoodListResponse alr = JacksonUtil.readValue(paramStream, new TypeReference<StoreMoreGoodListResponse>() {
//		});
        StoreMoreGoodListResponse alr = JacksonUtil.readValue(paramStream, StoreMoreGoodListResponse.class);
        if (alr == null) {
            alr = new StoreMoreGoodListResponse();
        }
        return alr;
    }

}

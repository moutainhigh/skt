package net.meyki.data.client.request;

import net.meyki.data.client.response.GetMainRecommendResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 项目名称：4.3.0
 * 类描述：获取首页推荐显示类目
 * 创建人：xyp
 * 创建时间：2017/4/18 10:27
 * 修改人：meyki-bear
 * 修改时间：2017/4/18 10:27
 * 修改备注：
 */

public class GetMainRecommendRequest extends JavaCommonRequest {
    @Override
    public String getMethodName() {
        return "v4/classSearch/getRecommendClassResultList";
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = initHashMap();
        input.put("userId", userId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        GetMainRecommendResponse grr;
        grr= FastJsonUtil.getObjectTFromJson(json,GetMainRecommendResponse.class);
        return grr;
    }
}

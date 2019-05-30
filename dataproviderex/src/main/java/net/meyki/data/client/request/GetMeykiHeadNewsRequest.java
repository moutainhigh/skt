package net.meyki.data.client.request;

import net.meyki.data.client.response.GetMeykiHeadNewResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 项目名称：4.3.0
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/4/18 11:29
 * 修改人：meyki-bear
 * 修改时间：2017/4/18 11:29
 * 修改备注：
 */

public class GetMeykiHeadNewsRequest extends JavaCommonRequest {
    @Override
    public String getMethodName() {
        return "v4/classSearch/getMeykiHeadNews";
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input =initHashMap();
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        GetMeykiHeadNewResponse gmr;
        gmr= FastJsonUtil.getObjectTFromJson(json,GetMeykiHeadNewResponse.class);
        return gmr;
    }
}

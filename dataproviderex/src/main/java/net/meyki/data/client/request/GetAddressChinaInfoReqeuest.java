package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.response.GetAddressChinaInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 项目名称：user-4.5.2
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/17 14:28
 * 修改人：meyki-bear
 * 修改时间：2017/6/17 14:28
 * 修改备注：
 */

public class GetAddressChinaInfoReqeuest extends JavaCommonRequest {
    public GetAddressChinaInfoReqeuest() {
        setMethodName("address/getAddressChinaInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> map = initHashMap();
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return JSON.parseObject(json, GetAddressChinaInfoResponse.class);
    }
}

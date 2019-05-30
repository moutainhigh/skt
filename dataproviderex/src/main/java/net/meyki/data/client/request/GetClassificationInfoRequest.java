package net.meyki.data.client.request;

import net.meyki.data.client.response.GetClassificationInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取“发现”,“特产馆”筛选列表的请求接口
 * Created by Administrator on 2016/5/16.
 */
public class GetClassificationInfoRequest extends JavaCommonRequest {
    public GetClassificationInfoRequest() {
        this.setMethodName("tastes/getClassificationInfo");
    }

    public String type; //1：特产馆2：发现

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = initHashMap();
        in.put("userId", userId);
        in.put("type", type);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetClassificationInfoResponse glr = JacksonUtil.readValue(json, GetClassificationInfoResponse.class);
        if (glr == null) {
            glr = new GetClassificationInfoResponse();
        }
        return glr;
    }
}

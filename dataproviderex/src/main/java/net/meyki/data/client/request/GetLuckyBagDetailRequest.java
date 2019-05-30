package net.meyki.data.client.request;

import net.meyki.data.client.response.GetLuckyBagDetailResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/7.
 */
public class GetLuckyBagDetailRequest extends JavaCommonRequest {

    private String luckybagId;

    public GetLuckyBagDetailRequest(){
        setMethodName("v4/luckybag/lookLuckybagDetail");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<>();
        input.put("userId", userId);
        input.put("luckybagId", luckybagId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        GetLuckyBagDetailResponse cr = JacksonUtil.readValue(json, GetLuckyBagDetailResponse.class);
        return cr;
    }

    public void setLuckybagId(String luckybagId) {
        this.luckybagId = luckybagId;
    }

}

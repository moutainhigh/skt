package net.meyki.data.client.request;

import net.meyki.data.client.response.QueryChargeVrcodeInfoRespone;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by hl on 2017/1/19.
 * 充币
 */
public class QueryChargeVrcodeInfoRequest extends JavaCommonRequest {

    public QueryChargeVrcodeInfoRequest() {
        this.setMethodName("v4/elicWallet/queryChargeVrcodeInfo");
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param =initHashMap();
        param.put("userId", userId);
        return param;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        QueryChargeVrcodeInfoRespone response;
        response = FastJsonUtil.getObjectTFromJson(json,QueryChargeVrcodeInfoRespone.class);
        return response;
    }
}

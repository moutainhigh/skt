package net.meyki.data.client.request;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.SelectAddressResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import org.codehaus.jackson.type.TypeReference;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/17.
 */
public class SelectAddressRequest extends JavaCommonRequest {
    public SelectAddressRequest() {
        setMethodName("tastes/getAreaInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> map = initHashMap();
        map.put("userId",userId);
        return map;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        SelectAddressResponse rs = JacksonUtil.readValue(json, new TypeReference<SelectAddressResponse>() {
        });
        return rs;
    }
}

package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetStoreCatResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/7.
 */
public class GetStoreCatRequest extends JavaCommonRequest{

    public String cate;


    public GetStoreCatRequest(){
        setMethodName("v3/shopTypes/getShopTypes");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = initHashMap();
        in.put("cate", cate);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetStoreCatResponse cr = FastJsonUtil.getObjectTFromJson(json, GetStoreCatResponse.class);
        return cr;
    }
}

package net.meyki.data.client.request;

import android.text.TextUtils;

import net.meyki.data.client.response.ShopBrandResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/1/6.
 */

public class ShopBrandRequest extends JavaCommonRequest {

    public ShopBrandRequest(){
        this.setMethodName("v4/v408chain/queryChainBrand");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> params = new HashMap<String,Object>();
        return params;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        ShopBrandResponse nsr = new ShopBrandResponse();
        if(!TextUtils.isEmpty(json)) {
            nsr = FastJsonUtil.getObjectTFromJson(json, ShopBrandResponse.class);
        }
        return nsr;
    }
}

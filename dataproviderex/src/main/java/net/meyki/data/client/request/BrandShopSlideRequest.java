package net.meyki.data.client.request;

import net.meyki.data.client.response.BrandShopSlideResponse;
import net.meyki.data.client.response.NearSearchResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/8.
 */
public class BrandShopSlideRequest extends JavaCommonRequest {
    public BrandShopSlideRequest() {
        this.setMethodName("v3/homepageItem/brandShopInfo");
//        this.setMethodName("ehhomepage/getIndexAdsImg");
    }
    public String shopType;


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<String, Object>();
        input.put("brand_id", shopType);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        BrandShopSlideResponse sr = new BrandShopSlideResponse();
        sr = JacksonUtil.readValue(json, BrandShopSlideResponse.class);
        return sr;
    }
}

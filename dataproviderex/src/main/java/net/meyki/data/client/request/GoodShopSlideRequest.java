package net.meyki.data.client.request;

import net.meyki.data.client.response.NearSearchResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/8.
 */
public class GoodShopSlideRequest extends JavaCommonRequest {
    public GoodShopSlideRequest(){
        this.setMethodName("v3/homepageItem/getIndexAdsImg");
//        this.setMethodName("ehhomepage/getIndexAdsImg");
    };

    public String locateType;	//String 1 自动定位 2 手动定位
    public String longitude;//经度
    public String latitude;//纬度
    public String city;//城市
    public String radius;//距离范围
    public String tag;//0易家  1易商
    public String os;//android或ios


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = new HashMap<String, Object>();
        input.put("locateType",locateType);
        input.put("longitude",longitude);
        input.put("latitude",latitude);
        input.put("city",city);
        input.put("radius",radius);
        input.put("tag",tag);
        input.put("os",os);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        NearSearchResponse sc = new NearSearchResponse();
        sc = JacksonUtil.readValue(json, NearSearchResponse.class);
        return sc;
    }
}

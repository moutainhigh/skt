package net.meyki.data.client.request;

import net.meyki.data.client.response.NearbyShopReponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/13.
 */
public class NearShopMoreRequest extends JavaCommonRequest {
    public NearShopMoreRequest(){
        this.setMethodName("v3/homepageItem/getActiveList");
        /**/
    }

    public String userId;//				易家用户ID
    public String locateType;//		1 自动定位 2 手动定位
    public String longitude;//			经度
    public String latitude;//			纬度
    public String city;//						城市
    public String radius;//					距离范围
    public String typeId;//活动分类
    public String pageNo;//页码
    public String activeTypeId;//						1休闲度假/2优质商铺
    public String tag;//				0易家  1易商
    public String os;//						android或ios

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String , Object> input  = new HashMap<String , Object>();
        input.put("userId",userId);
        input.put("locateType",locateType);
        input.put("longitude",longitude);
        input.put("latitude",latitude);
        input.put("city",city);
        input.put("radius",radius);
        input.put("typeId",typeId);
        input.put("pageNo",pageNo);
        input.put("activeTypeId",activeTypeId);
        input.put("tag",tag);
        input.put("os",os);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        NearbyShopReponse nsr = new NearbyShopReponse();
        nsr = JacksonUtil.readValue(json, NearbyShopReponse.class);
        return nsr;
    }
}

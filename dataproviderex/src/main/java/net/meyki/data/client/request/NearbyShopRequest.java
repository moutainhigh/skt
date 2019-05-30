package net.meyki.data.client.request;

import net.meyki.data.client.response.NearbyShopReponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/9.
 */
public class NearbyShopRequest extends JavaCommonRequest {
    public NearbyShopRequest(){
        this.setMethodName("v3/homepageItem/queryNearShop");
        /**/
    }
    public String locateType;//		1 自动定位 2 手动定位
    public String longitude;//			经度
    public String latitude;//			纬度
    public String city;//						城市
    public String radius;//					距离范围
    public String keyword;//					店铺关键字
    public String pageNo;//					页码
    public String shopType;//				店铺分类
    public String flag;//						1休闲度假/2优质商铺
    public String userId;//				易家用户ID
    public String feature;//					是否特色推荐（1为特色推荐，0：或者为空为非特色推荐）
    public String tag;//				0易家  1易商
    public String os;//						android或ios
    public String vcode;//


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String , Object> input  = initHashMap();
        input.put("locateType",locateType);
        input.put("longitude",longitude);
        input.put("latitude",latitude);
        input.put("city",city);
        input.put("radius",radius);
        input.put("keyword",keyword);
        input.put("pageNo",pageNo);
        input.put("shopType",shopType);
        input.put("flag",flag);
        input.put("userId",userId);
        input.put("feature",feature);
        input.put("vcode",vcode);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        NearbyShopReponse nsr;
        nsr = FastJsonUtil.getObjectTFromJson(json, NearbyShopReponse.class);
        return nsr;
    }
}

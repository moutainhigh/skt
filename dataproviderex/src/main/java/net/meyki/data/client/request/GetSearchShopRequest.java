package net.meyki.data.client.request;

import android.text.TextUtils;

import net.meyki.data.client.response.GetSearchShopResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 1.45 获取附近店铺列表
 */
public class GetSearchShopRequest extends JavaCommonRequest {

    public int locateType;
    public String longitude;
    public String latitude;
    public String city;
    public String radius;
    public String keyword;
    public int tag;
    public String modular;
    public String feature;

    public int getLocateType() {
        return locateType;
    }

    public void setLocateType(int locateType) {
        this.locateType = locateType;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getModular() {
        return modular;
    }

    public void setModular(String modular) {
        this.modular = modular;
    }

    public GetSearchShopRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v3/homepageItem/searchNearShop");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = new HashMap<String, Object>();
        in.put("locateType", locateType);

        if (locateType == 1) {
            // 1 自动定位 2 手动定位
            in.put("longitude", longitude);
            in.put("latitude", latitude);
        } else if (locateType == 2) {
            // 手动定位 city 城市
            in.put("city", city);
        }
        // 距离范围
        if (!TextUtils.isEmpty(radius)) {
            in.put("radius", radius);
        }
        // act=>byType 按分类检索 typeId 分类id
        // act=>keyword 按关键词检索 keyword 关键词
        // act=>activeType 按活动类型检索 activeTypeId 活动类型id
        if (!TextUtils.isEmpty(keyword)) {
            in.put("keyword", keyword);
        }
       /* in.put("pageNo", pageNo);
        in.put("pageSize", pageSize);*/
        in.put("modular", modular);
        in.put("userId", userId);
        in.put("feature", feature);
        return in;

    }

    @Override
    public JavaCommonResponse getOutputResponse(String paramStream) {
        // TODO Auto-generated method stub
        if (null == paramStream) {
            return null;
        }
        GetSearchShopResponse rs = FastJsonUtil.getObjectTFromJson(paramStream, GetSearchShopResponse.class);
        return rs;
    }

}

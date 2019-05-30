package net.meyki.data.client.request;

import android.text.TextUtils;
import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.GetShopsEhResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;

import java.util.HashMap;

/**
 * 1.45 获取附近店铺列表
 */
public class GetShopsEhRequest extends JavaCommonRequest {

    public int locateType;
    public String longitude;
    public String latitude;
    public String city;
    public String radius;
    public String act;
    public String typeId;
    public String keyword;
    public String activeTypeId;
    public int pageNo;
    public int pageSize;
    public int tag;

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

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getActiveTypeId() {
        return activeTypeId;
    }

    public void setActiveTypeId(String activeTypeId) {
        this.activeTypeId = activeTypeId;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public GetShopsEhRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("index/getShopsEh");
        setPageSize(10);
        setRadius("10000");
        request_method = JavaJsonNetwork.TYPE_DEFAULT;
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
        if (!TextUtils.isEmpty(act)) {
            in.put("act", act);
        }
        if (!TextUtils.isEmpty(typeId)) {
            in.put("typeId", typeId);
        }
        if (!TextUtils.isEmpty(keyword)) {
            in.put("keyword", keyword);
        }
        if (!TextUtils.isEmpty(activeTypeId)) {
            in.put("activeTypeId", activeTypeId);
        }
        in.put("pageNo", pageNo);
        in.put("pageSize", pageSize);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String paramStream) {
        // TODO Auto-generated method stub
        if (null == paramStream) {
            return null;
        }
        GetShopsEhResponse rs = JacksonUtil.readValue(paramStream, new TypeReference<GetShopsEhResponse>() {
        });


        return rs;
    }

}

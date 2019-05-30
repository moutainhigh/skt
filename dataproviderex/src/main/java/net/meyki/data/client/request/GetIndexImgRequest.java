package net.meyki.data.client.request;
import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.GetIndexImgResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/4/28.
 */
public class GetIndexImgRequest  extends JavaCommonRequest {

    public int locateType;
    public String  longitude;
    public String  latitude;
    public String city;
    public String shopType;
    public int limit;

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

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

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public GetIndexImgRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("index/getIndexImg");
        request_method = JavaJsonNetwork.TYPE_DEFAULT;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = new HashMap<String, Object>();
        if (getLimit() == 0) {
            in.put("limit", 5+"");
        } else {
            in.put("limit", limit+"");
        }
        if (locateType == 1) {
            // 自动定位
            in.put("longitude", longitude);
            in.put("latitude", latitude);
        } else if (locateType == 2) {
            in.put("city", getCity());
        }
        in.put("locateType", locateType+"");
        in.put("shopType", shopType+"");
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        if (null == json) {
            return null;
        }
        GetIndexImgResponse rs = JacksonUtil.readValue(json, new TypeReference<GetIndexImgResponse>() {
        });
        return rs;
    }
}

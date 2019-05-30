package net.meyki.data.client.request;

import com.alibaba.fastjson.JSON;

import net.meyki.data.client.response.DiscoveryInfoResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**发现首页
 * Created by Administrator on 2016/7/4.
 */
public class DiscoveryInfoRequest extends JavaCommonRequest{

    public String type;
    public String keywords;
    public String articalType;//文章类型
    public String areaCode;//区域代码

    public DiscoveryInfoRequest(){
        setMethodName("v3/disc/getDiscoverList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = initHashMap();
        in.put("userId",userId);
        in.put("type",type);
        in.put("keywords", keywords);
        in.put("pageSize",pageSize);
        in.put("pageNo",pageNo);
        in.put("areaCode",areaCode);
        in.put("articalType",articalType);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        DiscoveryInfoResponse rs = JSON.parseObject(json, DiscoveryInfoResponse.class);
        return rs;
    }
}

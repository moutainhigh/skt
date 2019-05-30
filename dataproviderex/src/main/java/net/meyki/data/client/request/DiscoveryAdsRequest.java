package net.meyki.data.client.request;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.data.client.domain.articalAdsInfo;
import net.meyki.data.client.response.DiscoveryAdsResponse;
import net.meyki.data.client.response.DiscoveryInfoResponse;
import net.meyki.data.client.response.GetIndexImgResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/7/4.
 */
public class DiscoveryAdsRequest extends JavaCommonRequest{

    public DiscoveryAdsRequest(){
        setMethodName("v3/disc/getDiscoverPhotoList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = new HashMap<String, Object>();
        in.put("userId",userId);
        in.put("tag",dev_tag);
        in.put("os",dev_os);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        DiscoveryAdsResponse rs = new DiscoveryAdsResponse();
        rs = JacksonUtil.readValue(json, new TypeReference<DiscoveryAdsResponse>(){});
        return rs;
    }
}

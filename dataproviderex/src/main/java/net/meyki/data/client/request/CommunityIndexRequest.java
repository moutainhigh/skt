package net.meyki.data.client.request;

import net.meyki.data.client.domain.CommunityBean;
import net.meyki.data.client.response.CommunityIndexResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/20.
 */
public class CommunityIndexRequest extends JavaCommonRequest {
    public CommunityIndexRequest(){
        this.setMethodName("community/getCommunityHomeInfo");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = new HashMap<String, Object>();
        in.put("userId", userId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        CommunityIndexResponse cr = new CommunityIndexResponse();
        cr.bean = JacksonUtil.readValue(json, CommunityBean.class);
        return cr;
    }
}

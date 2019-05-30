package net.meyki.data.client.request;

import net.meyki.data.client.response.GetIndexImgTopResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/4/28.
 */
public class GetIndexImgTopRequest extends JavaCommonRequest {
    public String  positionCode;


    public GetIndexImgTopRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("v4/ads/queryAdsBanner");
        request_method = JavaJsonNetwork.TYPE_DEFAULT;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = initHashMap();
        in.put("positionCode", positionCode);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        if (null == json) {
            return null;
        }
        GetIndexImgTopResponse rs = FastJsonUtil.getObjectTFromJson(json, GetIndexImgTopResponse.class);
        if(rs==null){
            rs = new GetIndexImgTopResponse();
        }
        return rs;
    }
}

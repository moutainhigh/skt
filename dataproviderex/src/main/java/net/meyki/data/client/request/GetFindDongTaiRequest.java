package net.meyki.data.client.request;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.FindDongTaiResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/4/28.
 */
public class GetFindDongTaiRequest extends JavaCommonRequest {
    public String positionId;					//	in		位置id，综合商场首页传1；发现首页传2
    public String useScope	;					//in		使用范围 0-平台 1-综合商城 。
;

    public GetFindDongTaiRequest() {
        // TODO Auto-generated constructor stub
        setMethodName("/v4/ads/queryAdsBulletin");
        request_method = JavaJsonNetwork.TYPE_DEFAULT;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = new HashMap<String, Object>();
        in.put("useScope", useScope);
        in.put("positionId", positionId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        if (null == json) {
            return null;
        }
        FindDongTaiResponse rs = JacksonUtil.readValue(json, FindDongTaiResponse.class);
        if(rs==null){
            rs = new FindDongTaiResponse();
        }
        return rs;
    }
}

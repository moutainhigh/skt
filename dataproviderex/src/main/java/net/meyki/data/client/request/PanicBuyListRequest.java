package net.meyki.data.client.request;

import org.codehaus.jackson.type.TypeReference;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.domain.UserAddressItem;
import net.meyki.data.client.response.PanicBuyListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/4.
 */
public class PanicBuyListRequest extends JavaCommonRequest {

    public UserAddressItem item  = new UserAddressItem();

    public PanicBuyListRequest(){
        //this.setMethodName("tastes/getCollectList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = new HashMap<String, Object>();
        in.put("userId",userId);
        in.put("pageNo",pageNo);
        in.put("pageSize",pageSize);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        if (null == json) {
            return null;
        }
       // MineCollectionResponse rs = JacksonUtil.readValue(json, new TypeReference<MineCollectionResponse>() {
        PanicBuyListResponse rs = JacksonUtil.readValue(json, new TypeReference<PanicBuyListResponse>() {
        });
        return rs;
    }
}

package net.meyki.data.client.request;

import net.meyki.data.client.response.GetUserAddressListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取用户地址列表时请求
 * Created by Administrator on 2016/5/4.
 */
public class GetUserAddressListRequest extends JavaCommonRequest {

    public GetUserAddressListRequest(){
        this.setMethodName("goods/orderAddressList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in  = initHashMap();
        in.put("userId",userId);
        in.put("pageNo",pageNo);
        in.put("pageSize",pageSize);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {

        GetUserAddressListResponse gal = JacksonUtil.readValue(json,GetUserAddressListResponse.class);
        if(gal ==  null){
            gal = new GetUserAddressListResponse();
        }
        return gal;
    }
}

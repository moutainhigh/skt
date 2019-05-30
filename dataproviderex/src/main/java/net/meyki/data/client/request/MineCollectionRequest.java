package net.meyki.data.client.request;

import net.meyki.data.client.domain.UserAddressItem;
import net.meyki.data.client.response.MineCollectionResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/4.
 */
public class MineCollectionRequest extends JavaCommonRequest {

    public UserAddressItem item  = new UserAddressItem();
    public String collectType;

    public MineCollectionRequest(){
        this.setMethodName("tastes/getCollectList");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in =initHashMap();
        in.put("userId",userId);
        in.put("pageNo",pageNo);
        in.put("pageSize",pageSize);
        in.put("collectType",collectType);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        if (null == json) {
            return null;
        }


        MineCollectionResponse rs = FastJsonUtil.getObjectTFromJson(json, MineCollectionResponse.class);

        return rs;
    }
}

package net.meyki.data.client.request;

import net.meyki.data.client.domain.UserAddressItem;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/4.
 */
public class SaveUserAddressRequest extends JavaCommonRequest {

    public UserAddressItem item  = new UserAddressItem();

    public SaveUserAddressRequest(){
        this.setMethodName("goods/orderAddressUpdate");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = new HashMap<String, Object>();
        in.put("userId",userId);
        in.put("addressName",item.addressName);
        in.put("phone",item.phone);
        in.put("province",item.province);
        in.put("city",item.city);
        in.put("county",item.county);
        in.put("address",item.address);
        in.put("deliveryAddressId",item.deliveryAddressId);
        in.put("zipcode",item.postCode);
        in.put("is_default",item.isDefault);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}

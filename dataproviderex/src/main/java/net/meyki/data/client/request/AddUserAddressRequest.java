package net.meyki.data.client.request;

import net.meyki.data.client.domain.UserAddressItem;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/5/4.
 */
public class AddUserAddressRequest extends JavaCommonRequest {

    public UserAddressItem item  = new UserAddressItem();

    public AddUserAddressRequest(){
        this.setMethodName("goods/orderAddressAdd");
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
        in.put("postCode",item.postCode);
        in.put("isDefault",item.isDefault);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}

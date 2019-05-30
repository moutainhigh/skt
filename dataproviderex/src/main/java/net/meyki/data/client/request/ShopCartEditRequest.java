package net.meyki.data.client.request;

import net.meyki.data.client.domain.CartGoodEditBean;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/6.
 */
public class ShopCartEditRequest extends JavaCommonRequest {
    public ShopCartEditRequest(){
        this.setMethodName("superiorProducts/editShoppingCar");
    }

    public int tag;//0:易家 1:易商
    public String os;//客户端类型
    public String userId;//用户id
    public List<CartGoodEditBean> cartInfo;//shangpingliebiao
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = initHashMap();
        input.put("userId",userId);
        input.put("cartInfo",cartInfo);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}

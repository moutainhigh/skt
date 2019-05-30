package net.meyki.data.client.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/6.
 */
public class DeleteCartGoodRequest extends JavaCommonRequest {
    public DeleteCartGoodRequest() {
        this.setMethodName("superiorProducts/deleteShoppingCar");
    }

    public String userId;//用户id
    public List<String> shopingCartGoodsId;//shangpingliebiao

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> input = new HashMap<String, Object>();
        input.put("userId", userId);
        input.put("shopingCartGoodsId", shopingCartGoodsId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}

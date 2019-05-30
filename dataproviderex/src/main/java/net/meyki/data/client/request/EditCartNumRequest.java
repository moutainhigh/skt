package net.meyki.data.client.request;

import net.meyki.data.client.response.EditCartNumResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/7/4.
 */
public class EditCartNumRequest extends JavaCommonRequest {
    public EditCartNumRequest(){
        this.setMethodName("v4/goodsSpec/checkInventory");
    }

    public String userId;//0:易家 1:易商
    public String goodsId;//客户端类型
    public int goodsNum;//用户id
    public String specId;//规格id

    //{"userId":"920d2f3190e248bfb616e2a6a4926b5c","goodsId":"63eb60c10d6d4228915bb5ce1ec34bda","goodsNum":2,"tag":0,"os":"android"}
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input =initHashMap();
        input.put("userId",userId);
        input.put("goodsId",goodsId);
        input.put("goodsNum",goodsNum);
        input.put("specId",specId);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        EditCartNumResponse sc = new EditCartNumResponse();
        sc = FastJsonUtil.getObjectTFromJson(json, EditCartNumResponse.class);
        return sc;
    }
}

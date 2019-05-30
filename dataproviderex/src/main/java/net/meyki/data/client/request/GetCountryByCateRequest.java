package net.meyki.data.client.request;

import net.meyki.data.client.response.GetCountryByCateResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 根据分类查询商品列表
 * Created by Administrator on 2016/5/16.
 */
public class GetCountryByCateRequest extends JavaCommonRequest {

    public String cateId;

    public String cityName;

    public GetCountryByCateRequest(){
        this.setMethodName("tastes/getGoodsList");
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = new HashMap<String,Object>();
        in.put("cateId",cateId);
        in.put("cityName",cityName);
        in.put("userId",userId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetCountryByCateResponse  gbc = JacksonUtil.readValue(json,GetCountryByCateResponse.class);
        if(gbc == null){
            gbc = new GetCountryByCateResponse();
        }
        return gbc;
    }
}

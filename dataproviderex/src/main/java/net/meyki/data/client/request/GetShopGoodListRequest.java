package net.meyki.data.client.request;

import net.meyki.data.distributon.response.GetShopGoodListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取优品商品列表时请求
 * Created by Administrator on 2016/4/28.
 */
public class GetShopGoodListRequest  extends JavaCommonRequest{

    public GetShopGoodListRequest(){
        this.setMethodName("superiorProducts/queryIndex");
    }

    public String provinceName;
    public String cityName;
    public String areaName;


    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in  = new HashMap<String,Object>();
        in.put("pageSize",pageSize);
        in.put("pageNo",pageNo);
        in.put("userId",userId);
        in.put("provinceName",provinceName);
        in.put("cityName",cityName);
        in.put("areaName",areaName);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
//        glr = new GetShopGoodListResponse();
        GetShopGoodListResponse glr = JacksonUtil.readValue(json,GetShopGoodListResponse.class);
        return glr;
    }
}

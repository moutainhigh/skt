package net.meyki.data.client.request;

import net.meyki.data.client.response.HomeSearchResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * Created by hl on 2016/12/12.
 */
public class HomeSearchRequest extends JavaCommonRequest {
    public String keywords;
    public String pageNo;
    public String pageSize;
    public HomeSearchRequest(){
        this.setMethodName("v4/homeEhIndex/homeSearchSpecialty");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = initHashMap();
        in.put("userId",userId);
        in.put("keywords",keywords);
        /* 添加分页显示 新增请求参数 */
        in.put("pageNo",pageNo);
        in.put("pageSize",pageSize);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        HomeSearchResponse  hsr = FastJsonUtil.getObjectTFromJson(json,HomeSearchResponse.class);
        if(hsr == null){
            hsr = new HomeSearchResponse();
        }
        return hsr;
    }
}

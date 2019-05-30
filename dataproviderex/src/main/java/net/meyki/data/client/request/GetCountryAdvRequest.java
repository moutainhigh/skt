package net.meyki.data.client.request;

import net.meyki.data.client.response.GetCountryListAdvResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 获取乡味首页面幻灯片广告位请求
 * Created by Administrator on 2016/5/16.
 */
public class GetCountryAdvRequest extends JavaCommonRequest {
    public  GetCountryAdvRequest(){
        this.setMethodName("tastes/getMallGallary");
    }

    public String city;

    public String province;
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in  = new HashMap<String,Object>();
        in.put("userId",userId);
        in.put("province",province);
        in.put("city",city);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        GetCountryListAdvResponse glr = JacksonUtil.readValue(json,GetCountryListAdvResponse.class);
        if(glr== null){
            glr = new GetCountryListAdvResponse();
        }
        return glr;
    }
}

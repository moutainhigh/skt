package net.meyki.data.client.request;

import net.meyki.data.client.domain.CountryTopBean;
import net.meyki.data.client.response.GetCountryListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;
import java.util.List;

/**
 * 乡味首页面列表数据请求
 * Created by Administrator on 2016/5/16.
 */
public class GetCountryListRequset extends JavaCommonRequest {

    public GetCountryListRequset() {
        this.setMethodName("tastes/getCateAndShow");
    }

    public String province;
    public String city;
    public int is_feature;
    public String keywords;
    public String type; //特色馆分类code(全部传空)
    public List<CountryTopBean> list;

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = initHashMap();
        in.put("userId", userId);
        in.put("province", province);
        in.put("city", city);
        in.put("isFeature", is_feature);
        in.put("keywords", keywords);
        in.put("type", type);
        in.put("list", list);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {

        GetCountryListResponse glr = JacksonUtil.readValue(json, GetCountryListResponse.class);
        if (glr == null) {
            glr = new GetCountryListResponse();
        }
        return glr;
    }

}

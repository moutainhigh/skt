package net.meyki.data.client.request;

import net.meyki.data.client.response.BrendChainReponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 *
 * Created by lxy on 2016/7/28 0028.
 */
public class BrandChainrRequest extends JavaCommonRequest{
    public String keywords;//				in		String								OPTION		搜索关键字
    public String pageNo;//						in		String								YES		页码
    public String brandType;//1:guang shang chang 0:pin pai lian suo
    public BrandChainrRequest(){
        this.setMethodName("v3/homepageItem/queryBrandAll");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String , Object> input  = new HashMap<String , Object>();
        input.put("keywords",keywords);
        input.put("pageNo",pageNo);
        input.put("brandType",brandType);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        BrendChainReponse nsr = new BrendChainReponse();
        nsr = FastJsonUtil.getObjectTFromJson(json, BrendChainReponse.class);
        return nsr;
    }
}

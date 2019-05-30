package net.meyki.data.share.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.COrderSeasonResponse;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * 项目名称：net.meyki.data.share.request
 * 项目版本：user-4.5.8
 * 创建人：lxy
 * 创建时间：2017/7/14 0014 下午 02:36
 * 修改人：Administrator
 * 修改时间：2017/7/14 0014 下午 02:36
 * 类描述：订单取消原因
 * 修改备注：
 */
public class COrderSeasonRequest extends JavaCommonRequest {
    public COrderSeasonRequest(){
        this.setMethodName("superiorProducts/getCancelOrderReasons");
    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = initHashMap();
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        COrderSeasonResponse sc = new COrderSeasonResponse();
        sc = FastJsonUtil.getObjectTFromJson(json, COrderSeasonResponse.class);
        return sc;
    }
}

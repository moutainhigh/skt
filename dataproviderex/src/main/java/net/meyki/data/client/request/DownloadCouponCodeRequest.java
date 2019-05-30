package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;

/**
 * 项目名称：net.meyki.data.client.request
 * 项目版本：user-4.5.0
 * 创建人：Daimhim
 * 创建时间：2017/7/11 14:57
 * 修改人：Daimhim
 * 修改时间：2017/7/11 14:57
 * 类描述：
 * 修改备注：
 */

public class DownloadCouponCodeRequest extends JavaCommonRequest {
    public DownloadCouponCodeRequest() {
        requestType = OkHttpUtil.RequestType.DOWNLOAD;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        return initHashMap();
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception, JSONException {
        return null;
    }
}

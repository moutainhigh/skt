package net.meyki.data.distributon.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/4/28.
 */
public class UpdateZanStatusRequest extends JavaCommonRequest {

    public String goodsId;

    public String  status;

    public UpdateZanStatusRequest(){
        this.setMethodName("superiorProducts/doLike");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in = new HashMap<String, Object>();
        in.put("goodsId",goodsId);
        in.put("os",dev_os);
        in.put("tag",dev_tag);
        in.put("status",status);
        in.put("userId",userId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}

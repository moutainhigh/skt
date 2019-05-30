package net.meyki.data.client.request;

import net.meyki.skt.utils.JacksonUtil;
import net.meyki.data.client.response.RefundPictureReponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;

import org.codehaus.jackson.type.TypeReference;

import java.util.HashMap;

/**
 * Created by Daimhim on 2017/1/17.
 */

public class RefundPictureRequest extends JavaCommonRequest {
    public RefundPictureRequest() {
        this.setMethodName("v4/v409refond/uploadImg");
        this.request_method = JavaJsonNetwork.TYPE_UPLOAD_PHOTO;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("userId", userId);
        return params;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        if (null == json) {
            return null;
        }
        RefundPictureReponse rs = JacksonUtil.readValue(json, new TypeReference<RefundPictureReponse>() {
        });
        return rs;
    }
}

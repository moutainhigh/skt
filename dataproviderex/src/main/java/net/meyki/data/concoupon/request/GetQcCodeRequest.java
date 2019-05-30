package net.meyki.data.concoupon.request;

import net.meyki.data.concoupon.response.GetQcCodeResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 项目名称：4.2.8
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/3/30 18:37
 * 修改人：meyki-bear
 * 修改时间：2017/3/30 18:37
 * 修改备注：
 */

public class GetQcCodeRequest extends JavaCommonRequest {
    public String originShopId;//派券店铺ID（当tag为1时有效）
    public String originUserId; //派券用户ID（当tag为0时有效）
    public String counponAmount; //counponAmount

    public GetQcCodeRequest() {
        setMethodName("v4/luckybag/getQcCode");
    }


    @Override
    public JavaCommonResponse getOutputResponse(String paramStream) {
        // TODO Auto-generated method stub
        GetQcCodeResponse gqc=new GetQcCodeResponse();
        gqc.json=paramStream;
//        GetLuckBegInfoResponse cr = new GetLuckBegInfoResponse();
//        cr = JacksonUtil.readValue(paramStream, GetLuckBegInfoResponse.class);
        return gqc;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> param = new HashMap<String, Object>();
        param.put("user_id", userId);
        param.put("tag", dev_tag);
        param.put("os", dev_os);
        param.put("originShopId", originShopId);
        param.put("originUserId", originUserId);
        param.put("counponAmount", counponAmount);
        return param;
    }
}

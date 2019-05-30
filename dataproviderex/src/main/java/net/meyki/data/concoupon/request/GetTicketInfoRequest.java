package net.meyki.data.concoupon.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.concoupon.response.GetTicketInfoResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * 项目名称：4.2.8
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/3/29 20:39
 * 修改人：meyki-bear
 * 修改时间：2017/3/29 20:39
 * 修改备注：
 */

public class GetTicketInfoRequest extends JavaCommonRequest {
    public String fkFundPoolId;//资金池id
    public String originType;//来源类型(1=手机发送,2=面对面,不传查询全部)
    public String batchId; //消费券批次id
    @Override
    public String getMethodName() {
        return "v4/ticket/userapp/getTicketInfo";
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = new HashMap<String, Object>();
        in.put("os", dev_os);
        in.put("tag", dev_tag);
        in.put("pageSize", pageSize);
        in.put("pageNo", pageNo);
        in.put("fkFundPoolId", fkFundPoolId);
        in.put("originType", originType);
        in.put("batchId", batchId);
        in.put("userId", userId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws Exception {
        GetTicketInfoResponse cr = JacksonUtil.readValue(json, GetTicketInfoResponse.class);
        return cr;
    }
}

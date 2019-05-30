/**
 *
 */
package net.meyki.data.share.request;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.response.GetCommucationUserInfoResponse;
import net.meyki.data.utils.JacksonUtil;

import java.util.HashMap;

/**
 * @author 作者 E-mail:
 * @version 创建时间：2016年5月5日 下午7:37:31
 *          类说明  取消用户关注
 */

public class ModifyRemarkRequest extends JavaCommonRequest {
    public ModifyRemarkRequest() {
        this.setMethodName("community/updateRemarkName");
    }

    public String ownerId;
    public String remarkName;
    public String communityId;
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> in = new HashMap<String, Object>();
        in.put("userId", userId);
        in.put("ownerId", ownerId);
        in.put("remarkName",remarkName);
        in.put("communityId",communityId);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }

}

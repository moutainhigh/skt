package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.HashMap;

/**
 * 项目名称：net.meyki.data.client.request
 * 项目版本：user-trunk
 * 创建人：Daimhim
 * 创建时间：2017/6/5 11:51
 * 修改人：Daimhim
 * 修改时间：2017/6/5 11:51
 * 类描述：
 * 修改备注：
 */

public class LikeArticleRequest extends JavaCommonRequest {
    public String status;   //	YES	string	0:点赞/关注 1:取消点赞/关注
    public String type;   //	YES	string	1：点赞，2：喜欢(关注)
    public String userId;   //	YES	string	用户id
    public String articleId;   //	YES	string	文章ID

    public LikeArticleRequest() {
        setMethodName("v4/ehDiscover/likeArticle");
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("status", status);
        hashMap.put("type", type);
        hashMap.put("userId", userId);
        hashMap.put("articleId", articleId);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return null;
    }
}

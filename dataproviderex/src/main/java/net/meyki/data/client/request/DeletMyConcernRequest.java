package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version $Rev
 * @time 2017/5/9 11:57
 * @updateAuthor $Author
 * @updateDate 2017/5/9
 * @updateDes ${TODO}
 * <p>
 * Created by Daimhim on 2017/5/9.
 */

public class DeletMyConcernRequest extends JavaCommonRequest {
    public String concernType;   //文章传1，店铺传2
    public List<Map<String,String>> concernIds;   //取消关注的ID数组 例：[3581,3582]

    public DeletMyConcernRequest() {
        setMethodName("v3/disc/deleteMyConcern");
        requestType = OkHttpUtil.RequestType.POST;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("concernType",concernType);
        hashMap.put("concernIds",concernIds);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        return null;
    }
}

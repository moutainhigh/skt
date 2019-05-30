package net.meyki.data.client.request;

import com.alibaba.fastjson.JSONException;

import net.meyki.data.client.domain.MyConcernListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.okhttp.OkHttpUtil;
import net.meyki.data.utils.FastJsonUtil;

import java.util.HashMap;

/**
 * @version $Rev
 * @time 2017/5/9 10:35
 * @updateAuthor $Author
 * @updateDate 2017/5/9
 * @updateDes ${TODO}
 * <p>deleteMyConcern
 * Created by Daimhim on 2017/5/9.
 */

public class GetMyConcernListRequest extends JavaCommonRequest {
    public String concernType;			//文章传1，店铺传2
    public String pageSize;			//每页数量
    public String pageNo;			//分页页数
    public String type; // 2";
    public String areaCode; // //区域过滤代码
    public String articalType; // 文章所属类型


    public GetMyConcernListRequest() {
        setMethodName("v3/disc/getMyConcernList");
        requestType = OkHttpUtil.RequestType.GET;
    }

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String, Object> hashMap = initHashMap();
        hashMap.put("concernType",concernType);
        hashMap.put("pageSize",pageSize);
        hashMap.put("pageNo",pageNo);
        hashMap.put("type",type);
        hashMap.put("userId",userId);
        hashMap.put("areaCode",areaCode);
        hashMap.put("articalType",articalType);
        return hashMap;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) throws JSONException, Exception {
        MyConcernListResponse rs = FastJsonUtil.getObjectTFromJson(json, MyConcernListResponse.class);
        return rs;
    }
}

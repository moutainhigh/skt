package net.meyki.data.client.request;

import net.meyki.data.client.domain.DeleteOrderIdBean;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;
import java.util.List;

/**
 * 删除订单时请求
 * Created by Administrator on 2016/5/7.
 */
public class DelToStoreOrderRequest extends JavaCommonRequest{
    public String userId;//						in		String				1		1		YES		用户id
    public String flag;//						in		String								YES
    public List<DeleteOrderIdBean> orderList;

    public DelToStoreOrderRequest(){
        setMethodName("v3/orderInfo/patchDeleteOrder");
        request_method = JavaJsonNetwork.TYPE_DELETE_DATA;
        requestType = OkHttpUtil.RequestType.DELETE;

    }
    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> in =initHashMap();
        in.put("userId",userId);
        in.put("flag",flag);
        in.put("orderList",orderList);
        return in;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }

}

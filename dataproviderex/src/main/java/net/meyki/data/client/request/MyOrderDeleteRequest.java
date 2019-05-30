package net.meyki.data.client.request;

import net.meyki.data.client.domain.DeleteOrderIdBean;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.okhttp.OkHttpUtil;

import java.util.HashMap;
import java.util.List;

/**
 * 删除订单
 * Created by lxy on 2016/8/18 0018.
 */
public class MyOrderDeleteRequest extends JavaCommonRequest{

    public MyOrderDeleteRequest(){
        this.setMethodName("v3/orderInfo/patchDeleteOrder");
        request_method = JavaJsonNetwork.TYPE_DELETE_DATA;
        requestType = OkHttpUtil.RequestType.DELETE;
    }

    public String userId;//						in		String				1		1		YES		用户id
    public String flag;//						in		String								YES  预定订单传1
    public List<DeleteOrderIdBean> orderList;

    @Override
    public HashMap<String, Object> getInputMap() {
        HashMap<String,Object> input = new HashMap<String, Object>();
        input.put("userId",userId);
        input.put("flag",flag);
        input.put("orderList",orderList);
        return input;
    }

    @Override
    public JavaCommonResponse getOutputResponse(String json) {
        return null;
    }
}

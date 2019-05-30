package net.meyki.data.client.response;

import net.meyki.data.client.domain.MyReOrderShopListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class GetMyReserveOrderListResponse extends JavaCommonResponse {
    public Map<String,String> extData = new HashMap<String,String>();//其它数据
    public int totalRecords;//			总记录数
    public int pages;//					总页数
    public boolean hasNext;//			是否有下一页,true:有下一页，false：无下一页
    public List<MyReOrderShopListBean> list = new ArrayList<MyReOrderShopListBean>();
}

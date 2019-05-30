package net.meyki.data.client.response;

import net.meyki.data.client.domain.OrderListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/28.
 */
public class GetOrderListResponse extends JavaCommonResponse {
    public String extData;
    public String totalRecords;
    public String pages;
    public boolean hasNext;
    public List<OrderListBean> list = new ArrayList<OrderListBean>();
}

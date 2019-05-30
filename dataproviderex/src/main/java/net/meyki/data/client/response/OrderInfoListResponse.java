package net.meyki.data.client.response;

import net.meyki.data.client.domain.AdvItem;
import net.meyki.data.client.domain.OrderInfoListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * Created by Administrator on 2016/4/28.
 */
public class OrderInfoListResponse extends JavaCommonResponse {
    public String company;
    public String logisticsNo;

    public List<OrderInfoListBean> list;
}

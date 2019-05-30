package net.meyki.data.client.response;

import net.meyki.data.client.domain.OrderInfoBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/6.
 */
public class OrderManagerResponse extends JavaCommonResponse{
    public List<OrderInfoBean> list = new ArrayList<OrderInfoBean>();
}

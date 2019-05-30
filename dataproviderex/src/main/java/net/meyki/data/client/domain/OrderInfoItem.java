package net.meyki.data.client.domain;


import java.util.ArrayList;
import java.util.List;

public class OrderInfoItem {

    public String orderSn;//订单编号
    public String orderId;//订单id
    public String status;//当前订单的状态
    public String userId;
    public String totalPrice;
    public String createTime;
    public String logisticsNum;//物流单号
    public String logisticsMsg;//物流状态
    public String payTime;
    public String receiver;
    public String address;
    public String mobile;
    public String county;
    public String province;
    public String city;
    public String deliverDesc;
    public String isDeliver;//是否配送
    public List<OrderGoodListItem> goodsList = new ArrayList<OrderGoodListItem>();




}

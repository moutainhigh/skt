package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/4.
 */
public class itemListBean implements Serializable {
    public String itemId;
    public String goodsId;//推荐商品id
    public String imgUrl;//图片url
    public String status;//0默认1推荐中
    public String itemName;//0默认1推荐中
    public List<itemInfoBean> dataList = new ArrayList<itemInfoBean>();// 充值信息
}

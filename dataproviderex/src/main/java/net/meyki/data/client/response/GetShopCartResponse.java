package net.meyki.data.client.response;

import net.meyki.data.client.domain.ShopCartBean;
import net.meyki.data.json.JavaCommonResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lxy on 2016/7/4.
 */
public class GetShopCartResponse extends JavaCommonResponse {

//    public ShopCartListBean bean = new ShopCartListBean();
    public List<ShopCartBean> shopList = new ArrayList<ShopCartBean>();
}

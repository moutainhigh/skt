package net.meyki.data.client.response;

import net.meyki.data.client.domain.ShopCartGoodsBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20 0020.
 */
public class ShopCartRecResponse extends JavaCommonResponse {
    public List<ShopCartGoodsBean> goodsList = new ArrayList<ShopCartGoodsBean>();
}

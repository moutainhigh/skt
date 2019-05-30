package net.meyki.data.distributon.response;

import net.meyki.data.distributon.domain.ShopGoodBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/28.
 */
public class GetShopGoodListResponse  extends JavaCommonResponse{

    public  int totalRecords;
    public int pages;
    public boolean  hasNext;
    public String extData;
    public List<ShopGoodBean> list = new ArrayList<ShopGoodBean>();

}

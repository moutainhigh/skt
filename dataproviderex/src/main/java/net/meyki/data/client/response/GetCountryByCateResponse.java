package net.meyki.data.client.response;

import net.meyki.data.client.domain.CountryGoodListItem;
import net.meyki.data.client.domain.CountryListItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/17.
 */
public class GetCountryByCateResponse extends JavaCommonResponse {

    public List<CountryGoodListItem> goodsList = new ArrayList<CountryGoodListItem>();
    public String isCollect;

}

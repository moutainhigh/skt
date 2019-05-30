package net.meyki.data.client.response;

import net.meyki.data.client.domain.Cate;
import net.meyki.data.client.domain.CityInfo;
import net.meyki.data.client.domain.CountryListItem;
import net.meyki.data.client.domain.MineCollectItem;
import net.meyki.data.client.domain.PanicBuyListItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/16.
 */
public class PanicBuyListResponse extends JavaCommonResponse{
    public List<PanicBuyListItem> list = new ArrayList<PanicBuyListItem>();
    public String totalRecords;
    public String pages;
    public boolean hasNext;
    public Object extData;
}

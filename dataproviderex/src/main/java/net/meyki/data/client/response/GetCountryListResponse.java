package net.meyki.data.client.response;

import net.meyki.data.client.domain.Cate;
import net.meyki.data.client.domain.CityInfo;
import net.meyki.data.client.domain.CountryListItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/16.
 */
public class GetCountryListResponse  extends JavaCommonResponse{
    public List<Cate>  cate = new ArrayList<Cate>();
    public CityInfo defaultCity;
    public List<CityInfo> hotCity = new ArrayList<CityInfo>();
    public List<CountryListItem> countyInfo = new ArrayList<CountryListItem>();

}

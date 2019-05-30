package net.meyki.data.client.response;

import net.meyki.data.client.domain.CountryAdvListItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/18.
 */
public class GetCountryListAdvResponse  extends JavaCommonResponse{
    public List<CountryAdvListItem> galleryList  = new ArrayList<CountryAdvListItem>();
}

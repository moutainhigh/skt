package net.meyki.data.client.response;

import net.meyki.data.client.domain.SearchFilterSortBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;


/**
 * Created by Knight on 2017/6/20.
 */

public class SearchFilterSortResponse extends JavaCommonResponse {

    public List<SearchFilterSortBean> list;

}

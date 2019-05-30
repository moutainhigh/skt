package net.meyki.data.client.response;

import net.meyki.data.client.domain.SearchFilterAreaBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight on 2017/6/20.
 */

public class SearchFilterAreaResponse extends JavaCommonResponse {

    public List<SearchFilterAreaBean> list = new ArrayList<>();

}

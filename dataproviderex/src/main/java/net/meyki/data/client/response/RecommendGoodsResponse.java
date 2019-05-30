package net.meyki.data.client.response;

import net.meyki.data.client.domain.RecommendGoodsBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight on 2017/4/18.
 */

public class RecommendGoodsResponse extends JavaCommonResponse {
    public String extData;
    public String recommendCategoryId;
    public String hasNext;
    public String pages;
    public String totalRecords;
    public List<RecommendGoodsBean> list = new ArrayList<>();


}

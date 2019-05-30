package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 首页推荐分类列表
 * Created by Knight on 2017/6/14.
 */

public class SearchFilterSortBean implements Serializable {
    public String categoryId;
    public String categoryCnName;
    public boolean isChoose;

    public SearchFilterSortBean(String categoryCnName, String categoryId,boolean isChoose) {
        this.categoryCnName = categoryCnName;
        this.categoryId = categoryId;
        this.isChoose = isChoose;
    }

    public SearchFilterSortBean() {
    }
}

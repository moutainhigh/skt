package net.meyki.data.client.response;


import net.meyki.data.client.domain.itemInfoBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

public class QueryDistrictShopListResponse extends JavaCommonResponse {

    /**
     *
     */
    private static final long serialVersionUID = 4688960317750664268L;
    public boolean hasNext;
    public String extData;
    public int totalRecords;
    public int pages;
    public List<itemInfoBean> list = new ArrayList<itemInfoBean>();
}

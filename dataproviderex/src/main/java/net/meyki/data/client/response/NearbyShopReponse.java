package net.meyki.data.client.response;

import net.meyki.data.client.domain.NearbyShopBean;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/9.
 */
public class NearbyShopReponse extends JavaCommonResponse {
    public List<NearbyShopBean> list = new ArrayList<NearbyShopBean>();
    public int totalRecords;
    public int pages;
    public boolean hasNext;
    public String extData;
    public String getExtData() {
        return extData;
    }

    public void setExtData(String extData) {
        this.extData = extData;
    }


    public List<NearbyShopBean> getList() {
        return list;
    }

    public void setList(List<NearbyShopBean> list) {
        this.list = list;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

}

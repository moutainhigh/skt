package net.meyki.data.client.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 我的足迹
 */
public class MyFootprintBean {
    private String time;
    private List<MyFootprintItemBean> goodsList = new ArrayList<>();
    private String select;

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getScanDate() {
        return time;
    }

    public void setScanDate(String time) {
        this.time = time;
    }

    public List<MyFootprintItemBean> getDataList() {
        return goodsList;
    }

    public void setDataList(List<MyFootprintItemBean> dataList) {
        this.goodsList = dataList;
    }


}

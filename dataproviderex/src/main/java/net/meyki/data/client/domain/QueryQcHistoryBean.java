package net.meyki.data.client.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class QueryQcHistoryBean {
    private String scanDate;  //扫描日期
    private List<QueryQcHistoryItemBean> dataList = new ArrayList<>();
    private String select;

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getScanDate() {
        return scanDate;
    }

    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    public List<QueryQcHistoryItemBean> getDataList() {
        return dataList;
    }

    public void setDataList(List<QueryQcHistoryItemBean> dataList) {
        this.dataList = dataList;
    }
}

package net.meyki.data.client.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class IncomeDetailGroupBean  implements Serializable {
    private String scanDate;  //扫描日期
    private List<IncomeDetailChildBean> list = new ArrayList<>();
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

    public List<IncomeDetailChildBean> getDataList() {
        return list;
    }

    public void setDataList(List<IncomeDetailChildBean> dataList) {
        this.list = dataList;
    }
}

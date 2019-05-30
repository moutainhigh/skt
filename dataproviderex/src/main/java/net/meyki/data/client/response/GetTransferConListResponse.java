package net.meyki.data.client.response;

import net.meyki.data.client.domain.TransferConItem;
import net.meyki.data.json.JavaCommonResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/29.
 */
public class GetTransferConListResponse extends JavaCommonResponse {

    private String extData;
    private String totalRecords;
    private String pages;
    private String hasNext;

    private List<TransferConItem> list;

    public List<TransferConItem> getList() {
        return list;
    }

    public void setList(List<TransferConItem> list) {
        this.list = list;
    }

    public String getExtData() {
        return extData;
    }

    public void setExtData(String extData) {
        this.extData = extData;
    }

    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getHasNext() {
        return hasNext;
    }

    public void setHasNext(String hasNext) {
        this.hasNext = hasNext;
    }
}

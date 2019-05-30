package net.meyki.data.client.domain;

import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * @version $Rev
 * @time 2017/5/9 10:40
 * @updateAuthor $Author
 * @updateDate 2017/5/9
 * @updateDes ${TODO}
 * <p>
 * Created by Daimhim on 2017/5/9.
 */

public class MyConcernListResponse extends JavaCommonResponse {
    private String extData;	     //YES		返回1：文章，2：店铺
    private String totalRecords;	     //YES		总页数
    private String pages;	     //YES		返回的数据
    private boolean hasNext;	     //YES		是否有下一页,true:有下一页，false：无下一页
    private List<MyConcernListItemBean> list;//（如果concernType参数传1，返回数据参考v3/disc/getDiscoverList）

    public String getExtData() {
        return extData;
    }

    public void setExtData(String extData) {
        this.extData = extData;
    }

    public String getTotalRecord() {
        return totalRecords;
    }

    public void setTotalRecord(String totalRecord) {
        totalRecords = totalRecord;
    }

    public String getPage() {
        return pages;
    }

    public void setPage(String page) {
        pages = page;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public List<MyConcernListItemBean> getList() {
        return list;
    }

    public void setList(List<MyConcernListItemBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MyConcernListResponse{" +
                "extData='" + extData + '\'' +
                ", totalRecords='" + totalRecords + '\'' +
                ", pages='" + pages + '\'' +
                ", hasNext='" + hasNext + '\'' +
                ", list=" + list +
                '}';
    }
}

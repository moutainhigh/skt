package net.meyki.data.client.response;

import net.meyki.data.client.domain.DiscTagArticleListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * 项目名称：net.meyki.data.client.response
 * 项目版本：user-trunk
 * 创建人：Daimhim
 * 创建时间：2017/6/5 11:27
 * 修改人：Daimhim
 * 修改时间：2017/6/5 11:27
 * 类描述：
 * 修改备注：
 */

public class DiscTagArticleListResponse extends JavaCommonResponse {
    private String totalRecords;  //			String	YES	总记录数
    private String pages;  //			String	YES	总页数
    private boolean hasNext;    //		String	YES	是否有下一页,true:有下一页，false：无下一页
    private List<DiscTagArticleListBean> list; //			JSONArray	YES	分页数据

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

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public List<DiscTagArticleListBean> getList() {
        return list;
    }

    public void setList(List<DiscTagArticleListBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "DiscTagArticleListResponse{" +
                "totalRecords='" + totalRecords + '\'' +
                ", pages='" + pages + '\'' +
                ", hasNext=" + hasNext +
                ", list=" + list +
                '}';
    }
}

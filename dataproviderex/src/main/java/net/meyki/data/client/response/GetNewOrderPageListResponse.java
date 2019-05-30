package net.meyki.data.client.response;

import net.meyki.data.client.domain.GetNewOrderPageListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * 项目名称：net.meyki.data.client.response
 * 项目版本：user-4.5.0
 * 创建人：Daimhim
 * 创建时间：2017/6/28 18:34
 * 修改人：Daimhim
 * 修改时间：2017/6/28 18:34
 * 类描述：
 * 修改备注：
 */

public class GetNewOrderPageListResponse extends JavaCommonResponse {
    private String totalRecords;  //		String	总记录数
    private String pages;		  //String	总页数
    private String hasNext;		  //String	是否有下一页,true:有下一页，false：无下一页
    private List<GetNewOrderPageListBean> list; //		JSONArray	返回的数据

    @Override
    public String toString() {
        return "GetNewOrderPageListResponse{" +
                "totalRecords='" + totalRecords + '\'' +
                ", pages='" + pages + '\'' +
                ", hasNext='" + hasNext + '\'' +
                ", list=" + list +
                '}';
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

    public List<GetNewOrderPageListBean> getList() {
        return list;
    }

    public void setList(List<GetNewOrderPageListBean> list) {
        this.list = list;
    }
}

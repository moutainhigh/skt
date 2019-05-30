package net.meyki.data.client.response;

import net.meyki.data.client.domain.GetNewOrderInfoListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * 项目名称：net.meyki.data.client.response
 * 项目版本：user-4.5.0
 * 创建人：Daimhim
 * 创建时间：2017/6/28 11:24
 * 修改人：Daimhim
 * 修改时间：2017/6/28 11:24
 * 类描述：
 * 修改备注：
 */

public class GetNewOrderInfoListResponse extends JavaCommonResponse {
    private List<GetNewOrderInfoListBean> list;

    public List<GetNewOrderInfoListBean> getList() {
        return list;
    }

    public void setList(List<GetNewOrderInfoListBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "GetNewOrderInfoListResponse{" +
                "list=" + list +
                '}';
    }
}

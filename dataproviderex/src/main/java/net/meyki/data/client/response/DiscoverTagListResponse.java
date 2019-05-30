package net.meyki.data.client.response;

import net.meyki.data.client.domain.DiscoverTagBean;
import net.meyki.data.json.JavaCommonResponse;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 项目名称：net.meyki.data.client.domain
 * 项目版本：user-trunk
 * 创建人：Daimhim
 * 创建时间：2017/6/5 10:47
 * 修改人：Daimhim
 * 修改时间：2017/6/5 10:47
 * 类描述：
 * 修改备注：
 */

public class DiscoverTagListResponse extends JavaCommonResponse {
    private ArrayList<DiscoverTagBean> list;

    public ArrayList<DiscoverTagBean> getList() {
        return list;
    }

    public void setList(ArrayList<DiscoverTagBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "DiscoverTagListResponse{" +
                "list=" + list +
                '}';
    }
}

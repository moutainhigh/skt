package net.meyki.data.client.response;

import net.meyki.data.client.domain.MyFootprintBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class MyFootprintResponse extends JavaCommonResponse {
    private List<MyFootprintBean> list = new ArrayList<>();

    public List<MyFootprintBean> getList() {
        return list;
    }

    public void setList(List<MyFootprintBean> list) {
        this.list = list;
    }
}

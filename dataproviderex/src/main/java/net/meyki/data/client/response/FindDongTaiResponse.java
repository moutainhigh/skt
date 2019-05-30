package net.meyki.data.client.response;

import net.meyki.data.client.domain.AdvTopItem;
import net.meyki.data.client.domain.FindItemBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * Created by hl on 2016/4/28.
 */
public class FindDongTaiResponse extends JavaCommonResponse {
    public List<FindItemBean> list;
    public String intervalTime;
    public List<FindItemBean> getList() {
        return list;
    }
    public void setList(List<FindItemBean> list) {
        this.list = list;
    }
}

package net.meyki.data.client.response;

import net.meyki.data.client.domain.AdvItem;
import net.meyki.data.client.domain.AdvTopItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * Created by hl on 2016/4/28.
 */
public class GetIndexImgTopResponse extends JavaCommonResponse {
    public List<AdvTopItem> list;
    public String intervalTime;
    public List<AdvTopItem> getList() {
        return list;
    }
    public void setList(List<AdvTopItem> list) {
        this.list = list;
    }
}

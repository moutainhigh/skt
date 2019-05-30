package net.meyki.data.client.response;

import net.meyki.data.client.domain.AdvItem;
import net.meyki.data.client.domain.ShopNearbyItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * Created by Administrator on 2016/4/28.
 */
public class GetIndexImgResponse extends JavaCommonResponse {
    public List<AdvItem> list;

    public List<AdvItem> getList() {
        return list;
    }

    public void setList(List<AdvItem> list) {
        this.list = list;
    }
}

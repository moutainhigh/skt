package net.meyki.data.client.response;

import net.meyki.data.client.domain.MineCollectItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/16.
 */
public class MineCollectionResponse extends JavaCommonResponse{
    public List<shopList> list = new ArrayList<>();

    public class shopList{
        public List<MineCollectItem> shopList = new ArrayList();
    }
}

package net.meyki.data.client.response;

import net.meyki.data.client.domain.CategoryItem;
import net.meyki.data.client.domain.CommunityBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/20.
 */
public class GetNearbyInfoResponse extends JavaCommonResponse {

    public List<CategoryItem> itemList = new ArrayList<CategoryItem>();

}

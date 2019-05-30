package net.meyki.data.client.response;

import net.meyki.data.client.domain.articalAdsInfo;
import net.meyki.data.json.JavaCommonResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/4.
 */
public class DiscoveryAdsResponse extends JavaCommonResponse{

    public List<articalAdsInfo> list = new ArrayList<articalAdsInfo>();

}

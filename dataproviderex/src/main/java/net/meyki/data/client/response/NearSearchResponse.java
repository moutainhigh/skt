package net.meyki.data.client.response;

import net.meyki.data.client.domain.NearbySlideBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/8.
 */
public class NearSearchResponse extends JavaCommonResponse {
    public List<NearbySlideBean> list = new ArrayList<NearbySlideBean>();
}

package net.meyki.data.client.response;

import net.meyki.data.client.domain.RecommendItemBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight on 2017/4/18.
 */

public class RecommendItemResponse extends JavaCommonResponse {


    public List<RecommendItemBean> list = new ArrayList<>();
}

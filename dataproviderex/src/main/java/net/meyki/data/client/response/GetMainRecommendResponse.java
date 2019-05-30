package net.meyki.data.client.response;

import net.meyki.data.client.domain.RecommendBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

/**
 * 项目名称：4.3.0
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/4/18 10:29
 * 修改人：meyki-bear
 * 修改时间：2017/4/18 10:29
 * 修改备注：
 */

public class GetMainRecommendResponse extends JavaCommonResponse {

    public ArrayList<RecommendBean> list;
}

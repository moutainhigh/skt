package net.meyki.data.client.response;

import net.meyki.skt.bean.DisRecommendBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * 项目名称：4.4.6
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/6/6 11:20
 * 修改人：meyki-bear
 * 修改时间：2017/6/6 11:20
 * 修改备注：
 */

public class GetDiscArticleListResponse extends JavaCommonResponse {
    private List<DisRecommendBean> list;

    public List<DisRecommendBean> getList() {
        return list;
    }

    public void setList(List<DisRecommendBean> list) {
        this.list = list;
    }
}

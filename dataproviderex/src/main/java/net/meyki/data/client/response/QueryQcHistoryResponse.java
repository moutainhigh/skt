package net.meyki.data.client.response;

import net.meyki.data.client.domain.QueryQcHistoryBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class QueryQcHistoryResponse extends JavaCommonResponse {
    private List<QueryQcHistoryBean> list = new ArrayList<>();

    public List<QueryQcHistoryBean> getList() {
        return list;
    }

    public void setList(List<QueryQcHistoryBean> list) {
        this.list = list;
    }
}

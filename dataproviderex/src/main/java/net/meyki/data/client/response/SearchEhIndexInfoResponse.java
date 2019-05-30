package net.meyki.data.client.response;

import net.meyki.data.client.domain.itemSearchBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 邹德滨 2016-12-13 易家二级页面 搜索功能响应
 * Created by Administrator on 2016/12/13.
 */

public class SearchEhIndexInfoResponse extends JavaCommonResponse {
    private static final long serialVersionUID = 4688960317750664268L;

    public List<itemSearchBean> dataList = new ArrayList<itemSearchBean>();// 充值信息
}

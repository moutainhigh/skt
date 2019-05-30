package net.meyki.data.client.response;

import net.meyki.data.client.domain.FCArticleBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 文章列表
 * Created by lxy on 2017/6/7 0007.
 */
public class FCArticleResponse extends JavaCommonResponse {
    public String totalRecords;
    public String pages;
    public boolean hasNext;
    public List<FCArticleBean> list = new ArrayList<>();
}

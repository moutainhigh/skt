package net.meyki.data.client.response;

import net.meyki.data.client.domain.ArticleInfo;
import net.meyki.data.json.JavaCommonResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/4.
 */
public class DiscoveryInfoResponse extends JavaCommonResponse{

    public String extData;
    public boolean hasNext;
    public int pages;
    public int totalRecords;
    public List<ArticleInfo> list = new ArrayList<ArticleInfo>();
}

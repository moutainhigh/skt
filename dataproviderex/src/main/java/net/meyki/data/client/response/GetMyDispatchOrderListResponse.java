package net.meyki.data.client.response;

import net.meyki.data.client.domain.GetMyDispatchOrderListBean;
import net.meyki.data.client.domain.GetMyResOrderListBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by meiqi on 2016/9/22.
 */
public class GetMyDispatchOrderListResponse extends JavaCommonResponse {
    public String extData;//				out		JSONObject								YES		其它数据
    public int totalRecords;//					out		String								YES		总记录数
    public int pages;//				out		String								YES		总页数
    public boolean hasNext;//				out		boolean								YES		是否有下一页,true:有下一页，false：无下一页
    //public List<GetMyResOrderListBean> list = new ArrayList<GetMyResOrderListBean>();//    商品列表
    public List<GetMyDispatchOrderListBean> list = new ArrayList<GetMyDispatchOrderListBean>();//    商品列表
}

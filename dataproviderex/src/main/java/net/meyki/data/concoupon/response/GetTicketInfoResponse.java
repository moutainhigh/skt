package net.meyki.data.concoupon.response;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.concoupon.domain.ConcouDetailBean;

import java.util.ArrayList;

/**
 * 项目名称：4.2.8
 * 类描述：
 * 创建人：xyp
 * 创建时间：2017/3/29 20:42
 * 修改人：meyki-bear
 * 修改时间：2017/3/29 20:42
 * 修改备注：
 */

public class GetTicketInfoResponse extends JavaCommonResponse {
    public String hasNext; //是否还有下一页
    public String pages; //总记录数
    public String totalRecords; //当前页
    public ArrayList<ConcouDetailBean> list; //明细集合
}

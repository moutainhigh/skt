package net.meyki.data.client.response;

import net.meyki.data.client.domain.DiJinCouponAlobtItemBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.List;

/**
 * 获取已收(消费)优惠卷列表数据
 * Created by lxy on 2017/3/28 0028.
 */
public class DiJinCouponAlobtResponse extends JavaCommonResponse {
    public boolean hasNext;//				是否有下一页
    public String pages;//									总记录数
    public String totalRecords;//		YES		当前页
    public String amountTotal;//		YES		总金额
    public String amountUse;//		YES		总金额
    public List<DiJinCouponAlobtItemBean> list;		//	JSONArray								YES
}

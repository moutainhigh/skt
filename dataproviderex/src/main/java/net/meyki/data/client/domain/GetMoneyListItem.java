package net.meyki.data.client.domain;
/**
 * 收支明细响应回来的每一项数据对应的类型
 * @author Administrator
 */
public class GetMoneyListItem {
	public int id;//收支明细的id
	public String money;//金额
	public String message;//说明
	public String addtime;//交易时间
}

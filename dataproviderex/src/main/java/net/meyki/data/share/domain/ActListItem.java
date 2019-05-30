package net.meyki.data.share.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 活动列表item
 * @author liyc
 *
 */
public class ActListItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3047404125068257609L;
	public String saleInfoId ;
	public int type ; //type 1 会员打折，2会员赠品，3，会员充值

	public String desc ;//描述
	public String info ;//
	public String shopId;//店铺id
	public String startTime;//开始时间
	public String endTime;//结束时间
	public int status;//状态
	public List<String> src;//会员赠品的图片url地址 会员赠品时用到

//会员充值用
	public List<ActChargeItem> amount  = new ArrayList<ActChargeItem>();//满减活动中存储的是用户满减得比例，比如满300减50
	public String name ;//名称
		
}

package net.meyki.data.share.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 活动列表item
 * @author liyc
 *
 */
public class ActManListItem implements Serializable{


	public String activesId ;
	public int type ;
	public String name ;//名称
	public String desc ;//描述
	public String info ;//
	public String shopId;//店铺id
	public String startTime;//开始时间
	public String endTime;//结束时间
	public int status;//状态
	public String addTime;
	public List<ActChargeItem> amount  = new ArrayList<ActChargeItem>();//满减活动中存储的是用户满减得比例，比如满300减50
		
}

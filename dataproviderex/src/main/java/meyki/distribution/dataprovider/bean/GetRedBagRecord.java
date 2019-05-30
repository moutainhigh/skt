package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
/**
 * 红包领取记录
 * 
 * @author Administrator
 *
 */
public class GetRedBagRecord implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -5483550541707042198L;
	//	public int redId;//红包id
	public String is_check;//用于区分商户/店铺
	public int status;//状态 1 被领取,2过期,3领完了
	public long updatetime;//领取时间
	public double money;//代金券数量
	public int user_id;
	public String userName;
	public String userPhoto;
	public int tag;
	public int shopId;
	public String shopName;
	public String shopImg;
	public String shopTel;
	public String shopAddress;
	
}

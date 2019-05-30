package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

/**
 * 红包实体类
 * @author liyc
 */
public class RedPack implements Serializable{
	
	private static final long serialVersionUID = 5830969801429963237L;
	private int rule_id;
	/** 红包名称 */
	private String name;
	/** 红包状态   空值表示没有申请过 1 默认未审核 2 是审核 3 拒绝 4 已经发放 */
	private int is_check;
	/** 开始时间 */
	private String from_time;
	/** 结束时间 */
	private String to_time;
	/** 描述信息  */
	private String description;
	/** 可以使用的商城注册会员 */
	private String member_lv_ids;
	
	private boolean status;

	public int getRule_id() {
		return rule_id;
	}

	public void setRule_id(int rule_id) {
		this.rule_id = rule_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIs_check() {
		return is_check;
	}

	public void setIs_check(int is_check) {
		this.is_check = is_check;
	}

	public String getFrom_time() {
		return from_time;
	}

	public void setFrom_time(String from_time) {
		this.from_time = from_time;
	}

	public String getTo_time() {
		return to_time;
	}

	public void setTo_time(String to_time) {
		this.to_time = to_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMember_lv_ids() {
		return member_lv_ids;
	}

	public void setMember_lv_ids(String member_lv_ids) {
		this.member_lv_ids = member_lv_ids;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RedPack [rule_id=" + rule_id + ", name=" + name + ", is_check="
				+ is_check + ", from_time=" + from_time + ", to_time="
				+ to_time + ", description=" + description + ", member_lv_ids="
				+ member_lv_ids + ", status=" + status + "]";
	}
}

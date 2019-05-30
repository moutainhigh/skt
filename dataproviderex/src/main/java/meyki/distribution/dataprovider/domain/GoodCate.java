package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

public class GoodCate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//商品分类id
	private int id;
	//商品分类name
	private String name;
	//商品分类 1 表示 自己添加的分类，2表示 连锁店添加的分类。
	// 列表删除，如果是 2 则不能删除
	
	//是否选中的状态
	private int state;
	//是否可删除
	private int delstate;
	
	private int type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getDelstate() {
		return delstate;
	}
	public void setDelstate(int delstate) {
		this.delstate = delstate;
	}	
}

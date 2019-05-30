package meyki.distribution.dataprovider.bean;

import java.util.List;

public class MessageBean {

	private int id;
	private String user_id;
	private String shop_id;
	private String goods_id;
	private String goods_name;
	private String uname;
	private String addtime;
	private String comment;
	private String type;
	private String parent_id;
	private int status;// 1默认为不显示 2为显示
	private Child child;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getShop_id() {
		return shop_id;
	}

	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}


	public static class Child {
		private String addtime;
		private String comment;

		public String getComment() {
			return comment;
		}

		@Override
		public String toString() {
			return "Child [comment=" + comment + ", addtime=" + addtime + "]";
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getAddtime() {
			return addtime;
		}

		public void setAddtime(String addtime) {
			this.addtime = addtime;
		}
	}
	@Override
	public String toString() {
		return "MessageBean [id=" + id + ", user_id=" + user_id + ", shop_id="
				+ shop_id + ", goods_id=" + goods_id + ", goods_name="
				+ goods_name + ", uname=" + uname + ", addtime=" + addtime
				+ ", comment=" + comment + ", type=" + type + ", parent_id="
				+ parent_id + ", status=" + status +",child"+child +"]";
	}


	
}

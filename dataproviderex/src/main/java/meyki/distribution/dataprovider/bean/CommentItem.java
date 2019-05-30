package meyki.distribution.dataprovider.bean;

public class CommentItem {
	private String id ;
	private String uid ;//会员id
	private String name ; //会员名称
	private String comment ;// 留言内容
	private String image ;//头像
	private String add_time ;//2015-07-22 16:49:24
	private String cna ;//留言作者  
	private String com ;//留言内容 
	private String zan ;//此评论的点赞数  //如果没有此项的，点赞数为0
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getCna() {
		return cna;
	}
	public void setCna(String cna) {
		this.cna = cna;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getZan() {
		return zan;
	}
	public void setZan(String zan) {
		this.zan = zan;
	}
}

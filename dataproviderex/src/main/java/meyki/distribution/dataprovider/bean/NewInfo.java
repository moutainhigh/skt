package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * 资讯首页实体类
 * @author zhaoli
 */
public class NewInfo extends InfoResult implements Serializable{

	private static final long serialVersionUID = 1L;
	public String id ;//文章id
	public String title ;//冲奶粉泡沫多，引起宝宝吐奶？怎么办？//文章标题
	public String update_time ;//2015-05-22 //发布时间
	public String zan ;//是否已赞过，1 赞过 其他值均为未赞过
	public String view ;//阅读数
	public String ct ;//评论数
	public String comment ;//内容
	public String image;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	public String getZan() {
		return zan;
	}
	public void setZan(String zan) {
		this.zan = zan;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getCt() {
		return ct;
	}
	public void setCt(String ct) {
		this.ct = ct;
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
	@Override
	public String toString() {
		return "NewInfo [title=" + title + ", image=" + image + "]";
	}
}

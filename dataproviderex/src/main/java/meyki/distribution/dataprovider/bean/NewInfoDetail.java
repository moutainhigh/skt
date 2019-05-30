package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * 资讯首页实体类
 * @author zhaoli
 */
public class NewInfoDetail extends InfoResult implements Serializable{

	private static final long serialVersionUID = 1L;
	//1.1 获取文章赞的情况
	public AgreeInfo ai;
	//public String nums;//参与赞的总人数
	//public ArrayList<String> userImgList = new ArrayList<String>();//参与赞的总人数
	//1.2 获取评论
	//public ArrayList<CommentItem> cmtList = new  ArrayList<CommentItem>();//评论一览
	//public String count;//总的评论数
	//public String page ;//当前页
	//public String nextpage ;//下一页
	public CommentInfo ci;
	//1.3 热点推荐
	public ArrayList<SuggestItem> suggestList;//推荐一览
//	public String getNums() {
//		return nums;
//	}
//	public void setNums(String nums) {
//		this.nums = nums;
//	}
//	public ArrayList<String> getUserImgList() {
//		return userImgList;
//	}
//	public void setUserImgList(ArrayList<String> userImgList) {
//		this.userImgList = userImgList;
//	}
	
	public ArrayList<SuggestItem> getSuggestList() {
		return suggestList;
	}
	public void setSuggestList(ArrayList<SuggestItem> suggestList) {
		this.suggestList = suggestList;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
}

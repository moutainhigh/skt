package meyki.distribution.dataprovider.bean;

import java.util.ArrayList;

public class CommentInfo  extends InfoResult{
	public ArrayList<CommentItem> cmtList ;//评论一览
	public String count;//总的评论数
	public String page ="1";//当前页
	public String nextpage ;//下一页
	public ArrayList<CommentItem> getCmtList() {
		return cmtList;
	}
	public void setCmtList(ArrayList<CommentItem> cmtList) {
		this.cmtList = cmtList;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getNextpage() {
		return nextpage;
	}
	public void setNextpage(String nextpage) {
		this.nextpage = nextpage;
	}
}

package meyki.distribution.dataprovider.bean;

import java.util.ArrayList;

public class AgreeInfo {
	public String getNums() {
		return nums;
	}
	public void setNums(String nums) {
		this.nums = nums;
	}
	public ArrayList<String> getUserImgList() {
		return userImgList;
	}
	public void setUserImgList(ArrayList<String> userImgList) {
		this.userImgList = userImgList;
	}
	//1.1 获取文章赞的情况
	public String nums;//参与赞的总人数
	public ArrayList<String> userImgList = new ArrayList<String>();//参与赞的总人数
}

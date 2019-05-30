package meyki.distribution.dataprovider.domain;

import java.util.List;

public class AppointmentInfo {
	private int maxNum;
	private String beginTime;
	private String endTime;
	private List<HomeCareProject> projectData;
	
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public List<HomeCareProject> getProjectData() {
		return projectData;
	}
	public void setProjectData(List<HomeCareProject> projectData) {
		this.projectData = projectData;
	}	
}

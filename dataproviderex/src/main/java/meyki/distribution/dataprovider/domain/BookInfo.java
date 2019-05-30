package meyki.distribution.dataprovider.domain;

import android.annotation.SuppressLint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6812917521524501681L;
		
	private int id;
	private String name;
	private int age;
	private String sex;
	private String phone;
	private String visitTime;
	private String checkTime;
	private String checkedTime;
	private String completedTime;
	private String payTime;
	private int status;
	private String shopName;
	private Double total;
	private String address;
	private String remarks;
	private String completedReason;
	private String distance;
	private List<HomeCareProject> projectIds = new ArrayList<HomeCareProject>();
	
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getCheckedTime() {
		return checkedTime;
	}
	public void setCheckedTime(String checkedTime) {
		this.checkedTime = checkedTime;
	}
	public String getCompletedTime() {
		return completedTime;
	}
	public void setCompletedTime(String completedTime) {
		this.completedTime = completedTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public List<HomeCareProject> getProjectIds() {
		return projectIds;
	}
	public void setProjectIds(List<HomeCareProject> projectIds) {
		this.projectIds = projectIds;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getCompletedReason() {
		return completedReason;
	}
	public void setCompletedReason(String completedReason) {
		this.completedReason = completedReason;
	}	
}
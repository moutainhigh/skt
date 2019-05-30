package meyki.distribution.dataprovider.domain;

public class RedEnvelope {
	private int id;
	private double total;
	private int nums;
	private int getNums;
	private String addtime;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public int getGetNums() {
		return getNums;
	}
	public void setGetNums(int getNums) {
		this.getNums = getNums;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}	
}

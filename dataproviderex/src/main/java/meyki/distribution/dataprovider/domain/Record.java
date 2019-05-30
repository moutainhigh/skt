package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

public class Record implements Serializable{
	private static final long serialVersionUID = 6223122827278867255L;
	private int total_id;
	private double money;
	private String add_time;
	private String status;
	private String bank_no;
	private String bank_name;
	public int getTotal_id() {
		return total_id;
	}
	public String getBank_no() {
		return bank_no;
	}
	public void setBank_no(String bank_no) {
		this.bank_no = bank_no;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public void setTotal_id(int total_id) {
		this.total_id = total_id;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Record [total_id=" + total_id + ", money=" + money
				+ ", add_time=" + add_time + ", status=" + status + "]";
	}
}

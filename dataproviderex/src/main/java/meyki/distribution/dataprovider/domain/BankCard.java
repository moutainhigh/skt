package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

public class BankCard implements Serializable{
	private static final long serialVersionUID = 8753640435437351443L;
	private int id;
	private String bank_no;
	private String bank_name;
	private String bank_user;
	private String bank_img;
	private String log;
	public int getIs_default() {
		return is_default;
	}
	public void setIs_default(int is_default) {
		this.is_default = is_default;
	}

	private int is_default;
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getBank_img() {
		return bank_img;
	}
	public void setBank_img(String bank_img) {
		this.bank_img = bank_img;
	}
	public BankCard(){
		
	}
	public BankCard(String  bank_no){
		this.bank_no = bank_no;
	}
	
	public BankCard(String  bank_user,String bank_no,String bank_name){
		this.bank_user = bank_user;
	}
	
	public String getBank_user() {
		return bank_user;
	}

	public void setBank_user(String bank_user) {
		this.bank_user = bank_user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "BankCard [id=" + id + ", bank_no=" + bank_no + ", bank_name="
				+ bank_name + "]";
	}		
}

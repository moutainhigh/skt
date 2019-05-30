package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

/**
 * 银行实体类
 * @author liyc
 */
public class Bank implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int is_default;
	private int id;
	private String bank_no;
	private String bank_name;
	private String log;
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
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
	public int getIs_default() {
		return is_default;
	}
	public void setIs_default(int is_default) {
		this.is_default = is_default;
	}	
}

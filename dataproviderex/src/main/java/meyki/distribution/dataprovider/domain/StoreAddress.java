package meyki.distribution.dataprovider.domain;

import java.io.Serializable;
/**
 * 用户地址封装的实体类,继承自Store类
 * @author liyingchao
 *
 */
public class StoreAddress  extends Store implements Serializable{
	private static final long serialVersionUID = -7608383673150117663L;
	private String tid;
	private String address;
	private String qq;
	private String name;
	
	private String adr;
	public String getAdr() {
		return adr;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StoreAddress [tid=" + tid + ", address=" + address + ", adr="
				+ adr + "]";
	}
	
}

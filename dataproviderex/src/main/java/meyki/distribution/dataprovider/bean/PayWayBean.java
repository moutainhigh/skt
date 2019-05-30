package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
/**
 * 支付方式对应的bean
 * @author liyc
 */
public class PayWayBean implements Serializable {
	
	public PayWayBean(){
		
	}
	
	
	public PayWayBean(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public boolean isCheck() {
		return isCheck;
	}


	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}


	public int id;
	public String image;
	public String name;
	public boolean isCheck = false;
}

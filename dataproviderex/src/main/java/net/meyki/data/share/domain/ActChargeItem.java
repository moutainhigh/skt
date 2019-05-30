package net.meyki.data.share.domain;

import java.io.Serializable;

public class ActChargeItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3047404125068257609L;
	public String charge_key ;
	public String charge_value ;
	public String getCharge_key() {
		return charge_key;
	}
	public void setCharge_key(String charge_key) {
		this.charge_key = charge_key;
	}
	public String getCharge_value() {
		return charge_value;
	}
	public void setCharge_value(String charge_value) {
		this.charge_value = charge_value;
	}
			
}

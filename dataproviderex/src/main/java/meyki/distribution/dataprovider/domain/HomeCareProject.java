package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

public class HomeCareProject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1391116828156056702L;
	
	private int id;
	private Double projectValue;
	private String item;
	private Double price;
	private int isChecked;
	private String reference;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getIsChecked() {
		return isChecked;
	}
	public void setIsChecked(int isChecked) {
		this.isChecked = isChecked;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Double getProjectValue() {
		return projectValue;
	}
	public void setProjectValue(Double projectValue) {
		this.projectValue = projectValue;
	}		
}
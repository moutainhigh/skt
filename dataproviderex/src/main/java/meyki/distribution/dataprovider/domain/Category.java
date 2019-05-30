package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

public class Category implements Serializable {
	private static final long serialVersionUID = -3497923902408644451L;
	private int catId;
	private String catName;
	private String image;
	private boolean isOpen;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Category(){
		
	}
	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}
	
	public Category(int catId, String catName) {
		this.catId = catId;
		this.catName = catName;
	}
	
	public Category(int cat_id, String catName, String image) {
		this.catId = cat_id;
		this.catName = catName;
		this.image = image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setId(int cat_id) {
		this.catId = cat_id;
	}
	
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	@Override
	public String toString() {
		return "Category [cat_id=" + catId + ", name=" + catName + ", image="
				+ image + "]";
	}
}

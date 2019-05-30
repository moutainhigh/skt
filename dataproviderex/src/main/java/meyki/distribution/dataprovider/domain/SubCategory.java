package meyki.distribution.dataprovider.domain;

import java.io.Serializable;

/**
 * 子分类对应的实体
 * @author liyc
 * 
 */
public class SubCategory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -747995076833203832L;
	private int cat_id ;
	
	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	private String cat_name;

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	@Override
	public String toString() {
		return "SubCategory [cat_id=" + cat_id + ", cat_name=" + cat_name + "]";
	}
	
}

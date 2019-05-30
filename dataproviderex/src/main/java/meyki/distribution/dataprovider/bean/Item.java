package meyki.distribution.dataprovider.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4456509784438773989L;
	public int type=0;
	public String cat_id;
	public String cat_name;
	private String id;
	private String title;
	private ArrayList<String> image = new ArrayList<String>();
	private String view;
	private String comment;
	private String description;
	private String add_time;
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public ArrayList<String> getImage() {
		return image;
	}
	public void setImage(ArrayList<String> image) {
		this.image = image;
	}
	public void addImage(String image) {
		this.image.add( image);
	}
	public String getImage(int index) {
		return this.image.get( index);
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

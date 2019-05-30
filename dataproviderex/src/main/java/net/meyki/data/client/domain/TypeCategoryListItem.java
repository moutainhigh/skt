package net.meyki.data.client.domain;

public class TypeCategoryListItem {
	//  ["id"] => string(1) "1"
	//	      ["typeName"] => string(12) "超市便利"
		//      ["typeIav"] => string(46) "
	private String id;
	private String typeName;
	private String typeIav;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeIav() {
		return typeIav;
	}
	public void setTypeIav(String typeIav) {
		this.typeIav = typeIav;
	}
}

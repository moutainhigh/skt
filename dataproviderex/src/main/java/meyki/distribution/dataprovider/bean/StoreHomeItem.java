package meyki.distribution.dataprovider.bean;

public class StoreHomeItem {

	private String name;
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StoreHomeItem [name=" + name + ", id=" + id + "]";
	}
	
}

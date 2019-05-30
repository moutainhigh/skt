package meyki.distribution.dataprovider.domain;
/**
 * 模板对应的实体类
 * @author liyingchao
 */
public class Template {
	
	private String id;
	private String image;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Template [id=" + id + ", image=" + image + "]";
	}
	
}

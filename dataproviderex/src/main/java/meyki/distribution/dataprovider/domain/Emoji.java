package meyki.distribution.dataprovider.domain;

import java.io.Serializable;
/**
 * emoji�����Ӧ��ʵ����
 * @author Administrator
 *
 */
public class Emoji implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6193952810822846909L;
	/**��ǰ����id*/
	private String id;
	/**�����Ӧ������*/
	private String text;
	/**��Դid*/
	private int resourceId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public Emoji(String id, String text, int resourceId) {
		this.id = id;
		this.text = text;
		this.resourceId = resourceId;
	}
	public Emoji() {
	}
	
	
}

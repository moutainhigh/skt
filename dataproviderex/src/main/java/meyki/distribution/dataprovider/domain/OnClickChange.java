package meyki.distribution.dataprovider.domain;

public class OnClickChange {

	private int type =0;
	private int iszan;
	private String id;
	private String comment;
	private String cid;
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getIszan() {
		return iszan;
	}

	public void setIszan(int iszan) {
		this.iszan = iszan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public OnClickChange(String id,int zan) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.iszan = zan;
	}
	public OnClickChange(int type,String comment,String aid,String cid) {
		// TODO Auto-generated constructor stub
		this.comment = comment;
		this.type =type;
		this.id = aid;
		this.cid= cid;
	}
	public OnClickChange(int type,String comment,String aid) {
		// TODO Auto-generated constructor stub
		this.comment = comment;
		this.type =type;
		this.id = aid;
	}
	
}

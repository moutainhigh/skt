package meyki.distribution.dataprovider.domain;
/**
 * 页面对应的实体对象
 * @author liyc
 */
public class Page {
	
	public Page(){
		
	}
	public Page(int page,int nextPage){
		this.page = page;
		this.nextpage = nextPage;
	}
	/** 当前页 */
	private int page;
	/** 下一页 */
	private int nextpage;
	/** 是否分页显示 */
	private Stop stop;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getNextpage() {
		return nextpage;
	}

	public void setNextpage(int nextpage) {
		this.nextpage = nextpage;
	}

	public Stop getStop() {
		return stop;
	}
	public void setStop(Stop stop) {
		this.stop = stop;
	}

	private enum Stop{
		on,go_on
	}
}

package meyki.distribution.dataprovider.domain;

import meyki.distribution.dataprovider.bean.RecommandGoods;

public class TabInitChange {

	public TabInitChange(String cat_id) {
		// TODO Auto-generated constructor stub
		this.cate_id = cat_id;
	}

	public RecommandGoods getData() {
		return data;
	}
	public void setData(RecommandGoods data) {
		this.data = data;
	}

	private RecommandGoods data;
	public String cate_id;
}

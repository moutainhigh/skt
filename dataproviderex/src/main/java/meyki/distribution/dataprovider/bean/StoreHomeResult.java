package meyki.distribution.dataprovider.bean;

import java.util.ArrayList;

public class StoreHomeResult extends InfoResult {

	private ArrayList<StoreHomeItem> datas = new ArrayList<StoreHomeItem>();

	public ArrayList<StoreHomeItem> getDatas() {
		return datas;
	}

	public void setDatas(ArrayList<StoreHomeItem> datas) {
		this.datas = datas;
	}

	
	
}

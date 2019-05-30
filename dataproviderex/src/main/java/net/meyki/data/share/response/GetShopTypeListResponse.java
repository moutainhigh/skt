package net.meyki.data.share.response;

import java.util.ArrayList;
import java.util.List;

import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.share.domain.ShopTypeBean;

public class GetShopTypeListResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8827129752251099645L;
	public List<ShopTypeBean> list = new ArrayList<ShopTypeBean>();

	public List<ShopTypeBean> getList() {
		return list;
	}

	public void setList(List<ShopTypeBean> list) {
		this.list = list;
	}
}

package net.meyki.data.share.domain;

import java.io.Serializable;

public class Bonus  implements Serializable {
	public Bonus() {
	}
	public String bonusId;
	public String name;// 优惠券名称
	public String price;// 优惠券价格

	public String getBonusId() {
		return bonusId;
	}

	public void setBonusId(String bonusId) {
		this.bonusId = bonusId;
	}
}

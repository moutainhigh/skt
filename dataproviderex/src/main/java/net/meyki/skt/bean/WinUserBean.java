package net.meyki.skt.bean;

import java.io.Serializable;

import android.text.TextUtils;

/**
 * 
 * 中奖人员对应实体类
 * @author liyc
 */
public class WinUserBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String uname;
	public String name;
	public String addtime;
	
	
	
	@Override
	public String toString() {
		if(!TextUtils.isEmpty(name)){
			return addtime+"    " + uname+ "    "+ name+"代金券";
		}else{
			return addtime+"    " + uname+ "    0代金券";
		}
	}
}

package net.meyki.skt.bean;

import java.io.Serializable;
/**
 * 联系人列表item对应实体
 * @author chao
 *
 */
public class ContactListItem implements Serializable {

	public int id;
	public int userId;
	public String name;
	public String sex;
	public String age;
	public String phone;
	public String address;
	public String addtime;
	
	public boolean isCheck = false;//用户当前选中状态
}

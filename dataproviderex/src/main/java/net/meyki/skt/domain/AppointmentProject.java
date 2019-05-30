package net.meyki.skt.domain;

import java.io.Serializable;

/***
 * 预约项目对应的实体类
 * 
 * @author liyc
 * 
 */
public class AppointmentProject implements Serializable {

	public int id;// 项目id
	public String money;// 项目检查所需要的代金券
	public String name;// 项目名称
	public String value;//体检报告页面需要，体检结果数值
	public String unit;//体检项目数据单位
}

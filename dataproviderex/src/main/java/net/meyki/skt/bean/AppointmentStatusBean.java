package net.meyki.skt.bean;
/**
 * 预约状态显示的时间轴对应的实体bean
 * @author liyc
 *
 */
public class AppointmentStatusBean {
	public int id;//id 状态标识
	public String title;//标题文字
	public String time;//时间
	public boolean isChecked;//是否为当前状态
	public String reason;//备注，商家拒绝原因
	
	public AppointmentStatusBean(String title,String time,boolean isChecked){
		this.time = time;
		this.title = title;
		this.isChecked = isChecked;
	}
	public AppointmentStatusBean(){
	
	}
}

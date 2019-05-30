package net.meyki.data.EventBus;

/***
 * @author:	lxy
 * @describe: 
 * @date:	2016年11月01日
 * @version:
 *
 */

public class EventModel {
	
	public int eventType;
	public int sign;
	public Object eventData;
	
	public String url;
	
	public int getEventType() {
		return eventType;
	}
	public EventModel setEventType(int eventType) {
		this.eventType = eventType;
		return this;
	}
	public Object getEventData() {
		return eventData;
	}
	public EventModel setEventData(Object eventData) {
		this.eventData = eventData;
		return this;
	}
	public int getSign() {
		return sign;
	}
	public void setSign(int sign) {
		this.sign = sign;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	} 
	
}

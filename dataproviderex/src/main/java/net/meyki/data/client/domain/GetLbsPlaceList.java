package net.meyki.data.client.domain;

import net.meyki.skt.bean.PlaceList;

import java.io.Serializable;
import java.util.List;


public class GetLbsPlaceList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7880791351846554136L;

	int status;

	String message;

	List<PlaceList> results;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<PlaceList> getResults() {
		return results;
	}
	public void setResults(List<PlaceList> results) {
		this.results = results;
	}

}

package net.meyki.data.client.response;

import net.meyki.data.client.domain.ImageItem;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

public class ActGetDiscountDetailResponse extends JavaCommonResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2561290964247180613L;
	
	public ArrayList<ImageItem> images= new ArrayList<ImageItem>();
	public String saleInfoId ;
	public String type ;
	public String startTime ;
	public String endTime ;
	public String info ;
	public String descs ;
	public String status;
}

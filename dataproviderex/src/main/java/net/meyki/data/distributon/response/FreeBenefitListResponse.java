package net.meyki.data.distributon.response;

import java.util.ArrayList;
import java.util.List;
import net.meyki.data.distributon.domain.FreeBenefitListItem;
import net.meyki.data.json.JavaCommonResponse;

public class FreeBenefitListResponse extends JavaCommonResponse{
	private static final long serialVersionUID = 8895476435071584095L;
	
	public String totalRecords;
	public String pages; 
	public String hasNext;
	public List<FreeBenefitListItem> list = new ArrayList<FreeBenefitListItem>();
}

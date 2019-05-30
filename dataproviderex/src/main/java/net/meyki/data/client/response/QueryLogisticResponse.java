package net.meyki.data.client.response;

import net.meyki.data.distributon.domain.LogesticBean;
import net.meyki.data.json.JavaCommonResponse;

import java.util.ArrayList;

/**
 * 1、查询物流详情
 * 
 * @author liyc
 * 
 */
public class QueryLogisticResponse extends JavaCommonResponse {
	public String logisticsNo; //快递单号
	public String company; //承运公司
	public String deliveryName;//承运公司
	public String deliveryNo; //快递单号
	public ArrayList<LogesticBean> deliveryDatail; //物流详情

}

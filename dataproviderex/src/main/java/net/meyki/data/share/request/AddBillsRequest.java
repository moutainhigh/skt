package net.meyki.data.share.request;

import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSONObject;


import net.meyki.data.distributon.response.FreeBenefitListResponse;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.share.domain.AddBillsBean;
import net.meyki.data.share.domain.AddBillsNoMoneyBean;
import net.meyki.data.share.response.AddBillsNoMoneyResponse;
import net.meyki.data.share.response.AddBillsResponse;
import net.meyki.data.utils.JacksonUtil;

/**
 * 用户登录请求
 * 
 * @author hulei
 * 
 */
public class AddBillsRequest extends JavaCommonRequest {
	public String total;
	public String billsDesc;
	public String info;
	public AddBillsRequest() {
		this.setMethodName("user/addBills");
		request_method = JavaJsonNetwork.TYPE_POST_DATA;
	}

	@Override
	public JavaCommonResponse getOutputResponse(String json) {
		JSONObject object = JSONObject.parseObject(json);
		if(object.getString("status").equals("0")){
			AddBillsNoMoneyResponse ab = new AddBillsNoMoneyResponse();
			ab.addBillsNoMoney = JacksonUtil.readValue(json, AddBillsNoMoneyBean.class);
			return ab;
		}else{
			AddBillsResponse ab = new AddBillsResponse();
			ab.addBills = JacksonUtil.readValue(json, AddBillsBean.class);
			return ab;
		}
	}

	@Override
	public HashMap<String, Object> getInputMap() {
		// TODO Auto-generated method stub
		HashMap<String, Object> in = new HashMap<String, Object>();
		in.put("os", dev_os);
		in.put("tag", dev_tag);
		in.put("userId", userId);
		in.put("total", total);
		in.put("billsDesc", billsDesc);
		in.put("info", info);
		return in;
	}

}

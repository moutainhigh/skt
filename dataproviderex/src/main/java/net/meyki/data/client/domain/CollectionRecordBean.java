package net.meyki.data.client.domain;

import java.io.Serializable;

/**
 * 收款记录
 * 
 * @author hulei
 * 
 */
public class CollectionRecordBean implements Serializable {
	
	private String bankId	;//String	YES	银行卡ID
	private String supplierId;//	String	YES	供货商ID
	private String 	bankName;//	String	YES	银行名称
	private String logo;//	String	YES	银行logo
	private String 	bankNo	;//String	YES	银行卡号
	private String isDefault;//	String	YES	2：是 1：否

}

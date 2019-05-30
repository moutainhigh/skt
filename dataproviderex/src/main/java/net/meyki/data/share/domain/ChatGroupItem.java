package net.meyki.data.share.domain;

import java.io.Serializable;

public class ChatGroupItem implements Serializable {

	private static final long serialVersionUID = -3823332401694427105L;

	private long id;
	private boolean isRemoved;

	private int messageContentType;
	private int specialTextType;
	private int userType;
	private String addtime;

	private String message;//图片主图url/消息
	private String thumb;//图片的缩略图
	private String redpacketId;

	private String ringGroupId;
	private String communityId;
	private String communityName;
	private String contact;

	private String fromUserId;
	private String fromUserName;
	private String fromUserTag;
	private String fromUserLoginName;
	private String fromAvatar;

	private String filePath;
	private String fileName;
	private String fileSize;

	private String voiceFilePath;
	private int voiceTimeLength;
	private boolean voiceUnreadFlag;

	//店铺id
	private String shopId;
	//店铺类型
	private String shopCate;
	//店铺名称
	private String shopName;
	//活动或商品id
	private String activeId;
	//活动小类型
	private int activeType;
	//活动或商品name
	private String activeName;
	//活动或商品图片
	private String activeImg;
	//商品单位
	private String activeUnit;
	//商品原价
	private String activePrice;
	//商品折扣
	private String activeDiscount;
	//商品折扣价
	private String activeMarketPrice;
	//活动总消费值
	private String activeTotalPrice;
	//开始时间
	private String activeStartTime;
	//结束时间
	private String activeEndTime;
	//活动总共份数
	private String activeNums;
	//活动没人限领份
	private String activeEachNums;
	//已领份数
	private String activeOutNums;
	//充值表达式
	private String activeAmount;
	//活动描述
	private String activeContentInfo;

	private String giveTicketId; //消费券转赠id
	private String ticketType;//转赠消费券的种类 0美齐 1大唐

	private String luckyBagId; //福袋id
	private String luckyBagMoney; //福袋总额
	private String getLuckyBagNum; //福袋数量

	public ChatGroupItem() {
	}


	public int getMessageContentType() {
		return messageContentType;
	}

	public void setMessageContentType(int messageContentType) {
		this.messageContentType = messageContentType;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(Short userType) {
		this.userType = userType;
	}

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getRedpacketId() {
		return redpacketId;
	}

	public void setRedpacketId(String redpacketId) {
		this.redpacketId = redpacketId;
	}

	public String getRingGroupId() {
		return ringGroupId;
	}

	public void setRingGroupId(String ringGroupId) {
		this.ringGroupId = ringGroupId;
	}

	public String getCommunityId() {
		return communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getFromUserTag() {
		return fromUserTag;
	}

	public void setFromUserTag(String fromUserTag) {
		this.fromUserTag = fromUserTag;
	}

	public String getFromUserLoginName() {
		return fromUserLoginName;
	}

	public void setFromUserLoginName(String fromUserLoginName) {
		this.fromUserLoginName = fromUserLoginName;
	}

	public String getFromAvatar() {
		return fromAvatar;
	}

	public void setFromAvatar(String fromAvatar) {
		this.fromAvatar = fromAvatar;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getActiveId() {
		return activeId;
	}

	public void setActiveId(String activeId) {
		this.activeId = activeId;
	}

	public int getActiveType() {
		return activeType;
	}

	public void setActiveType(int activeType) {
		this.activeType = activeType;
	}

	public String getActiveName() {
		return activeName;
	}

	public void setActiveName(String activeName) {
		this.activeName = activeName;
	}

	public String getActiveImg() {
		return activeImg;
	}

	public void setActiveImg(String activeImg) {
		this.activeImg = activeImg;
	}

	public String getActiveUnit() {
		return activeUnit;
	}

	public void setActiveUnit(String activeUnit) {
		this.activeUnit = activeUnit;
	}

	public String getActivePrice() {
		return activePrice;
	}

	public void setActivePrice(String activePrice) {
		this.activePrice = activePrice;
	}

	public String getActiveDiscount() {
		return activeDiscount;
	}

	public void setActiveDiscount(String activeDiscount) {
		this.activeDiscount = activeDiscount;
	}

	public String getActiveMarketPrice() {
		return activeMarketPrice;
	}

	public void setActiveMarketPrice(String activeMarketPrice) {
		this.activeMarketPrice = activeMarketPrice;
	}

	public String getActiveTotalPrice() {
		return activeTotalPrice;
	}

	public void setActiveTotalPrice(String activeTotalPrice) {
		this.activeTotalPrice = activeTotalPrice;
	}

	public String getActiveStartTime() {
		return activeStartTime;
	}

	public void setActiveStartTime(String activeStartTime) {
		this.activeStartTime = activeStartTime;
	}

	public String getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(String activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public String getActiveNums() {
		return activeNums;
	}

	public void setActiveNums(String activeNums) {
		this.activeNums = activeNums;
	}

	public String getActiveEachNums() {
		return activeEachNums;
	}

	public void setActiveEachNums(String activeEachNums) {
		this.activeEachNums = activeEachNums;
	}

	public String getActiveOutNums() {
		return activeOutNums;
	}

	public void setActiveOutNums(String activeOutNums) {
		this.activeOutNums = activeOutNums;
	}

	public String getActiveAmount() {
		return activeAmount;
	}

	public void setActiveAmount(String activeAmount) {
		this.activeAmount = activeAmount;
	}

	public String getActiveContentInfo() {
		return activeContentInfo;
	}

	public void setActiveContentInfo(String activeContentInfo) {
		this.activeContentInfo = activeContentInfo;
	}

	public String getShopCate() {
		return shopCate;
	}

	public void setShopCate(String shopCate) {
		this.shopCate = shopCate;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean removed) {
		isRemoved = removed;
	}

	public String getVoiceFilePath() {
		return voiceFilePath;
	}

	public void setVoiceFilePath(String voiceFilePath) {
		this.voiceFilePath = voiceFilePath;
	}

	public int getVoiceTimeLength() {
		return voiceTimeLength;
	}

	public void setVoiceTimeLength(int voiceTimeLength) {
		this.voiceTimeLength = voiceTimeLength;
	}

	public boolean getVoiceUnreadFlag() {
		return voiceUnreadFlag;
	}

	public void setVoiceUnreadFlag(boolean voiceUnreadFlag) {
		this.voiceUnreadFlag = voiceUnreadFlag;
	}

	public int getSpecialTextType() {
		return specialTextType;
	}

	public void setSpecialTextType(int specialTextType) {
		this.specialTextType = specialTextType;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getGiveTicketId() {
		return giveTicketId;
	}

	public void setGiveTicketId(String giveTicketId) {
		this.giveTicketId = giveTicketId;
	}

	public String getLuckyBagId() {
		return luckyBagId;
	}

	public void setLuckyBagId(String luckyBagId) {
		this.luckyBagId = luckyBagId;
	}

	public String getLuckyBagMoney() {
		return luckyBagMoney;
	}

	public void setLuckyBagMoney(String luckyBagMoney) {
		this.luckyBagMoney = luckyBagMoney;
	}

	public String getGetLuckyBagNum() {
		return getLuckyBagNum;
	}

	public void setGetLuckyBagNum(String getLuckyBagNum) {
		this.getLuckyBagNum = getLuckyBagNum;
	}
}

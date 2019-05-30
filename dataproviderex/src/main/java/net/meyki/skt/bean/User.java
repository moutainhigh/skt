/**
#************************************************
# 项目名称：WSTMall
# 版本号： V1.0  
#************************************************
# 文件说明：
#          
#************************************************
# 子模块说明：
#                     
#************************************************
# 创建人员： 谈泳豪
# 创建人员QQ：1511895018
# 创建日期：2015-6-11
#
# @Copyright (c) 2015 Tans All right reserved.
#************************************************
*/
package net.meyki.skt.bean;

import android.text.TextUtils;

import net.meyki.data.client.domain.AmountBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName User
 * @Create Date 2015-6-11 下午6:45:25 
 * 
 * @author Tans      QQ     1511895018
 * WSTMall开源商城-合作团队     官网地址:http://www.wstmall.com   联系QQ:707563272
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2444187318369372359L;
	public String userId;//用户ID
	public String loginName;//登录账号
	public String userName;//用户名称，这个值不一定有，用户有填才会有值
	public String userPhoto;//用户头像
	public String userScore;//用户积分
	public String userSex;//性别// 0 男 1 女 2 保密
	public String userTotal;//用户e币数量
	public String userType;//0:普通会员  1:店鋪用户  2:两者都是
	public String password;//用户登录密码
	public String qrCode;//二维码信息
	public String yijiaLoginName;//暂时使用易商的用户登录名
	public String isLogin;  //未记住密码退出登录=0  记住密码登录=1 未记住密码登录=2 记住密码退出登录=3
	public String status;//是否有支付密码 0 没有 1 有
	public List<AmountBean> dijinList = new ArrayList<>();//消费劵数据存储


	public String getName(){
		if(userName==null||userName.equals("")){
			return loginName;
		}else{
			return userName;
		}
	}
	
	public String getSex(){
		if(TextUtils.isEmpty(userSex)){
			return "保密";
		}
		if(userSex.equals("0")){
			return "男";
		}else if(userSex.equals("1")){
			return "女";
		}else{
			return "保密";
		}
	}
	
	public String getSexNum(String sexName){
		if(sexName.equals("男")){
			return "0";
		}else if(sexName.equals("女")){
			return "1";
		}else {
			return "2";
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String pUserId) {
		userId = pUserId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String pLoginName) {
		loginName = pLoginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String pUserName) {
		userName = pUserName;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String pUserPhoto) {
		userPhoto = pUserPhoto;
	}

	public String getUserScore() {
		return userScore;
	}

	public void setUserScore(String pUserScore) {
		userScore = pUserScore;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String pUserSex) {
		userSex = pUserSex;
	}

	public String getUserTotal() {
		return userTotal;
	}

	public void setUserTotal(String pUserTotal) {
		userTotal = pUserTotal;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String pUserType) {
		userType = pUserType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pPassword) {
		password = pPassword;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String pQrCode) {
		qrCode = pQrCode;
	}

	public String getYijiaLoginName() {
		return yijiaLoginName;
	}

	public void setYijiaLoginName(String pYijiaLoginName) {
		yijiaLoginName = pYijiaLoginName;
	}

	public String getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(String pIsLogin) {
		isLogin = pIsLogin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String pStatus) {
		status = pStatus;
	}

	public List<AmountBean> getDijinList() {
		return dijinList;
	}

	public void setDijinList(List<AmountBean> pDijinList) {
		dijinList = pDijinList;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId='" + userId + '\'' +
				", loginName='" + loginName + '\'' +
				", userName='" + userName + '\'' +
				", userPhoto='" + userPhoto + '\'' +
				", userScore='" + userScore + '\'' +
				", userSex='" + userSex + '\'' +
				", userTotal='" + userTotal + '\'' +
				", userType='" + userType + '\'' +
				", password='" + password + '\'' +
				", qrCode='" + qrCode + '\'' +
				", yijiaLoginName='" + yijiaLoginName + '\'' +
				", isLogin='" + isLogin + '\'' +
				", status='" + status + '\'' +
				", dijinList=" + dijinList +
				'}';
	}
}

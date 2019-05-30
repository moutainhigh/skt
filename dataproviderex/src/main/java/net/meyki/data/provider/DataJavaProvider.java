package net.meyki.data.provider;

import android.content.Context;

import net.meyki.data.client.domain.ChatItem;
import net.meyki.skt.utils.Log;
import net.meyki.skt.utils.Utils;
import net.meyki.data.client.domain.PointChatItem;
import net.meyki.data.json.JavaCommonRequest;
import net.meyki.data.json.JavaCommonResponse;
import net.meyki.data.json.JavaJsonNetwork;
import net.meyki.data.json.JavaJsonNetwork.IJavaAsyworkCompleted;
import net.meyki.data.json.JavaJsonNetwork.IJavaJsonResultListener;
import net.meyki.data.share.domain.ChatGroupItem;
import net.meyki.data.share.domain.SystemInfoItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class DataJavaProvider implements IJavaAsyworkCompleted {
	private static final String TAG = DataJavaProvider.class.getSimpleName();
	private static final boolean DBG = true;
	public static boolean AESMODE = false;
	public static String KEY = null;
	public static String IMEI = null;
	public static String MEYKI_BASE_URL_JAVA = null;
	public static String CUSTOMER_BASE_URL_JAVA = null;
	public static boolean DEBUGMODE = false;
	/**
	 * 0易家 1易商
	 * */
	public static  String mTag;
	/**
	 * android或ios
	 * */
	public static String mOs;
	public static String TOKEN;
	public static Class mLoginClass;
	public static String mVcode;

	public static String getKEY() {
		return KEY;
	}

	public static void setKEY(String kEY) {
		KEY = kEY;
	}

	public static String getIMEI() {
		return IMEI;
	}

	public static void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public static String getMEYKI_BASE_URL() {
		return MEYKI_BASE_URL_JAVA;
	}

	public static void setMEYKI_BASE_URL(String mEYKI_BASE_URL) {
		MEYKI_BASE_URL_JAVA = mEYKI_BASE_URL;
	}

	public static boolean isDEBUGMODE() {
		return DEBUGMODE;
	}

	public static void setDEBUGMODE(boolean dEBUGMODE) {
		DEBUGMODE = dEBUGMODE;
	}

	private static DataJavaProvider mMe;
	private static Context mContext;
	public static DatabaseOperator mDbOperator;
	public HashMap<String, IJavaJsonResultListener> queue = new HashMap<String, IJavaJsonResultListener>();
	public HashMap<String, JavaJsonNetwork> queueTask = new HashMap<String, JavaJsonNetwork>();




	public interface ClearCacheCompletedListener {
		public void onClearCompleted(int percent);
	}

	/**
	 * Return DataProvider instance in application anywhere that it used single
	 * instance mode.
	 *
	 * @return DataProvider single instance of DataProvider.
	 * */
	public static synchronized DataJavaProvider getInstance() {
		return mMe;
	}


	/**
	 * application首先调用
	 * @param ct 应用程序的Context
	 * @param tag 0易家 1易商
	 * @param os android或ios
	 * @param url 外网基础地址，例 "http://192.168.1.11:8080/esapi/"
	 * @param isdebug 是否是调试模式，开发时，请设置为true，正式版本发布时，请设置为false
	 *
	 * */
	public static synchronized DataJavaProvider getInstance(Context ct,
															String tag,String os,String customerUrl,String url, boolean isdebug,boolean aesmode,String vcode,Class loginClass) {
		if (mMe == null) {
			if (DBG) {
				Log.d(TAG, "create DataProvider instance.");
			}
			mMe = new DataJavaProvider();
			mContext = ct;
			mTag=tag;
			mOs=os;
			mVcode=vcode;
			MEYKI_BASE_URL_JAVA=url;
			DEBUGMODE=isdebug;
			AESMODE=aesmode;
			CUSTOMER_BASE_URL_JAVA = customerUrl;
			TOKEN=mMe.getSettingsValue("token");
			mLoginClass=loginClass;
		}
		return mMe;
	}

	public static void setToken(String token){
		TOKEN=token;
		mMe.saveSettings(token,"");
	}

	/**
	 * Destroy DataProvider, you can clear catch data here.
	 * */
	public void destroy() {
		if (DBG)
			Log.d(TAG, "destroy DataProvider instance.");
		synchronized (mDbOperator) {
			if (null != mDbOperator) {
				mDbOperator.close();
				mDbOperator = null;
			}

			if (null != mMe) {
				mMe = null;
			}
		}
	}

	/*
	 * --------------------------- database operator.
	 */

	private void maybeOpenDatabase() {
		// synchronized (mDbOperator) {
		if (mDbOperator == null) {
			mDbOperator = new DatabaseOperator();
			mDbOperator.open(mContext);
		}
		// }
	}

	/**
	 * Set settings value by key.
	 *
	 * @param key
	 *            settings key.
	 * @param value
	 *            settings value.
	 * @return long column index of key in database.
	 * */
	public long saveSettings(String key, String value) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.saveSettings(key, value);
		}
	}

	/**
	 * Return settings value by key.
	 *
	 * @param key
	 *            settings key.
	 * @return String settings value.
	 * */
	public String getSettingsValue(String key) {
		//
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.getSettingsValue(key);
		}
	}

	/**
	 * 设置单一数据对象
	 *
	 * @param key
	 *            键值
	 * @param data
	 *            可序列化的对象
	 * @return boolean TRUE:设置成功,FALSE:设置失败
	 * */
	public boolean setSingalData(String key, Object data) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.setSingleData(key, data);
		}
	}

	public boolean setSingalConfigData(String key, Object data) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.setSingleConfigData(key, data);
		}
	}

	public boolean setSingalData(String key, Object data, String version) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.setSingleData(key, data, version);
		}
	}


	/**
	 * 获取单一数据对象
	 *
	 * @param key
	 *            键值
	 * @param time
	 *            日期时间
	 * @return Object可反序列化的对象，需要根据instanceof 判定后，强制类型转化成相应的对象
	 * */
	public Object getSingalData(String key, Long time) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.getSingleData(key, time);
		}
	}

	public Object getSingalData(String key, String version) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.getSingleData(key, version);
		}
	}
	public void deleteSingalData(String key, String version){
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			mDbOperator.deleteSingleData(key, version);
		}
	}
	public Object getSingalConfigData(String key) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.getSingleConfigData(key);
		}
	}
	/**
	 * 设置分页数据对象
	 *
	 * @param key
	 *            键值
	 * @param page
	 *            分页信息
	 * @param cate
	 *            分类附加信息
	 * @param data
	 *            可序列化的对象
	 * @return boolean TRUE:设置成功,FALSE:设置失败
	 * */
	public boolean setMutiplelData(String key, int page, String cate,
								   Object data) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.setMutipleData(key, page, cate, data);
		}
	}

	/**
	 * 获取分页数据对象
	 *
	 * @param key
	 *            键值
	 * @param page
	 *            分页信息
	 * @param cate
	 *            分类附加信息
	 * @param time
	 *            日期时间
	 * @return Object可反序列化的对象，需要根据instanceof 判定后，强制类型转化成相应的对象
	 * */
	public Object getMutipleData(String key, int page, String cate, Long time) {
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			return mDbOperator.getMutipleData(key, page, cate, time);
		}
	}

	/**
	 * 同步清除数据缓存
	 *
	 * @param context
	 *            上下文对象
	 * @return boolean TRUE：处理成功，FALSE：处理失败
	 * */
	public void ClearCacheData(Context context) {
		// 清除DB缓存
		maybeOpenDatabase();
		synchronized (mDbOperator) {
			mDbOperator.ClearCacheData();
		}

		// 清除图片缓存
		Utils.deleteImgCache(context);
	}

	/**
	 * DEMO
	 *
	 * @param context
	 *            上下文
	 * @param cr
	 *            请求对象
	 * @param paramListener
	 *            监听对象
	 * @return boolean true:成功 false:失败
	 */
	public boolean getJavaCommonRequest(Context context, JavaCommonRequest cr,
										IJavaJsonResultListener paramListener) {
		if (queue.containsKey(cr.getMethodName() + "," + cr.RequestSequenceId)) {
			// 防止重复多次调用该接口，同一个接口在前一个回调没有处理完毕之前，不会再次响应同样的接口和序列
			// 如果需要则，则可以通过请求序号来改变
			return false;
		}
		try {
			JavaJsonNetwork jn = new JavaJsonNetwork(context, paramListener);
			jn.addDoworkCompletedNotify(this);
			queue.put(cr.getMethodName() + "," + cr.RequestSequenceId,
					paramListener);
			queueTask.put(cr.getMethodName() + "," + cr.RequestSequenceId, jn);
			jn.execute(cr);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * 取消监听
	 *
	 * @param paramListener
	 *            监听
	 * @return void
	 * @see
	 */
	public void cancelListener(IJavaJsonResultListener paramListener) {
		// TODO Auto-generated method stub
		if (null != queue) {
			Log.i("tiger", "cancelListener");
			if (queue.containsValue(paramListener)) {
				Log.i("tiger", "hasListener");
				Iterator iter = queue.entrySet().iterator();
				ArrayList<String> arrayList = new ArrayList<String>();
				while (iter.hasNext()) {
					Map.Entry entry = (Map.Entry) iter.next();
					Object key = entry.getKey();
					if (entry.getValue().equals(paramListener)) {
						arrayList.add(entry.getKey().toString());
					}
				}
				for (int i = 0; i < arrayList.size(); i++) {
					queue.remove(arrayList.get(i));
					JavaJsonNetwork jn = queueTask.remove(arrayList.get(i));
					if (null != jn && !jn.isCancelled()) {
						jn.cancel(true);
					}
					Log.i("tiger", "remove=" + arrayList.get(i));
				}
			}
		}
	}

	@Override
	public boolean hasCancel(JavaCommonResponse result) {
		// TODO Auto-generated method stub
		if (null != queue && null != result) {
			if (queue.containsKey(result.Response_id + ","
					+ result.RequestSequenceId)) {
				// 正常
				queue.remove(result.Response_id + ","
						+ result.RequestSequenceId);
				Log.i("tiger", "hasCancel==");
				return false;
			} else {
				// 用户已经取消
				return true;
			}
		}
		if (null != result) {
			queue.remove(result.Response_id + "," + result.RequestSequenceId);
		}
		Log.i("tiger", "hasCancel=+");
		return false;
	}

	/**
	 * 更新点对点消息
	 */
	public long updatePointChatItem(String key, ChatItem datas){
		maybeOpenDatabase();
		return mDbOperator.updateChatPointItem(key, datas);
	}

	/**
	 *	保存点对点聊天记录
	 * @param key userId+loginname
	 * @param datas
	 * @return
	 */
	public long setPointChat(String key, String tag, ChatItem datas) {
		maybeOpenDatabase();
		PointChatItem item = new PointChatItem();
		item.chatitem = datas;
		item.key = key;
		item.tag = tag;
		return mDbOperator.setPointChatItem(item);
	}

	/**
	 * 查询最后一条的点对点聊天记录列表
	 * @return
	 */
	public List<ChatItem> getLastPointChat(String key){
		maybeOpenDatabase();
		return mDbOperator.getLastPointChatItem(key);
	}

	/**
	 * 查询最后一条的特产馆点对点聊天记录列表
	 * @return
	 */
	public List<ChatItem> getSPLastPointChat(String key){
		maybeOpenDatabase();
		return mDbOperator.getSPLastPointChatItem(key);
	}

	/**
	 * 删除点对点聊天记录
	 * @param key
	 * @return true:成功
	 * false:失败
	 */
	public boolean deletePointChatItem(String key){
		maybeOpenDatabase();
		return mDbOperator.deletePointChatItem(key);
	}

	/**
	 * 查询发给自己所有的聊天记录列表
	 * @param key 查询的key
	 * @param id 聊天记录的id，第一次进来传 0
	 * @return
	 */
	public List<ChatItem> getPointChatList(String key, long id, int pageMax){
		maybeOpenDatabase();
		return mDbOperator.getPointChat(key, id, pageMax);
	}


	/**
	 *	保存点对点未读消息聊天记录
	 * @param key
	 * @param datas
	 * @return
	 */
	public long setPointUnreadChat(String key, String tag, ChatItem datas) {
		maybeOpenDatabase();
		PointChatItem item = new PointChatItem();
		item.chatitem = datas;
		item.key = key;
		item.tag = tag;
		return mDbOperator.setPointUnreadChatItem(item);
	}

	/**
	 * 保存群组聊天记录
	 * @return
	 */
	public long setCommunityChatItem(String key,ChatGroupItem item){
		maybeOpenDatabase();
		return mDbOperator.setCommunityChatItem(key,item);
	}
	/**
	 * 保存群组未读消息记录
	 * @return
	 */
	public long setCommunityUnreadChatItem(String key,ChatGroupItem item){
		maybeOpenDatabase();
		return mDbOperator.setCommunityUnreadChatItem(key,item);
	}

	/**
	 * 删除群组聊天记录
	 * */
	public boolean deleteGroupChatItem(String key){
		maybeOpenDatabase();
		return mDbOperator.deleteGroupChatItem(key);
	}
	/**
	 * 获取群组聊天数据记录
	 * @param key
	 * @return
	 */
	public List<ChatGroupItem> getCommunityChatList(String key){
		maybeOpenDatabase();
		return mDbOperator.getCommunityChatList(key);
	}

	public Long updateChatGroupItem(String key, ChatGroupItem datas){
		maybeOpenDatabase();
		return mDbOperator.updateChatGroupItem(key, datas);
	}

	public long setChatGroupItem(String toGroup, ChatGroupItem datas) {
		maybeOpenDatabase();
		return mDbOperator.setChatGroupItem(toGroup, datas);
	}

	public List<ChatGroupItem> getChatGroupItem(String fromUser, long id, int pageMax) {
		maybeOpenDatabase();
		return mDbOperator.getChatGroupItem(fromUser, id, pageMax);
	}

	public ChatGroupItem getLatestChatGroupItem(String communityId) {
		maybeOpenDatabase();
		return mDbOperator.getLastChatGroupItem(communityId);
	}

	/**群组未读消息数量**/
	/**key = UserHelp.getInstance().getSyUserId()**/
	public int getGroupUnreadNum(String key){
		maybeOpenDatabase();
		return mDbOperator.getAllGroupUnreadNum(key);
	}

	public List<ChatItem> getChatItem(String fromUser, int id, int pageMax) {
		maybeOpenDatabase();
		return mDbOperator.getChatItem(fromUser, id, pageMax);
	}

	public ChatItem getLatestChatItem(String fromUser) {
		maybeOpenDatabase();
		return mDbOperator.getChatItem(fromUser);
	}

	public long setChatItem(String toUser, ChatItem datas) {
		maybeOpenDatabase();
		return mDbOperator.setChatItem(toUser, datas);
	}

	public long setUnreadChatItem(String toUser, ChatItem datas) {
		maybeOpenDatabase();
		return mDbOperator.setUnreadChatItem(toUser, datas);
	}
	public long setSystemItem(String key, SystemInfoItem datas) {
		maybeOpenDatabase();
		return mDbOperator.setSystemItem(key, datas);
	}
	public List<SystemInfoItem> getSystemInfoItem(String key){
		maybeOpenDatabase();
		return mDbOperator.getSystemInfoItem(key);
	}

	/**
	 * 删除系统消息
	 */
	public boolean deleteSystemChatItem(String key, String fromId){
		maybeOpenDatabase();
		return mDbOperator.deleteSystemChatItem(key, fromId);
	}

	/**点对点未读消息数量**/
	/**key = UserHelp.getInstance().getSyUserId()**/
	public int getPointUnreadNum(String key){
		int tempShopFansAllUnreadNum = 0;

		List<ChatItem> mLastChatList = new ArrayList<ChatItem>();
		mLastChatList = DataJavaProvider.getInstance().getLastPointChat(key);
		for(ChatItem item : mLastChatList){
			tempShopFansAllUnreadNum += Integer.parseInt(item.getUnreadNum());
		}
		Log.i(TAG, "-----tempShopFansAllUnreadNum="+tempShopFansAllUnreadNum);

		return tempShopFansAllUnreadNum;
	}

	/**群组未读消息数量**/
	/**key = UserHelp.getInstance().getSyUserId()**/
	public int getAllGroupUnreadNum(String key){
		int tempCommunityAllUnreadNum = DataJavaProvider.getInstance().getGroupUnreadNum(key);
		Log.i(TAG, "-----tempCommunityAllUnreadNum="+tempCommunityAllUnreadNum);

		return tempCommunityAllUnreadNum;
	}

}

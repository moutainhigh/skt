package net.meyki.skt.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES {

	public static final String ALGORITHM = "AES";
	private static final String DEFAULT_CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
	private static String ivParameter = "aVDl74rJuO@#^C0S";

	private AES() {

	}

	/**
	 * 加密
	 * @param data
	 * @param secretKey
	 * @param vector
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String data, String secretKey, String vector) {

		if (secretKey == null) {
			return null;
		}
		if (secretKey.length() != 16) {
			return null;
		}
		try {
			Cipher cipher;
			cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);

			byte[] raw = secretKey.getBytes();
			SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGORITHM);

			if (null == vector || "".equals(vector)) {
				vector = ivParameter;
			}
			IvParameterSpec iv = new IvParameterSpec(vector.getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强度

			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
			byte[] encrypted;
			encrypted = cipher.doFinal(data.getBytes("utf-8"));
			return BaseCode64.encode(encrypted);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 加密
	 * @param data
	 * @param secretKey
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String data, String secretKey){
		String encryptedData = encrypt(data, secretKey,null);
		return encryptedData;
	}

	/**
	 * 解密
	 * @param data
	 * @param secretKey
	 * @return
	 */
	public static String decrypt(String data, String secretKey){
		String decryptedData = decrypt(data,secretKey,null);
		return decryptedData;
	}

	/**
	 * 解密
	 * @param data
	 * @param secretKey
	 * @return
	 */
//	public static String decrypt(String data){
//		String decryptedData = decrypt(data,getDefaultSecretKey(),null);
//		return decryptedData;
//	}

	/**
	 * 解密
	 * @param data
	 * @param secretKey
	 * @param vector
	 * @return
	 */
	public static String decrypt(String data, String secretKey, String vector) {
		try {
			Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
			if (null == vector || "".equals(vector)) {
				vector = ivParameter;
			}
			IvParameterSpec iv = new IvParameterSpec(vector.getBytes());
			byte[] raw = secretKey.getBytes();
			SecretKeySpec skeySpec = new SecretKeySpec(raw, ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] encryptedData = BaseCode64.decode(data);
			byte[] original = cipher.doFinal(encryptedData);
			String originalString = new String(original, "utf-8");
			return originalString;
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * 二进制转16进制
	 *
	 * @param buf
	 * @return
	 */
	public static String byte2HexString(byte[] b, boolean toLowerCase) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(toLowerCase ? hex.toLowerCase() : hex.toUpperCase());
		}
		return sb.toString();
	}

	/**
	 * 16进制转二进制
	 */
	public static byte[] hexString2Byte(String hex) {
		if (hex.length() < 1)
			return null;
		byte[] result = new byte[hex.length() / 2];
		for (int i = 0; i < hex.length() / 2; i++) {
			int high = Integer.parseInt(hex.substring(i * 2, i * 2 + 1), 16);
			int low = Integer.parseInt(hex.substring(i * 2 + 1, i * 2 + 2), 16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}

	/**
	 * 从32位的key中截取11-26区间的16位作为key
	 * @param key 原始key
	 * @return
	 */
	public static String getSecretKey16(String key){
		if(key.length()==32){
			return key.substring(10, 26);
		}
		return null;
	}

	/**
	 * 获取默认key
	 * @return
	 */
//	public static String getDefaultSecretKey(){
//		String key = PropertiesUtil.getProperty("config/env.properties", "security.aes.key");
//		key = getSecretKey16(key);
//		return key;
//	}

	public static void main(String[] args){
		// 需要加密的字串
		//String src = "RSA很少用\\1234567[]\\//+-/\\?@#==]";
		String src = "{\"isValidate\":1,\"money\":\"100\",\"shopImg\":\"http://i1.meyki.net/aliyun/2016-01-18/log.png\",\"shopName\":\"\",\"tag\":\"shop\",\"userId\":\"929e1675689644f6b25f78e0e0fb4ef6\"}";

		String key = "3+kq2q.oJRU6LW#%.*@0qVfecZQ8DfG2";

		System.out.println("加密前的字串是：" + src);
		// 加密
		String enString = AES.encrypt(src, getSecretKey16(key));
		System.out.println("加密后的字串是：" + enString);

		// 解密
		String DeString = AES.decrypt(enString, getSecretKey16(key));
		System.out.println("解密后的字串是：" + DeString);
	}
}
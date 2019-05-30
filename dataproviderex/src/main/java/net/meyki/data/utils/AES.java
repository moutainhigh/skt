package net.meyki.data.utils;

import net.meyki.skt.utils.BaseCode64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES {

	public static final String ALGORITHM = "AES";
	private static final String DEFAULT_CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
	//加密用的Key 可以用26个字母和数字组成 此处使用AES-128-CBC加密模式，key需要为16位。
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
	 * 
	 * @param key
	 * @return
	 */
	public static String getSecretKey16(String key){
		if(key.length()>16){
			return key.substring(0, key.length()-1);
		}
		return key;
	}

	public static void main(String[] args){
//		// 需要加密的字串
//		String cSrc = "RSA很少用\\1234567[]\\//+-/\\?@#==]";
//		String key = "1234567891234567";
//		// 加密
//		long lStart = System.currentTimeMillis();
//		String enString = AES.encrypt(cSrc, key);
//		System.out.println("加密后的字串是：" + enString);
//
//		long lUseTime = System.currentTimeMillis() - lStart;
//		System.out.println("加密耗时：" + lUseTime + "毫秒");
//		// 解密
//		lStart = System.currentTimeMillis();
//		String DeString = AES.decrypt(enString, key);
//		System.out.println("解密后的字串是：" + DeString);
	}

}
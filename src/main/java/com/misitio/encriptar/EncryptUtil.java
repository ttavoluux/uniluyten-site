package com.misitio.encriptar;

import org.apache.commons.codec.binary.Base64;

public class EncryptUtil {
	
	public static String encode(final String password) {
		return Base64.encodeBase64String(org.apache.commons.codec.binary.StringUtils.getBytesUtf8(password));
	}
	
	
	public static String decode(final String passwordEncoded) {
		return org.apache.commons.codec.binary.StringUtils.newStringUsAscii(Base64.decodeBase64(passwordEncoded));
	}
}

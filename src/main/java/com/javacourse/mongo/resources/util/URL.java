package com.javacourse.mongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {
	
	public static String decodeParamms(String text) {
		try {
			return URLDecoder.decode(text, "UTF8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	public static Date convertDate(String stringDate, Date dateDefault) {
		SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd");
		dtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		try {
			return dtFormat.parse(stringDate);
		} catch (ParseException e) {
			return dateDefault;
		}
	}

}

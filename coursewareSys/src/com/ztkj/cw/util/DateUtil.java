package com.ztkj.cw.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**
	 * 将java.util.Date对象转换为java.sql.Date对象
	 * @param date java.util.Date对象
	 * @return 转换后的java.sql.Date对象
	 */
	public static java.sql.Date util2SqlDate(Date date){
		java.sql.Date sdate = null;
		// 将java.util.Date转换为java.sql.Date
		sdate = new java.sql.Date(date.getTime());
		return sdate;
	}
	public static Timestamp util2Timestamp(Date date) {
		Timestamp timestamp = null;
		timestamp = new Timestamp(date.getTime());
		return timestamp;
	}
	/**
	 * 将时间字符串按照给定的格式转换为时间
	 * @param strDate 时间字符串
	 * @param pattern 格式
	 * @return 转换之后的时间对象
	 * @throws ParseException 转换异常
	 */
	public static Date toUtilDate(String strDate, String pattern) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		// 将时间字符串转换为时间
		date = sdf.parse(strDate);
		return date;
	}
}

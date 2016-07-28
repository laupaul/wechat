package com.commons.dateutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String format(String format, Date date) {
		return new SimpleDateFormat(format).format(date);
	}

	public static Date parse(String format, String resource) {
		try {
			return new SimpleDateFormat(format).parse(resource);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}

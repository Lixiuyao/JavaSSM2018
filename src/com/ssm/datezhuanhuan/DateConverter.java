package com.ssm.datezhuanhuan;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{

	@Override
	public Date convert(String source) {
		if (null!=source) {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");;
			try {
				return format.parse(source);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}

package com.it.ys.datetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatDemo {
	
	public static void main(String[] args) throws ParseException {
		
//		method1();
		
		Calendar c=Calendar.getInstance();
		
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, 1);
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DAY_OF_MONTH);
		
		
		System.out.println(y+"-"+m+"-"+d);
	}

	private static void method1() throws ParseException {
		//创建参考模型
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = new Date();
		String format = sdf.format(date);
		System.out.println(format);
		
		
		Date parse = sdf.parse("2025-00-22 45:34:34");
		
		System.out.println(parse.toLocaleString());
	}
}

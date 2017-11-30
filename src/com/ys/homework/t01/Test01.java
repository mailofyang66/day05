package com.ys.homework.t01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) throws Exception {
		
//	第一题：分析以下需求，并用代码实现
//	1.已知日期字符串:"2015-10-20",将该日期字符串转换为日期对象
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		Date date = sd.parse("2015-10-20");
		System.out.println(date);
		
		
//	2.将(1)中的日期对象转换为日历类的对象
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		
		
//	3.根据日期对象获取改日期是星期几,以及这一年的第几天   
		int week = c.get(Calendar.DAY_OF_WEEK)-1;
		int day_of_year = c.get(Calendar.DAY_OF_YEAR);
		System.out.println("这一天是星期"+week+",一年中的第"+day_of_year+"天");
		
		
//	4.通过键盘录入日期字符串，格式(2015-10-20) 
//		如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第 293 天"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入yyyy-MM-dd格式的日期（y-年，M-月，d-日）");
		String line = scan.nextLine();
		scan.close();
		Date date2 = sd.parse(line);
		c.setTime(date2);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int wk = c.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		String w = day_of_week(wk);
		
		System.out.println(year+"年-"+month+"月-"+day+"日 是 星期"+w+"，是"+year+"年的第 "+dayOfYear+" 天");
	}

	
	
	private static String day_of_week(int wk) {
		String w="日";
		switch(wk){
		case 2:
			w="一";
			break;
		case 3:
			w="二";
			break;
		case 4:
			w="三";
			break;
		case 5:
			w="四";
			break;
		case 6:
			w="五";
			break;
		case 7:
			w="六";
			break;
		case 1:
			w="日";
			break;
		}
		return w;
	}
}

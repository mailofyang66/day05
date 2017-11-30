package com.ys.homework.t01;

import java.util.Calendar;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 第四题：分析以下需求，并用代码实现
		// 要求:利用Calendar类的方法判断当前年是闰年还是平年
		// 提示:
		// 闰年:二月有29天
		// 将日期设置为3月1号,然后倒退1天至2月底,求出2月底是多少天
		Calendar c = Calendar.getInstance();
		System.out.println("输入年份：yyyy");
		Scanner scanner = new Scanner(System.in);
		
		//设置时间
		c.set(scanner.nextInt(), Calendar.MARCH, 1);
		//减一天
		c.add(Calendar.DAY_OF_MONTH, -1);
		//判断是否是29天
		if (c.get(Calendar.DAY_OF_MONTH) == 29) {
			System.out.println("闰年");

		}

		scanner.close();
	}
}

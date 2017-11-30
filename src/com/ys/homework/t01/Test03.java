package com.ys.homework.t01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws Exception {

		// 第三题：分析以下需求，并用代码实现
		// 1.从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
		System.out.println("请按xxxx-xx-xx格式输入出生日期");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();

		// 2.利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天

		Date date = sdf.parse(line);
		long both = date.getTime();
		long currentTimeMillis = System.currentTimeMillis();
		long alive = currentTimeMillis - both;
		
		System.out.println("你已经来到世上"+alive/(1000*60*60*24)+"天");

	}
}

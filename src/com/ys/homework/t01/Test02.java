package com.ys.homework.t01;

public class Test02 {

	public static void main(String[] args) {

		// 第二题：分析以下需求，并用代码实现
		// (根据描述写匹配手机号和邮箱的正则表达式)
		// 1.根据描述写出正则表达式
		// (1)手机号正则:
		// 第一位为1
		// 第二位为3或4或5或7或8
		// 第三~十一位为0~9的其中一个数字
		String phoneCheck = "1[34578][0-9]{9}";

		
		// (2)邮箱正则:以@分界
		// @ 符号左边为任意多个字符
		// @ 符号右边为任意多个字符,点符号,任意多个字符
		String emailCheck = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";

		
		// 2.利用正则表达式完成以下需求:
		// (1)判断"zhang@123.com"是否符合邮箱的格式
		String em1 = "zhang@123.com";
		boolean eB = em1.matches(emailCheck);
		System.out.println(eB);

		
		// (2)定义一个存放邮箱的字符串数组{"hhxx@163.com","18601066888","nxgw@yeah.net","jpql@sohu.com.cn","15115888028"}
		// 利用正则表达式过滤出所有的邮箱,并打印

		String[] arrEs = { "hhxx@163.com", "18601066888", "nxgw@yeah.net", "jpql@sohu.com.cn", "15115888028" };
		for (int i = 0; i < arrEs.length; i++) {
			boolean flag = arrEs[i].matches(emailCheck);

			if (flag)
				System.out.println(arrEs[i]);
		}
	}
}

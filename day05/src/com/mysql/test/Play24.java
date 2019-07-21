package com.mysql.test;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Play24 {

	private static int result[] = new int[4];
	public static int reckon(char sign, int number, int number1) {
		int number2 = 0;
		switch (sign) {
		case '+':
			number2 = number + number1;
			break;
		case '-':
			number2 = number - number1;
			break;
		case '*':
			number2 = number * number1;
			break;
		case '/':
			number2 = number / number1;
			break;
		case '^':
			number2 = number * number;
			break;
		}
		return number2;
	}

	public static String chooseSign(int n,int x) {
		String string ="";
		switch (n) {
		case 0:
			string="a"+chooString(result[x])+"b";
			break;
		case 1:
			string="a"+chooString(result[x])+"c";
			break;
		case 2:
			string="a"+chooString(result[x])+"d";
			break;
		case 3:
			string="b"+chooString(result[x])+"c";
			break;
		case 4:
			string="b"+chooString(result[x])+"d";
			break;
		case 5:
			string="c"+chooString(result[x])+"d";
			break;
		}
		return string;
	}
	public static String chooString(int n1) {
		String string="";
		switch (n1) {
		case 0:
			string+="+";
			break;
		case 1:
			string="-";
			break;
		case 2:
			string="*";
			break;
		case 3:
			string="/";
			break;
		}
		return string;
	}
	public static void main(String[] args) {
		boolean flag1=true;
		while(flag1) {
		// 运算顺序：先括号 平方 乘除 加减
		int number[] = new int[4];
		for (int i = 0; i < number.length; i++) {
			int x = 1 + (int) (Math.random() * 13);
			number[i] = x;
		}
		// 排序
		int temp = 0;
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = 0; j < number.length - 1; j++) {
				if (number[j] < number[j + 1]) {
					temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
				}
			}
		}

		System.out.println("----------------");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		// ab只能与cd
		// ac只能与bd
		// ad只能与bc
		// 加减乘除随机数组
		int ab[] = new int[4];
		int ac[] = new int[4];
		int ad[] = new int[4];
		int bc[] = new int[4];
		int bd[] = new int[4];
		int cd[] = new int[4];
		int k = 0;
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				ab[k] = reckon('+', number[0], number[1]);
				ab[k + 1] = reckon('-', number[0], number[1]);
				ab[k + 2] = reckon('*', number[0], number[1]);
				ab[k + 3] = reckon('/', number[0], number[1]);
				k = 0;
			} else if (i == 1) {
				ac[k] = reckon('+', number[0], number[2]);
				ac[k + 1] = reckon('-', number[0], number[2]);
				ac[k + 2] = reckon('*', number[0], number[2]);
				ac[k + 3] = reckon('/', number[0], number[2]);
				k = 0;
			} else if (i == 2) {
				ad[k] = reckon('+', number[0], number[3]);
				ad[k + 1] = reckon('-', number[0], number[3]);
				ad[k + 2] = reckon('*', number[0], number[3]);
				ad[k + 3] = reckon('/', number[0], number[3]);
				k = 0;
			} else if (i == 2) {
				bc[k] = reckon('+', number[1], number[2]);
				bc[k + 1] = reckon('-', number[1], number[2]);
				bc[k + 2] = reckon('*', number[1], number[2]);
				bc[k + 3] = reckon('/', number[1], number[2]);
				k = 0;
			} else if (i == 3) {
				bd[k] = reckon('+', number[1], number[3]);
				bd[k + 1] = reckon('-', number[1], number[3]);
				bd[k + 2] = reckon('*', number[1], number[3]);
				bd[k + 3] = reckon('/', number[1], number[3]);
				k = 0;
			} else if (i == 4) {
				bd[k] = reckon('+', number[1], number[3]);
				bd[k + 1] = reckon('-', number[1], number[3]);
				bd[k + 2] = reckon('*', number[1], number[3]);
				bd[k + 3] = reckon('/', number[1], number[3]);
			} else if (i == 5) {
				cd[k] = reckon('+', number[2], number[3]);
				cd[k + 1] = reckon('-', number[2], number[3]);
				cd[k + 2] = reckon('*', number[2], number[3]);
				cd[k + 3] = reckon('/', number[2], number[3]);
				k = 0;
			}
		}
		System.out.println(">>>>>>>>>>>>>>>>>");
		for (int i = 0; i < cd.length; i++) {
			System.out.println(ab[i] + ">>" + cd[i] + ">>" + ac[i] + ">>" + bd[i] + ">>" + ad[i] + ">>" + bc[i]);
		}
		// 结果组合
		
		boolean flag = false;
		char sign[] = { '+', '-', '*' };
		for (int i = 0; i < ab.length; i++) {
			for (int j = 0; j < cd.length; j++) {
				if (cd[j] != 0) {
					if ((reckon('*', ab[i], cd[j]) == 24) || (reckon('/', ab[i], cd[j]) == 24)
							|| (reckon('+', ab[i], cd[j]) == 24) || (reckon('-', ab[i], cd[j]) == 24)) {
						flag = true;
						result[0] = i;
						result[1] = j;
						result[2] = 0;
						result[3] = 5;
					}
				} else {
					if ((reckon('*', ab[i], cd[j]) == 24) || (reckon('+', ab[i], cd[j]) == 24)
							|| (reckon('-', ab[i], cd[j]) == 24)) {
						flag = true;
						result[0] = i;
						result[1] = j;
						result[2] = 0;
						result[3] = 5;
					}
				}
			}
			for (int j = 0; j < bd.length; j++) {
				if (bd[j] != 0) {
					if ((reckon('*', ac[i], bd[j]) == 24) || (reckon('/', ac[i], bd[j]) == 24)
							|| (reckon('+', ac[i], bd[j]) == 24) || (reckon('-', ac[i], bd[j]) == 24)) {
						flag = true;
						result[0] = i;
						result[1] = j;
						result[2] = 1;
						result[3] = 4;
					}
				} else {
					if ((reckon('*', ac[i], bd[j]) == 24) || (reckon('+', ac[i], bd[j]) == 24)
							|| (reckon('-', ac[i], bd[j]) == 24)) {
						flag = true;
						result[0] = i;
						result[1] = j;
						result[2] = 1;
						result[3] = 4;
					}
				}
			}
			for (int j = 0; j < bc.length; j++) {
				if (bc[j] != 0) {
					if ((reckon('*', ad[i], bc[j]) == 24) || (reckon('/', ad[i], bc[j]) == 24)
							|| (reckon('+', ad[i], bc[j]) == 24) || (reckon('-', ad[i], bc[j]) == 24)) {
						flag = true;
						result[0] = i;
						result[1] = j;
						result[2] = 2;
						result[3] = 3;
					}
				} else {
					if ((reckon('*', ad[i], bc[j]) == 24) || (reckon('+', ad[i], bc[j]) == 24)
							|| (reckon('-', ad[i], bc[j]) == 24)) {
						flag = true;
						result[0] = i;
						result[1] = j;
						result[2] = 2;
						result[3] = 3;
					}
				}
			}
			if (flag) {
				// a b c d
				// ab0 ac1 ad2 bc3 bd4 cd5

				System.out.println("运算成功" + ">>>>>>" + chooseSign(result[2],result[0]) + ">>>>" + chooseSign(result[3],result[1]));
				flag1=false;				
			}
			System.out.println("运算失败");
		}
		}
	}
}

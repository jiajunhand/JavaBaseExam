package com.hand;

import java.util.Scanner;

import java.util.*;
public class App{
	public static void main(String args[]){
		int a ,b,c,day = 0;
		boolean leap = false ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入日期（以空格隔开，没有实现XXXX-XX-XX的格式）：");
		a = scanner.nextInt();
		//if(a > 2 && a <= 12)
			//leap2 = true;
		if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			leap = true;
		b = scanner.nextInt();
		switch(b){
		case 2 : day = 31;
		break;
		case 3 : day = 59;
		break;
		case 4 : day = 90;
		break;
		case 5 : day = 120;
		break;
		case 6 : day = 151;
		break;
		case 7 : day = 181;
		break;
		case 8 : day = 212;
		break;
		case 9 : day = 243;
		break;
		case 10 : day = 273;
		break;
		case 11 : day = 304;
		break;
		case 12 : day = 334;break;
		default : System.out.println("当前为第一个月");
		}
		c= scanner.nextInt();
		day += c;
		if(leap)
			day ++;
		System.out.println("你输入的日期是当年的第" + day + "天");
		}
	}


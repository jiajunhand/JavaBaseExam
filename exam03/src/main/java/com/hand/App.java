package com.hand;

import java.util.Scanner;

import java.util.*;
public class App{
	public static void main(String args[]){
		int a ,b,c,day = 0;
		boolean leap = false ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("���������ڣ��Կո������û��ʵ��XXXX-XX-XX�ĸ�ʽ����");
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
		default : System.out.println("��ǰΪ��һ����");
		}
		c= scanner.nextInt();
		day += c;
		if(leap)
			day ++;
		System.out.println("������������ǵ���ĵ�" + day + "��");
		}
	}


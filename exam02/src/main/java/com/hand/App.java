package com.hand;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

class Worker{
	static double newmoney;
	static double paymoney;
	public void tell(){ 
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入工资：");
		double money=scanner.nextDouble();
		 newmoney=money-3500;
		 if (newmoney<0) {
			 paymoney=0;	
		}else if (newmoney>0&&newmoney<1500) {
			paymoney=newmoney*0.03;
		}else if (newmoney>=1500&&newmoney<4500) {
			paymoney=newmoney*0.1;
		}else if (newmoney>=4500&&newmoney<9000) {
			paymoney=newmoney*0.2;
		}else if (newmoney>=9000&&newmoney<35000) {
			paymoney=newmoney*0.25;
		}else if (newmoney>=35000&&newmoney<55000) {
			paymoney=newmoney*0.3;
		}else if (newmoney>=55000&&newmoney<80000) {
			paymoney=newmoney*0.35;
		}else if (newmoney>=80000) {
			paymoney=newmoney*0.45;
		}
		 
		 System.out.println("所需要缴纳的税费为："+paymoney);
	}
	
	
	
}


public class App 
{
    public static void main( String[] args )
    {
		Worker w=new Worker();
    	w.tell();
    }
}

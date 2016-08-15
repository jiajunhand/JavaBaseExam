package com.hand;


public class App {
	public static void main(String[] args) {
        int i,j;
for(i=101;i<=200;i++)
{
	for(j=2;j<i;j++)
	{
		if(i%j==0)
		{
			break;
		}
	}
	if(i==j)
	{
		System.out.println(i);
	}

}

}

}




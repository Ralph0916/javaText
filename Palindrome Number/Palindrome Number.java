package cs;

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		int a=123321;		//定义一个整数
		int x=a;				//将整数赋给变量，变量a后面有用
		int y=0;				//下面是将一从个整数翻转过来
		while(x!=0)
		{
			int j=x%10;
			x/=10;
			y=y*10+j;
		}
		if(a==y)
			System.out.println("true");
		else
			System.out.println("false");
	}

}

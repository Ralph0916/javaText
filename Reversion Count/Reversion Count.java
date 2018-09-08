package newtetxt;

import java.util.Scanner;

public class one {
	public static void main(String[] args)
	{		
		Scanner s=new Scanner(System.in);
		System.out.println("输入1个整数");
		int x=s.nextInt();
		int j=0;				//定义一个变量，用来存放最终结果
		while(x!=0)
		{
			int y=x%10;			//将这个整数的最后一位取出来
			x/=10;				//对整数取整（将个位数去掉）
			j=j*10+y;			//先将之前取出来的数*10，再把当前整数的最后一位加进来
		}
		System.out.println(j);
	}
}


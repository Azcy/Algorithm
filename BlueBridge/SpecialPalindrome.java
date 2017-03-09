import java.util.Scanner;

/**
特殊回文数
问题描述
　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
输入格式
　　输入一行，包含一个正整数n。
输出格式
　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
样例输入
52
样例输出
899998
989989
998899
数据规模和约定
　　1<=n<=54。
*/
public class Main {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		get5(n);
		get6(n);
	}
	static void get5(int number)
	{
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int k=0;k<10;k++)
				{
					for(int m=0;m<10;m++)
					{
						for(int l=0;l<10;l++)
						{
							if(i==l&&j==m)
							{
								if((i+k+j+m+l)==number)
								System.out.println(i*10000+j*1000+k*100+m*10+l);
							
							}
						}
					}
				}
			}
		}
	}
	static void get6(int number)
	{
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int k=0;k<10;k++)
				{
					for(int m=0;m<10;m++)
					{
						for(int l=0;l<10;l++)
						{
							for(int n=0;n<10;n++)
							{
								if(i==n&&j==l&&k==m)
							{	
									if((i+k+j+m+l+n)==number)
										System.out.println(i*100000+j*10000+k*1000+m*100+l*10+n);
							
							}
							
							}
						}
					}
				}
			}
		}
	}
}
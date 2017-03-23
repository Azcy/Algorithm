/**
四平方和

四平方和定理，又称为拉格朗日定理：
每个正整数都可以表示为至多4个正整数的平方和。
如果把0包括进去，就正好可以表示为4个数的平方和。

比如：
5 = 0^2 + 0^2 + 1^2 + 2^2
7 = 1^2 + 1^2 + 1^2 + 2^2
（^符号表示乘方的意思）

对于一个给定的正整数，可能存在多种平方和的表示法。
要求你对4个数排序：
0 <= a <= b <= c <= d
并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法


程序输入为一个正整数N (N<5000000)
要求输出4个非负整数，按从小到大排序，中间用空格分开

例如，输入：
5
则程序应该输出：
0 0 1 2

再例如，输入：
12
则程序应该输出：
0 2 2 2

再例如，输入：
773535
则程序应该输出：
1 1 267 838
*/

import java.util.Scanner;
import java.lang.Math;
public class Night
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		boolean flag=false;
		for(int a=0;a<=Math.sqrt(num)&&!flag;a++)
		{
			for(int b=a;b<=Math.sqrt(num)&&!flag;b++)
			{
				for(int c=b;c<=Math.sqrt(num)&&!flag;c++)
				{
					double d=Math.sqrt(num-(a*a+b*b+c*c));
					
					if((num==(a*a+b*b+c*c+d*d)))
					{
							if(d==(int)d)
							{
							System.out.print(a+" "+b+" "+c+" "+(int)d);
							
							flag=true;
							}
					}
				}
			}
		}
	}
}
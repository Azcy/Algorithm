/**

凑算式

     B      DEF
A + --- + ------- = 10
     C      GHI
     
（如果显示有问题，可以参见【图1.jpg】）
	 
	 
这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

比如：
6+8/3+952/714 就是一种解法，
5+3/1+972/486 是另一种解法。

这个算式一共有多少种解法？

注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。

*/


public class Sixth
{
	 static boolean check(int a,int b,int c,int d,int e,int f,int g,int h,int i)
	{
		int num[]=new int[]{a,b,c,d,e,f,g,h,i};
		for(int k=0;k<num.length;k++)
		{
			for(int j=k+1;j<num.length;j++)
			{
				if(num[k]==num[j])
				return false;
				
			}
			
		}
		return true;
	}
	public static void main(String[] args)
	{
		int Anum=0,Bnum=0,Cnum=0,Dnum=0;
		int count=0;
		for(int a=1;a<10;a++)
		{
			for(int b=1;b<10;b++)
			{
				for(int c=1;c<10;c++)
				{
					for(int d=1;d<10;d++)
					{
						for(int e=1;e<10;e++)
						{
							for(int f=1;f<10;f++)
							{
								for(int g=1;g<10;g++)
								{
									for(int h=1;h<10;h++)
									{
										for(int i=1;i<10;i++)
										{
										 double num = a + b*1.0/c + (100*d+10*e+f)*1.0/(100*g+10*h+i)-10;
											
											if(check(a,b,c,d, e,f,g,h,i)&&(num==0))
											{
												count++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
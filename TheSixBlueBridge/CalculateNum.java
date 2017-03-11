public class CalculateNum
{
	
/**
		
3.三羊献瑞

观察下面的加法算式：

      祥 瑞 生 辉
  +   三 羊 献 瑞
-------------------
   三 羊 生 瑞 气

(如果有对齐问题，可以参看【图1.jpg】)

其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。

请你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。


	*/
	
	public static void main(String []args)
	{
		int number1,number2,number3;
		for(int a=1;a<=9;a++)
		{
			for(int b=0;b<=9;b++)
			{
				for(int c=0;c<=9;c++)
				{
					for(int d=0;d<=9;d++)
					{
						for(int e=1;e<=9;e++)
						{
							for(int f=0;f<=9;f++)
							{
								for(int g=0;g<=9;g++)
								{
										for(int h=0;h<=9;h++)
										{
											number1=a*1000+b*100+c*10+d;
											number2=e*1000+f*100+g*10+b;
											number3=e*10000+f*1000+c*100+b*10+h;
											if((number1+number2==number3)&&check(a,b,c,d,e,f,g,h))
											{
												System.out.println(number1+"+"+number2+"="+number3);
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
	public static boolean check(int a,int b,int c,int d,int e,int f,int g,int h)
	{
		int num[]=new int[]{a,b,c,d,e,f,g,h};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				if((i!=j)&&num[i]==num[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	
}
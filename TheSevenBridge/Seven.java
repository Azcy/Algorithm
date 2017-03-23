/**
搭积木

小明最近喜欢搭数字积木，
一共有10块积木，每个积木上有一个数字，0~9。

搭积木规则：
每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
最后搭成4层的金字塔形，必须用完所有的积木。

下面是两种合格的搭法：

   0
  1 2
 3 4 5
6 7 8 9

   0
  3 1
 7 5 2
9 8 6 4    

请你计算这样的搭法一共有多少种？

请填表示总数目的数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。



  
*/
public class Seven
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
		long startTime=System.currentTimeMillis();//获取开始时间
		int num[];
		num =new int[10];
		int count=0;
		num[0]=0;//第一排只能为0
			for(num[1]=1;num[1]<10;num[1]++)
			{
				for(num[2]=1;num[2]<10;num[2]++)
				{
					for(num[3]=1;num[3]<10;num[3]++)
					{
						for(num[4]=1;num[4]<10;num[4]++)
						{
							for(num[5]=1;num[5]<10;num[5]++)
							{
								for(num[6]=1;num[6]<10;num[6]++)
								{
									for(num[7]=1;num[7]<10;num[7]++)
									{
										for(num[8]=1;num[8]<10;num[8]++)
										{
											for(num[9]=1;num[9]<10;num[9]++)
											{
												if(check(num[1],num[2],num[3],num[4],num[5],num[6],num[7],num[8],num[9])&&num[0]<num[1]&&num[0]<num[2]&&num[1]<num[3]&&num[1]<num[4]&&num[2]<num[4]&&num[2]<num[5]&&num[3]<num[6]&&num[3]<num[7]&&num[4]<num[7]&&num[4]<num[8]&&num[5]<num[8]&&num[5]<num[9])
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
		long endTime = System.currentTimeMillis();    //获取结束时间
		System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
	}
}
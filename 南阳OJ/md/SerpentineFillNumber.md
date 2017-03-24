#蛇形填数
时间限制：3000 ms  |  内存限制：65535 KB

难度：3

描述

在n*n方陈里填入1,2,...,n*n,要求填成蛇形。例如n=4时方陈为：

10 11 12 1
9  16 13 2
8  15 14 3
7  6  5  4

输入

直接输入方陈的维数，即n的值。(n<=100)

输出

输出结果是蛇形方陈。

样例输入

	3
样例输出

	7 8 1
	6 9 2
	5 4 3

来源

算法经典

上传者

首席执行官

	/**
	思路：从右边依次递增，下边，左边，上边。循环（n-1）/2次
	*/
	import java.util.Scanner;
	public class SerpentineFillNumber
	{
		public static void main(String[] args)
		{
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int sum=1;
			int arr[][]=new int [n][n];
			int a,b;
			for(a=0;a<=(n-1)/2;a++)
			{
				//最右边的列
				for(b=a;b<=n-a-1;b++)
				{
					arr[b][n-a-1]=sum++;
				}
				//底部的行
				for(b=n-a-2;b>=a;b--)
				{
					arr[n-a-1][b]=sum++;
				}
				//最左边的列
				for(b=n-a-2;b>=a;b--)
				{
					arr[b][a]=sum++;
				}
				//最上边的列
				for(b=a+1;b<=n-a-2;b++)
				{
					arr[a][b]=sum++;
				}
			} 
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(sum/10>1)
					{
						System.out.print(arr[i][j]+" ");
					}else
						System.out.print(arr[i][j]+"   ");
					
				}
				System.out.println();
			}
		}
	}
# （NYoj 289）苹果 --01背包水题
苹果 

时间限制：3000 ms | 内存限制：65535 KB 

难度：3 

描述 

ctest有n个苹果，要将它放入容量为v的背包。给出第i个苹果的大小和价钱，求出能放入背包的苹果的总价钱最大值。

输入 

有多组测试数据，每组测试数据第一行为2个正整数，分别代表苹果的个数n和背包的容量v，n、v同时为0时结束测试，此时不输出。接下来的n行，每行2个正整数，用空格隔开，分别代表苹果的大小c和价钱w。所有输入数字的范围大于等于0，小于等于1000。 

输出 

对每组测试数据输出一个整数，代表能放入背包的苹果的总价值。 

	样例输入 
	3 3 
	1 1 
	2 1 
	3 1 
	0 0 
	样例输出 
	2
来源 

动态规划经典问题 

上传者 

ctest

## 思路
![](https://github.com/Azcy/Algorithm/blob/master/%E5%8D%97%E9%98%B3OJ/image/01%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92.jpg)

## 代码实现

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//输入苹果数目，
		int Acount=in.nextInt();
		//输入背包的容量
		int Bweight=in.nextInt();
		//创建存放苹果质量的数组
		int Aw[]=new int[Acount+1];
		//创建苹果价值的数组
		int Av[]=new int[Acount+1];
		//创建一个决策数组dp
		int dp[][]=new int [Acount+1][Bweight+1];
		
		//输入苹果的质量和价值
		for(int i=1;i<=Acount;i++)
		{
			Aw[i]=in.nextInt();
			Av[i]=in.nextInt();
		}
		//苹果数量
		for(int i=1;i<=Acount;i++)
		{
			//背包的容量
			for(int j=1;j<=Bweight;j++)
			{
				if(j>=Aw[i])
				{
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-Aw[i]]+Av[i]);
				}else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		for(int i=0;i<=Acount;i++)
		{
			//背包的容量
			for(int j=0;j<=Bweight;j++)
			{
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("最大"+dp[Acount][Bweight]);
		
	}
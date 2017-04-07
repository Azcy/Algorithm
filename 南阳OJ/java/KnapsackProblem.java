import java.util.Scanner;
public class KnapsackProblem
{
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
}
import java.util.Scanner;
public class CleverKk
{
	/**
	@param n 行数
	@param m 列数
	@param a[][] 用户来存放输入的数组，a[0][0~m]为0，a[0~n][n]为0
	@param maxAdd[][] 决策数组，用来存储动态规划每一步的决策结果
	*/
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//行数 
		int n=in.nextInt();
		//列数
		int m=in.nextInt();
		//创建一个数组，存放输入的值
		int a[][]=new int[n+1][m+1];
		//定义一个决策数组，用来存储动态规划每一步的决策结果
		int maxAdd[][]=new int [n+1][m+1];
		//定义一个路径数组
		//int path[][]=new int[n+1][m+1];
		//输入
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				a[i][j]=in.nextInt();
				maxAdd[i][j]=a[i][j];
			}
		}
		//继续决策
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				//maxAdd[i][j]=Math.max(maxAdd[i-1][j],maxAdd[i][j-1])+a[i][j];
				if(maxAdd[i-1][j]>maxAdd[i][j-1])
				{
					maxAdd[i][j]=maxAdd[i-1][j]+a[i][j];
					//path[i][j]=j;
				}else
				{
					maxAdd[i][j]=maxAdd[i][j-1]+a[i][j];
				//	path[i][j]=j-1;
				}
			}
		}
		//输出最大数值和，即最终的决策结果
		System.out.println(maxAdd[n][m]);
	
		
	}
}
import java.util.Scanner;
public class EightQueenPromble
{
	/**
	八皇后问题
	@param x[i] 表示第i个皇后摆放摆放在第i行第x[i]列的位置
	@param k 表示第k个皇后
	*/
	public void Queen(int n)
	{
		int x[]=new int[n];
		//初始化
		for (int i=0; i<n; i++) {
		 	x[i]=-1;
		}
		int k=0;
		while(k>=0)      //摆放皇后k，注意0=<k<n
		{
			x[k]++;       //在下一列摆放皇后k
			while(x[k]<n)
			{
				if(x[k]<n&&Place(k,x)==0) 
				{
					break;//符合则继续进行
				}else
				{
					x[k]++; //发生冲突，皇后k试探下一列
				}
			}
			if(x[k]<n&&k==n-1)  //得出一个可行解，输出
			{
				for(int i=0;i<n;i++)
				{
					System.out.print(x[i]+1+" ");
				}
				return;
			}
			
			if(x[k]<n&&k<n-1) //尚有皇后未摆放
			{
				k++;          //准备摆放下一个皇后
			}else
			{
				x[k]=-1;        //重置x[k]
				k--;             //回溯
			}
		}
		System.out.println("无解");
		
	}
	
	private static  int Place(int k,int x[])
	{
		for(int i=0;i<k;i++)
		{
			if(x[i]==x[k]||Math.abs(i-k)==Math.abs(x[i]-x[k])) //判断是否在同一列，且斜率1和-1是否在同一个斜线上
			{
				return 1;              //冲突返回1
			}
			                //不冲突返回0
		}return 0;
	}
	
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//输入一个数字n，表示n皇后
		System.out.println("请输入n:(n表示n个皇后问题)");
		int n=in.nextInt();
		new EightQueenPromble().Queen(n);
	}
}
/**
把整数{1，2，...,20}填写到一个环中，要求每个整数只填写一次，并且相邻的两个整数之和是一个素数。
例如下图所示就是整数{1,2,3,4}对应的一个素数环。
*/

public class PrimeRingProblem
{
	 
	private void PrimeRing(int n)
	{	
		int i,k;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=0;
		}
	
		a[0]=1;
			k=1;//指定第0个位置写1
		while(k>=1)
		{
			a[k]+=1; //a[k]存储0~n的数字，作为跟n的判断条件，每次轮回 都从a[k]=0+1开始。
			while(a[k]<=n) //
			{
				if(check(k,a)==1) //位置k可以填写整数a[k]
				{
					break;
				}else
				{
					a[k]+=1; //试探下一个数   
				}
			}
			
			if(a[k]<=n&&k==n-1)  //到达最后一个数字，输出
			{
				for(i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
				return ;
			}
			
			if(a[k]<=n&&k<n-1) //如果还没有到达末尾
			{
				k=k+1;  //则继续填写下一个位置
			}else
			{
				a[k]=0;
				k--;
			}
		}
	}
	//判断k位置是否符合约束条件
	int   check(int k,int a[])
	{
		int flag=0;
		//判断是否重复
		for(int i=0;i<k;i++)
		{
			if(a[i]==a[k])
			{
				return 0;
			}
		}
		flag=prime(a[k]+a[k-1]);
		if(flag==1&&k==a.length-1)
		{
			 flag=prime(a[k]+a[0]);
		}
		return flag;
	}
	
	//判断整数x是否是素数
	private int prime(int n)
	{
		int half=(int) Math.sqrt(n);

		for(int i=2;i<=half;i++)

			if(n%i==0){

				return 0;

			}
		return 1;
	}
	public static void main(String[] args)
	{
		new PrimeRingProblem().PrimeRing(20);
	}
}
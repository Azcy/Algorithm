# 素数环问题
## 1.题目
把整数{1，2，...,20}填写到一个环中，要求每个整数只填写一次，并且相邻的两个整数之和是一个素数。例如下图所示就是整数{1,2,3,4}对应的一个素数环。

## 2.思路
这个素数环有20个位置，每个位置可以填写的整数位1~20，共有20种可能，可以对每个位置从1开始进行试探，约束条件是正在试探的数满足如下条件：

(1)与已经填写到素数环中的整数不重复;

(2)与前面相邻的整数之和是一个素数;

(3)最后一个填写到素数环中的整数与第一个填写的整数之和是一个素数。

## 3.算法分析
设要填写1~n共n个整数，由于每个位置可以填写的情况有n种，隐藏，素数环问题的解空间树是一棵完全n叉树，且树的深度为n+1，因此最坏情况下的时间性能是O(n^n);

## 4.代码实现
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
			a[k]=a[k]+1; //a[k]存储0~n的数字，作为跟n的判断条件，每次轮回 都从a[k]=0+1开始。
			while(a[k]<=n) //
			{
				if(check(k,a)==1) //位置k可以填写整数a[k]
				{
					break;
				}else
				{
					a[k]=a[k]+1; //试探下一个数   
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
				a[k--]=0;
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

## [ 详细代码请点击](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/java/PrimeRingProblem.java)


# 过河问题
时间限制：1000 ms  |  内存限制：65535 KB

难度：5

描述

在漆黑的夜里，N位旅行者来到了一座狭窄而且没有护栏的桥边。如果不借助手电筒的话，大家是无论如何也不敢过桥去的。不幸的是，N个人一共只带了一只手电筒，而桥窄得只够让两个人同时过。如果各自单独过桥的话，N人所需要的时间已知；而如果两人同时过桥，所需要的时间就是走得比较慢的那个人单独行动时所需的时间。问题是，如何设计一个方案，让这N人尽快过桥。 

输入

第一行是一个整数T(1<=T<=20)表示测试数据的组数
每组测试数据的第一行是一个整数N(1<=N<=1000)表示共有N个人要过河
每组测试数据的第二行是N个整数Si,表示此人过河所需要花时间。(0<Si<=100)

输出

输出所有人都过河需要用的最少时间

样例输入
	
	1
	4
	1 2 5 10
样例输出

	17
来源

POJ

上传者

张云聪


## 解题思路
当n==1或者n==2时：所有人直接过河即可。

当n==3时：用时最长和用时最短的人先一起过去，然后用时最短的人回来，再在和剩下的一个人一起过去。

当n==4时：假设time[0]为用时最短的人所用的时间，time[1]为用时第二短的人所用的时间, time[n-1]为用时最长的人所用的时间，
  time[n-2]为用时第二长的人所用的时间。

**则有两种过河方式：**
  
  2*time[0]+time[n-1]+time[n-2]表示：用时最长的人和用时最短的人先一起过去，然后用时最短的人把手电筒带回来，再和用时第二长的人一起过去，用时最短的人回来。

  2*time[1]+time[0]+time[n-1]表示：用时最短和用时第二短的人一起过去，然后用时最短的人把手电筒带回来，然后用时最长和用时第二长的人一起过去，用时第二短的人回来。 
 
  比较两种过河方式：2*time[0]+time[n-1]+time[n-2]<2*time[1]+time[0]+time[n-1]
  
  这样相当于每次都过去了两个人，所以n-=2， 
  再对剩下的n-2个人执行相同的操作，直至不足4人即可。 
## 算法实现
	/**
	@param n 代表输入的次数。
	@param PeopleNum 过河人数
	@param CrossRiverTime[] 存储过河的时间
	@param result 全部人过河后的总时间
	*/
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//输入n，代表输入的次数
		int n=in.nextInt();
		while((n--)>0)
		{
			//过河总时间
			int result=0;
			//输入个河人数
			int PeopleNum=in.nextInt();
			//创建一个存取过河人的世界
			int CrossRiverTime[]=new int[PeopleNum];
			//分别输入过河人所需要的时间
			for(int i=0;i<PeopleNum;i++)
			{
				CrossRiverTime[i]=in.nextInt();
			}
			//对过河的时间进行排序
			Arrays.sort(CrossRiverTime);
		
			while(PeopleNum>3)
			{
				if(2*CrossRiverTime[1]+CrossRiverTime[0]+CrossRiverTime[PeopleNum-1]>2*CrossRiverTime[0]+CrossRiverTime[PeopleNum-1]+CrossRiverTime[PeopleNum-2])
				{
					//用时最长的人和用时最短的人先一起过去，然后用时最短的人把手电筒带回来，再和用时第二长的人一起过去，用时最短的人回来。
					result+=2*CrossRiverTime[0]+CrossRiverTime[PeopleNum-2]+CrossRiverTime[PeopleNum-1];
				}else
				{
					//用时最短和用时第二短的人一起过去，然后用时最短的人把手电筒带回来，然后用时最长和用时第二长的人一起过去，用时第二短的人回来。 
					result+=2*CrossRiverTime[1]+CrossRiverTime[0]+CrossRiverTime[PeopleNum-1];
				}
				PeopleNum-=2;
			}
				if(PeopleNum==1)
			{
				result+=CrossRiverTime[0];
				
			}
			if(PeopleNum==2)
			{
				result+=CrossRiverTime[1];
			}
			if(PeopleNum==3)
			{
				result+=CrossRiverTime[0]+CrossRiverTime[1]+CrossRiverTime[2];
			}
			System.out.println(result);
		}
	}
## [具体代码请点击](https://github.com/Azcy/Algorithm/blob/master/%E5%8D%97%E9%98%B3OJ/java/CrossRiver.java)
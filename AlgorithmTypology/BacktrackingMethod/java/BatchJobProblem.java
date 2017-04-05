import java.util.Scanner;
public class BatchJobProblem
{
	/**
	批处理作业调度问题
	@param a[] 存储n个作业在机器1上的处理时间
	@param a[] 存储n个作业在机器2上的处理时间
	@param n 一共有n个作业
	@param sum1[]存储机器1的完成时间
	@param sum2[]存储机器2的完成时间
	@return 返回最短时间
	*/
	 public int BatchJob(int a[],int b[],int n)
	 {
	 	int i,k;
	 	//x[]为安排作业
	 	int x[]=new int [n+1];
	 	//机器1上的完成时间
	 	int sum1[]=new int [n+1];
	 	//机器2上的完成时间
	 	int sum2[]=new int [n+1];
	 	int bestTime=1000;  //假定最后的完成时间不超过1000
	 	for(i=1;i<=n;i++) //初始化调度方案
	 	{
	 		x[i]=-1;
	 		sum1[i]=0;
	 		sum2[i]=0;
	 	}
	 	//开始调度时使用
	 	sum1[0]=0;
	 	sum2[0]=0;
	 	k=1;  //调度第1个作业
	 	while(k>=1)
	 	{
	 		x[k]=x[k]+1;
	 		while(x[k]<n)
	 		{
	 			for(i=1;i<k;i++)
	 			{
	 				if(x[i]==x[k])//检测作业x[k]是否重复处理 
	 					break;
	 			}
	 			//判断前面是否处理过当前任务
	 			if(i==k)
	 			{
	 			/*1.判断加入当前任务后是否超过最短时间，若超过则考察下一个任务，否则可以
          2.判断前，首先要知道机器一加入当前任务后的完成时间与机器二完成上一个任务的时间谁先谁后
          3.选择较后的一个时间加上当前任务在机器二上完成的时间就等于当前任务的完成后的时间
        */
	 				sum1[k]=sum1[k-1]+a[x[k]]; //机器1当前的完成时间，a[x[k]]表示第k个作业在机器一上的处理时间
	 				if(sum1[k]>sum2[k-1])   //如果当前作业在机器1的完成时间大于上一个作业在机器二的完成时间
	 				{
	 					sum2[k]=sum1[k]+b[x[k]];
	 				}else
	 				{
	 					sum2[k]=sum2[k-1]+b[x[k]];
	 				}
	 				//判断加入当前任务时间与最短时间
	 				if(sum2[k]<=bestTime)
	 				{
	 					//小于，则继续
	 						break;
	 				}
	 				else  //已经超过目前最短时间，剪枝
	 				{
	 					x[k]=x[k]+1;
	 				}
	 			}
	 			else
	 			{
	 				x[k]=x[k]+1;  //作业x[k]已处理，尝试下一个作业
	 			}
	 		}
	 		//判断是否是最后一个，若不是，则进入下一个任务
	 		if(x[k]<n&&k<n)
	 		{
	 			k=k+1; //安排下一个作业
	 		}else
	 		{
	 			//判断是否是最后一个任务
	 			if(x[k]<n&&k==n)  
	 			{
	 				if(bestTime>=sum2[k])
	 				{
	 					bestTime=sum2[k];
	 					System.out.print("目前最短作业安排是：");
	 					for(int j=1;j<=n;j++)
	 					{
	 						System.out.print(x[j]+1+" "); //作业编号从1开始
	 					}
	 					System.out.println("最短时间是"+bestTime);
	 				}
	 				
	 			}
	 			//回溯(因为要找到最短时间，当前找到的只是当前最短时间)
	 			x[k]=-1;  //重置x[k],回溯
	 			k--;
	 		}
	 		
	 	}
	 	return bestTime;
	 } 
	 
	 public static void main(String [] args)
	 {
	 	Scanner in=new Scanner(System.in);
	 	System.out.println("请输入作业的个数:");
	 	int n=in.nextInt();
	 	int a[]=new int[n];//机器1上的处理时间
	 	int b[]=new int[n]; //机器2上的处理时间
	 	System.out.println("分别输入在机器1上的处理时间:");
	 	for(int i=0;i<n;i++)
	 	{
	 		a[i]=in.nextInt();
	 	}
	 	System.out.println("分别输入在机器2上的处理时间:");
	 	for(int i=0;i<n;i++)
	 	{
	 		b[i]=in.nextInt();
	 	}
	 	int result=new BatchJobProblem().BatchJob(a,b,n);
	 	 if(result == -1) System.out.println("无法完成批处理作业调度!");
    else System.out.println("批处理作业调度的最短时间是：" + result);
	 }
}
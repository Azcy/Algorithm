/**
		0/1背包问题
对于n=3的0/1背包问题，三个物品的重量为{20，15，10}，价值为{20，30，25}，背包容量为25。
*/
public class KnapsackProblem
{
	int weight[]=new int[]{20,15,10};//表示物品的重量
	int value[]=new int[]{20,30,25};//物品对应的价值
	int feasible[]=new int[1000];
	int PackageSize=25;
	int KpCapacity;
	/**
	0/1背包问题的方法
	@ param i 为装进背包物品的个数
	@ param Kplvalue 背包内物品的价值
	@ param KpWeight 背包内物品的重量 
	@ param j  表示每个物品的放入与不放入的状态。
	*/
	public  void Knapsack(int i,int Kplvalue,int KpWeight)
	{
		int j;
		if(i>=weight.length)
		{
			//如果i已经大于所有物品的个数，表示已经拿完时，进行输出操作。
				for(int m=0;m<weight.length;m++)
				{
					System.out.print(feasible[m]+" ");
				}
				System.out.print("价值"+Kplvalue);	
				System.out.println();	
		}else
		{
			//用j来表示，物品的放入与不放入
			for(j=0;j<=1;j++)
			{
				//用来标记物品是否被选中
				feasible[i]=j;
				//判断包内重量+物品的质量是否小于包的总容量
				if(KpWeight+feasible[i]*weight[i]<=PackageSize)
				{	
					
					KpWeight+=feasible[i]*weight[i];
					Kplvalue+=feasible[i]*value[i];
					//递归调用
					Knapsack(i+1,Kplvalue,KpWeight);
					//回溯,恢复到之前的状态
					KpWeight-=feasible[i]*weight[i];
					Kplvalue-=feasible[i]*value[i];
					
				}
			
			}
		}
		
	}

	
	
	
	
	public static void main(String[] args)
	{
		new KnapsackProblem().Knapsack(1,0,0);
	}
}
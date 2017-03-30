public class HamiltonCircuitProblem
{
	
	/**
	哈密顿回路问题
	@param arc[][] 存放顶点间的关系
	@param visited[] 标志数组，用来标记该顶点是否有被访问过，访问过为1，未访问过为0
	@param x[] 顶点数组，存放顶点的编号。
	@param k 该变量用来表示当前的位置，当k=n-1时，求解结束
	@param n 表示顶点的个数
	*/

	private void Hamilton(int n,int arc[][])
	{
			int x[]=new int[n]; 
			int k,i;
			int visited[]=new int[n]; //创建个数为n的标志数组
			//初始化顶点数组和标志数组
			for (i=0; i<n; i++) {
			 	x[i]=0;
			 	visited[i]=0;
			}
	
			visited[0]=1; //从顶点出发
			k=1;
			x[0]=0;
			while(k>=1)
			{
				x[k]+=1;  //搜索下一个结点
				while(x[k]<n)
				{
				if(visited[x[k]]==0&&arc[x[k-1]][x[k]]==1)//如果当前结点没有被访问过，且与前一个结点相连，则满足条件
					{
						break;
					}else
					{
						x[k]+=1;
					}
				}
				if(x[k]<n&&k==n-1&&arc[x[k]][0]==1)
				{
					for( int m=0;m<n;m++)
					{
						System.out.print(x[m]+1+" ");  //输出顶点的编号，编号从1开始
					}
					return ;
					
				}
				
				if(x[k]<n&&k<n-1)  
				{
					visited[x[k]]=1;
					k+=1;     //继续访问下一个结点
				}
				else    //回溯
				{
					x[k]=0;
					k-=1;
					visited[x[k]]=0;
				}
			}
	}
	
	public static void main(String[] args)
	{
			//arc为存储顶点间的关系
	int arc[][]=new int[][]{{0,1,0,1,0},{1,0,1,0,1},{0,1,0,1,1},{1,0,1,0,1},{0,1,1,1,0}};
		new HamiltonCircuitProblem().Hamilton(5,arc);
	}

}
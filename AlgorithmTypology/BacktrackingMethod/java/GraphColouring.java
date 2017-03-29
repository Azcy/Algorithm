public class GraphColouring
{
	/**
	图着色
	@param m 颜色数量
	@param n 无向图的顶点数
	@param color[] 用来存放每个顶点的颜色
	*/
	public void GraphColour(int m,int n)
	{
		int color[]=new int[n];
		int i,k;
		for(i=0;i<n;i++)  //将数组color[n]初始化为0
		{
			color[i]=0;
		}
		
		k=0;
		while(k>=0)
		{
			color[k]=color[k]+1;   //取下一种颜色
			while(color[k]<=m)
			{
				if(OK(k,color)==1)             //如果符合要求则赋值
					break;
				else
					color[k]=color[k]+1;   //取下一种颜色
			}
			
			if(color[k]<=m&&k==n-1) //如果图着色完成，输出
			{
				for(i=0;i<n;i++)
				{
					System.out.print(color[i]+" ");
				
				}	return;
			}
			
			if(color[k]<=m&&k<n-1)  
			{
				k++;  //处理下一个点；
			}else  //前面的颜色已经用完了，当前颜色不符合。
			{
				color[k]=0;  //令当前颜色为0，k回退上一个位置，从color[k]+1开始、
				k--;//回溯
			}
		}
		
	}
	//用来表示顶点之间的连接
	int arc[][]=new int[][]{{0,1,1,0,0},{1,0,1,0,1},{1,1,0,0,1},{0,1,0,0,1},{0,1,1,1,0}};
	//判断顶点k的着色是否发生冲突
	public int OK(int k,int color[])
	{
		for(int i=0;i<k;i++)
		{
			if(arc[k][i]==1&&color[i]==color[k])
			return 0;
		}
		return 1;
	}
		
	public static void main(String[] args)
	{
		new GraphColouring().GraphColour(3,5);
	}
}
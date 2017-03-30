public class HamiltonCircuitProblem
{
	
	/**
	���ܶٻ�·����
	@param arc[][] ��Ŷ����Ĺ�ϵ
	@param visited[] ��־���飬������Ǹö����Ƿ��б����ʹ������ʹ�Ϊ1��δ���ʹ�Ϊ0
	@param x[] �������飬��Ŷ���ı�š�
	@param k �ñ���������ʾ��ǰ��λ�ã���k=n-1ʱ��������
	@param n ��ʾ����ĸ���
	*/

	private void Hamilton(int n,int arc[][])
	{
			int x[]=new int[n]; 
			int k,i;
			int visited[]=new int[n]; //��������Ϊn�ı�־����
			//��ʼ����������ͱ�־����
			for (i=0; i<n; i++) {
			 	x[i]=0;
			 	visited[i]=0;
			}
	
			visited[0]=1; //�Ӷ������
			k=1;
			x[0]=0;
			while(k>=1)
			{
				x[k]+=1;  //������һ�����
				while(x[k]<n)
				{
				if(visited[x[k]]==0&&arc[x[k-1]][x[k]]==1)//�����ǰ���û�б����ʹ�������ǰһ���������������������
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
						System.out.print(x[m]+1+" ");  //�������ı�ţ���Ŵ�1��ʼ
					}
					return ;
					
				}
				
				if(x[k]<n&&k<n-1)  
				{
					visited[x[k]]=1;
					k+=1;     //����������һ�����
				}
				else    //����
				{
					x[k]=0;
					k-=1;
					visited[x[k]]=0;
				}
			}
	}
	
	public static void main(String[] args)
	{
			//arcΪ�洢�����Ĺ�ϵ
	int arc[][]=new int[][]{{0,1,0,1,0},{1,0,1,0,1},{0,1,0,1,1},{1,0,1,0,1},{0,1,1,1,0}};
		new HamiltonCircuitProblem().Hamilton(5,arc);
	}

}
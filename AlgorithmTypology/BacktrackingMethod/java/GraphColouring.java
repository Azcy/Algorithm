public class GraphColouring
{
	/**
	ͼ��ɫ
	@param m ��ɫ����
	@param n ����ͼ�Ķ�����
	@param color[] �������ÿ���������ɫ
	*/
	public void GraphColour(int m,int n)
	{
		int color[]=new int[n];
		int i,k;
		for(i=0;i<n;i++)  //������color[n]��ʼ��Ϊ0
		{
			color[i]=0;
		}
		
		k=0;
		while(k>=0)
		{
			color[k]=color[k]+1;   //ȡ��һ����ɫ
			while(color[k]<=m)
			{
				if(OK(k,color)==1)             //�������Ҫ����ֵ
					break;
				else
					color[k]=color[k]+1;   //ȡ��һ����ɫ
			}
			
			if(color[k]<=m&&k==n-1) //���ͼ��ɫ��ɣ����
			{
				for(i=0;i<n;i++)
				{
					System.out.print(color[i]+" ");
				
				}	return;
			}
			
			if(color[k]<=m&&k<n-1)  
			{
				k++;  //������һ���㣻
			}else  //ǰ�����ɫ�Ѿ������ˣ���ǰ��ɫ�����ϡ�
			{
				color[k]=0;  //�ǰ��ɫΪ0��k������һ��λ�ã���color[k]+1��ʼ��
				k--;//����
			}
		}
		
	}
	//������ʾ����֮�������
	int arc[][]=new int[][]{{0,1,1,0,0},{1,0,1,0,1},{1,1,0,0,1},{0,1,0,0,1},{0,1,1,1,0}};
	//�ж϶���k����ɫ�Ƿ�����ͻ
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
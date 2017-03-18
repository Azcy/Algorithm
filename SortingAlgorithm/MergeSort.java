public class MergeSort
{
	
	/**
		�ϲ�����������
		ͨ�����������еģ����һ��������r[i]�Ŀ�ʼ��s��
		���ڶ���������[j]�Ŀ�ʼ��m+1�����бȽϣ����r[i]<r[j]����r[i]�浽��ʱ�洢����r1�С�
		����ִ�У������������������������һ����ʣ�࣬����Ϊ�����ж�������ģ������Կ���������ӵ�
		r1�����ʱ�ݴ������С�
		@param r Ϊ��������
		@param r1 Ϊ��ʱ���飬������źϲ������������
		@param i Ϊr�����һ�����������е���ʼλ��
		@param j Ϊr����ڶ������������е���ʼλ��
		@param k Ϊ���ƶ��±꣬�����r1��ֵ��
	*/
	public void merge(int r[],int r1[],int s,int m,int t)
	{
		int i=s,j=m+1,k=s;
		while(i<=m&&j<=t)
		{
			if(r[i]<=r[j])
			{
				r1[k++]=r[i++];
			}else
			{
				r1[k++]=r[j++];
			}
		}
		//���������������������������ʣ�࣬��ֻ��Ҫ��ʣ�ಿ�����θ�ֵ��r1��
		while(i<=m)
		{
			r1[k++]=r[i++];
		}
		while(j<=t)
		{
			r1[k++]=r[j++];
		}
	}
	public void mergesort(int r[],int s,int t)
	{
		int m;
		int r1[]=new int[1000];
		if(s==t)
			return;
		m=(s+t)/2;
		mergesort(r,s,m); //�鲢�����һ��������
		mergesort(r,m+1,t);//�鲢�������һ��������
		merge(r,r1,s,m,t);//�ϲ�����
		for(int i=s;i<=t;i++)
		{
			r[i]=r1[i];
		}
	}
	public static void main(String []args)
	{
		int r[]=new int []{5,3,2,4,9,8,6,7,1,0,};
		new MegeSort2().mergesort(r,0,r.length-1);
		for(int num:r)
		{
			System.out.println(num);
		}
	}
	
}
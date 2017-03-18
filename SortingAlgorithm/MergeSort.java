public class MergeSort
{
	
	/**
		合并有序子序列
		通过两个子序列的，如第一个子序列r[i]的开始（s）
		跟第二个子序列[j]的开始（m+1）进行比较，如果r[i]<r[j]，则将r[i]存到临时存储数组r1中。
		依次执行，如果有两个子序列中其中有一个有剩余，（因为子序列都是有序的），所以可以依次添加到
		r1这个临时暂存数组中。
		@param r 为输入数组
		@param r1 为临时数组，用来存放合并后的有序序列
		@param i 为r数组第一个有序子序列的起始位置
		@param j 为r数组第二个有序子序列的起始位置
		@param k 为了移动下标，方便给r1赋值。
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
		//另外两种情况是两个子序列中有剩余，则只需要把剩余部分依次赋值到r1中
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
		mergesort(r,s,m); //归并排序第一个子序列
		mergesort(r,m+1,t);//归并排序后面一个子序列
		merge(r,r1,s,m,t);//合并操作
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
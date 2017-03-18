/**
	堆排序
	基本思想：首先将待排序的记录构造成一个堆，此时，堆顶记录是堆中所以记录的最大者
	将它从堆中移走（通常将堆顶记录和堆中最后一个记录交换），然后再将剩余的记录再调整成堆
	这样又找出了次大记录，依次类推，知道堆中只出现一个记录为止。
	时间性能：O(log2n)
*/
public class HeapSort
{
	/**
		筛选根节点
	*/
	public static void SiftHeap(int r[],int k,int n)
	{
		int i,j,temp;
		//置i为要筛的结点
		i=k;
		//j为i的左孩子  	
		j=2*i+1;
		while(j<n)
		{
			//比较i的左右孩子，j为较大者
			if(j<n-1&&r[j]<r[j+1])
			{
				j++;
			}
			//根节点已经大于左右孩子中的较大者
			if(r[i]>r[j])
			{
				break;
			}else
			{
				//将被筛结点与结点j交换
				temp=r[i];
				r[i]=r[j];
				r[j]=temp;
				i=j;
				//被筛选结点位于原来结点的j的位置
				j=2*i+1; 
			}
		}
	}
	
	public static void HeapSort(int r[],int n)
	{
		int i,temp;
		//初始建堆，最后一个分支的下标是（n-1）/2
		for(i=(n-1)/2;i>=0;i--)
		{
			SiftHeap(r,i,n);
		}
		//重复执行移走堆顶及重建堆得
		for(i=1;i<=n-1;i++)
		{
			temp=r[0];
			r[0]=r[n-i];
			r[n-i]=temp;
			//只需调整根节点
			SiftHeap(r,0,n-i);
		}
	}
	   public static void main(String[] args) {
        int[] data = new int[] { 1,8,6,4,9,7,2,5,3,0 };
        HeapSort(data,data.length);
       for(int a: data)
       {
       	System.out.println(a);
       }
    }
}
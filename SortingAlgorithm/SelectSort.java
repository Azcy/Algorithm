/**
*选择排序
*原理：第一趟排序，从第一个数字开始遍历到数组最后，找到最小的跟第一个位置的数字进行交换
*			 第二趟排序，从第二个数字开始遍历到数组最后，找到最小的跟第二个位置的数字进行交换
*			 依次类推到只剩下一个数字。
*/
public class SelectSort
{
	public static void main(String[] args)
	{
		int arr[]=new int[]{1,8,6,7,3,15,80};
		selectsort(arr);
		for(int number:arr)
		{
			System.out.println(number);
		}
	}
	public static void selectsort(int arr[])
	{
		//int i,j,index,temp;
		int index;
		for(int i=0;i<arr.length-1;i++)
		{
			index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[index]>arr[j])
				{
					 index=j;
				}
			}
			if(index!=i)
			{
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
			
		}
	}
	
}
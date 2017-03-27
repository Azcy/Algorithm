/**
需求：折半查找

思路：先定义三个变量，分别是low,mid,height，分别表示开始位置，中间位置，末尾位置，拿需要查找的数字跟mid对应的值进行比较，
如果大于则让low=mid+1,否则height=mid-1；依次进行下次，直到找到为止

步骤：
1.对待查找的序列进行排序
2.让low为数组的第一个数字，height为数组的末尾位置, mid=(low+height)/2
3.拿查找的数字跟mid对应的数字进行比较，
4.如果数字大于mid的数字，则让low=mid+1，否则height=mid-1;
5.直到找到位置，返回mid值。

*/
import java.util.Arrays;
public class BinarySearch
{
	public static void main(String [] args)
	{
		int arr[]=new int[]{1,25,26,80,111,151,200,215,216,300};
		Arrays.sort(arr);
		System.out.println(Binary(arr,111));
	}
	
	private static int Binary(int arr[],int num)
	{
		int low=0;
		int height=arr.length-1;
		int mid;
		while(low<=height)
		{
			mid=(height+low)/2;
			if(num>arr[mid])//需查找的值跟中间值比较
			{
				low=mid+1;
			}
			else if(num<arr[mid])
			{
				height=mid-1;
			}
			else
			return ++mid;
		}
		return 0;
	}
	
}
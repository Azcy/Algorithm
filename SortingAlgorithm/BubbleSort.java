/**
*冒泡排序
*@anthor Zcy
*思路：对数组，从第一个遍历到最后，找到最大的，跟最后一个进行交换
*第二遍从，第一个遍历到倒数第二个，找到最大的，跟倒数第二个进行交换
*依次类推，直到只有一个数字没有得交换的时候结束
*@version Java1.80
*@Time 2017-3-6-18:11
*/
public class BubbleSort
{
	public static void main(String[] args)
	{
		int arr[]=new int[]{1,8,6,7,2,15,80,60};
		new BubbleSort().bubblesort(arr);//如果bubblesort方法为非静态的时候，需要创建个对象来调用，如果bubblesort为静态方法（类方法）的时候可以直接类名.方法名，如果在当前类，则可以省略掉类名.
		for(int number:arr)
		{
			System.out.println(number);
		}
	}
	/**
	*下沉冒泡法
	  
	*对数组，从第一个遍历到最后，找到最大的，跟最后一个进行交换
	*第二遍从，第一个遍历到倒数第二个，找到最大的，跟倒数第二个进行交换
	*依次类推，直到只有一个数字没有得交换的时候结束
	*/
	public void bubblesort(int arr[])
	{
	
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length-i-1;j++)
			{
				//将大的跟往后面的进行交换
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	/**
	*上升冒泡法
	*@param 对数组，从第一个遍历到最后，找到最小的，跟最前面一个进行交换
	*第二遍从，从第二个遍历到最后，找到最小的，跟第二个进行交换
	*依次类推，直到只有一个数字没有得交换的时候结束
	*/
	public static void bubblesort2(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=arr.length-1;j>0;j--)
			{
				//将小的跟前面进行交换
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
}



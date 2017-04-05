# 1、交换排序------冒泡排序（Bubble Sort）
### 时间复杂度：O(n2)
### 稳定性：稳定
### 基本思想：
在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。即：两两比较相邻记录，如果反序则交换，直到没有反序的记录为止。

### 冒泡排序的示例：
![](http://i.imgur.com/33Li5I4.jpg)
### 算法的实现
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
			for(int j=0;j<arr.length-i-1;j++)
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
[具体代码](https://github.com/Azcy/Algorithm/blob/master/SortingAlgorithm/BubbleSort.java)
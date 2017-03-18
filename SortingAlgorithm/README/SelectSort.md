# 5、选择排序-----简单选择排序（Simple Selection Sort）
### 时间复杂度：O(n2)
### 稳定性：稳定
### 基本思想：
在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，依次类推，直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
### 简单选择排序的示例：
![](http://i.imgur.com/54tTdyH.jpg)
### 算法实现：
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
[具体代码](https://github.com/Azcy/Algorithm/blob/master/SortingAlgorithm/SelectSort.java)
# 2、交换排序------快速排序
### 时间复杂度：O(n*log2n)
### 稳定性：不稳定
### 基本思想：
1、选择轴值，通常选择第一个元素作为轴值。

2、以轴值为基准将整个序列划分成两个部分，并且前面部分的值小于或等于轴值，后面部分大于或等于轴值。

3、然后分别对两部分记录同意的方法继续进行排序，直到整个序列有序。
### 时间性能：
O(nlog2n)
### 快速排序的示例：
(a)一趟排序的过程
![](http://i.imgur.com/Gf1yG2l.jpg)

(b)排序的全过程
![](http://i.imgur.com/sRkVvWJ.jpg)

### 算法的实现：
	public static int Partition(int arr[],int first,int end)
	{
	//i，j分别存取arr数组的头和尾
	int i=first,j=end;
	
	while(i<j){
			while(i<j&&arr[i]<arr[j])
			{
				j--;
				}
				//从后面往前扫描，如果小于轴指则 ，且i<j，则交换
				if(i<j)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;//切换到从i开始往后扫描
				}
			while(i<j&&arr[i]<arr[j])
			{
				i++;
			}
			//如果arr[i]>arr[j]
			if(i<j)
			{
				int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j--;//切换到从j开始往前扫描
				}
		}
		return i;
	}
	
	public static void quicksort(int arr[],int first,int end)
	{
		int pivot=0;//定义一个变量来存取轴值
		if(first<end)
		{
			pivot=Partition(arr,first,end); //取得第一个轴值得位置
			quicksort(arr,first,pivot-1);//划分对左侧进行快排
			quicksort(arr,pivot+1,end);//对右侧进行快排
		}			
 	 }
	
[具体代码](https://github.com/Azcy/Algorithm/blob/master/SortingAlgorithm/QuickSort1.java)
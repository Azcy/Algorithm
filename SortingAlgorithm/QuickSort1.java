public class QuickSort1{
	public static void main(String[] args)
	{
		//新建一个数组
		int arr[]=new int[]{8,9,5,2,15,60,20,40};
		quicksort(arr,0,arr.length-1);
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}

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
	}
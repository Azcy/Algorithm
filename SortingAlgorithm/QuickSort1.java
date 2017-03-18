public class QuickSort1{
	public static void main(String[] args)
	{
		//�½�һ������
		int arr[]=new int[]{8,9,5,2,15,60,20,40};
		quicksort(arr,0,arr.length-1);
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}

public static int Partition(int arr[],int first,int end)
{
	//i��j�ֱ��ȡarr�����ͷ��β
	int i=first,j=end;
	
	while(i<j){
			while(i<j&&arr[i]<arr[j])
			{
				j--;
				}
				//�Ӻ�����ǰɨ�裬���С����ָ�� ����i<j���򽻻�
				if(i<j)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					i++;//�л�����i��ʼ����ɨ��
				}
			while(i<j&&arr[i]<arr[j])
			{
				i++;
			}
			//���arr[i]>arr[j]
			if(i<j)
			{
				int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j--;//�л�����j��ʼ��ǰɨ��
				}
		}
		return i;
	}
	
	public static void quicksort(int arr[],int first,int end)
	{
		int pivot=0;//����һ����������ȡ��ֵ
		if(first<end)
		{
			pivot=Partition(arr,first,end); //ȡ�õ�һ����ֵ��λ��
			quicksort(arr,first,pivot-1);//���ֶ������п���
			quicksort(arr,pivot+1,end);//���Ҳ���п���
		}			
  }
	}
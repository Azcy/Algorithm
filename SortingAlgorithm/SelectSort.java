/**
*ѡ������
*ԭ����һ�����򣬴ӵ�һ�����ֿ�ʼ��������������ҵ���С�ĸ���һ��λ�õ����ֽ��н���
*			 �ڶ������򣬴ӵڶ������ֿ�ʼ��������������ҵ���С�ĸ��ڶ���λ�õ����ֽ��н���
*			 �������Ƶ�ֻʣ��һ�����֡�
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
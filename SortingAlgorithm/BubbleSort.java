/**
*ð������
*@anthor Zcy
*˼·�������飬�ӵ�һ������������ҵ����ģ������һ�����н���
*�ڶ���ӣ���һ�������������ڶ������ҵ����ģ��������ڶ������н���
*�������ƣ�ֱ��ֻ��һ������û�еý�����ʱ�����
*@version Java1.80
*@Time 2017-3-6-18:11
*/
public class BubbleSort
{
	public static void main(String[] args)
	{
		int arr[]=new int[]{1,8,6,7,2,15,80,60};
		new BubbleSort().bubblesort(arr);//���bubblesort����Ϊ�Ǿ�̬��ʱ����Ҫ���������������ã����bubblesortΪ��̬�������෽������ʱ�����ֱ������.������������ڵ�ǰ�࣬�����ʡ�Ե�����.
		for(int number:arr)
		{
			System.out.println(number);
		}
	}
	/**
	*�³�ð�ݷ�
	  
	*�����飬�ӵ�һ������������ҵ����ģ������һ�����н���
	*�ڶ���ӣ���һ�������������ڶ������ҵ����ģ��������ڶ������н���
	*�������ƣ�ֱ��ֻ��һ������û�еý�����ʱ�����
	*/
	public void bubblesort(int arr[])
	{
	
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=1;j<arr.length-i-1;j++)
			{
				//����ĸ�������Ľ��н���
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
	*����ð�ݷ�
	*@param �����飬�ӵ�һ������������ҵ���С�ģ�����ǰ��һ�����н���
	*�ڶ���ӣ��ӵڶ�������������ҵ���С�ģ����ڶ������н���
	*�������ƣ�ֱ��ֻ��һ������û�еý�����ʱ�����
	*/
	public static void bubblesort2(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=arr.length-1;j>0;j--)
			{
				//��С�ĸ�ǰ����н���
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



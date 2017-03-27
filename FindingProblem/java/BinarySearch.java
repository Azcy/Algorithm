/**
�����۰����

˼·���ȶ��������������ֱ���low,mid,height���ֱ��ʾ��ʼλ�ã��м�λ�ã�ĩβλ�ã�����Ҫ���ҵ����ָ�mid��Ӧ��ֵ���бȽϣ�
�����������low=mid+1,����height=mid-1�����ν����´Σ�ֱ���ҵ�Ϊֹ

���裺
1.�Դ����ҵ����н�������
2.��lowΪ����ĵ�һ�����֣�heightΪ�����ĩβλ��, mid=(low+height)/2
3.�ò��ҵ����ָ�mid��Ӧ�����ֽ��бȽϣ�
4.������ִ���mid�����֣�����low=mid+1������height=mid-1;
5.ֱ���ҵ�λ�ã�����midֵ��

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
			if(num>arr[mid])//����ҵ�ֵ���м�ֵ�Ƚ�
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
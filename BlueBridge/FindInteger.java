import java.util.Scanner;


public class FindInteger {

	/**
	 * ��������
	 */
	/**
	 ��������
	����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����

	�����ʽ
	��һ�а���һ������n��

	�ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��

	�����а���һ������a��Ϊ�����ҵ�����

	�����ʽ
	���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1��
	��������
	6
	1 9 4 8 3 9
	9
	�������
	2
	���ݹ�ģ��Լ��
	1 <= n <= 1000��
	 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			num[i]=in.nextInt();
		}
		int number=in.nextInt();
		System.out.println(findnumber(num,number));
	}
	public static int findnumber(int num[],int number)
	{
		
		int index=0;
		for(int i=0;i<num.length;i++)
		{
			if(number==num[i])
			{
				 index=i+1;
				 break;
			}else
				index=-1;
		}
		return index;
	}

}

/**
	��������  
��������
��������һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
�����ʽ
������һ��Ϊһ������n��
�����ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
�����ʽ
�������һ�У�����С�����˳��������������С�
��������
5
8 3 6 4 9
�������
3 4 6 8 9
*/


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int n=0;
		int a[] = null;
		int b;
		int t=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		a=new int [n];
		for(int i=0;i<n;i++)
		{
			b=in.nextInt();
				a[i]=b;
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				if(a[i]<a[j])
				{
					t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

/**
��������
ʱ�����ƣ�3000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�3
����
��n*n����������1,2,...,n*n,Ҫ��������Ρ�����n=4ʱ����Ϊ��
10 11 12 1
9  16 13 2
8  15 14 3
7  6  5  4
����
ֱ�����뷽�µ�ά������n��ֵ��(n<=100)
���
�����������η��¡�
��������
3
�������
7 8 1
6 9 2
5 4 3
��Դ
�㷨����
�ϴ���
��ϯִ�й�

*/
/**
˼·�����ұ����ε������±ߣ���ߣ��ϱߡ�ѭ����n-1��/2��
*/
import java.util.Scanner;
public class SerpentineFillNumber
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=1;
		int arr[][]=new int [n][n];
		int a,b;
		for(a=0;a<=(n-1)/2;a++)
		{
			//���ұߵ���
			for(b=a;b<=n-a-1;b++)
			{
				arr[b][n-a-1]=sum++;
			}
			//�ײ�����
			for(b=n-a-2;b>=a;b--)
			{
				arr[n-a-1][b]=sum++;
			}
			//����ߵ���
			for(b=n-a-2;b>=a;b--)
			{
				arr[b][a]=sum++;
			}
			//���ϱߵ���
			for(b=a+1;b<=n-a-2;b++)
			{
				arr[a][b]=sum++;
			}
		} 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(sum/10>1)
				{
					System.out.print(arr[i][j]+" ");
				}else
					System.out.print(arr[i][j]+"   ");
				
			}
			System.out.println();
		}
	}
}
import java.util.Scanner;
public class CleverKk
{
	/**
	@param n ����
	@param m ����
	@param a[][] �û��������������飬a[0][0~m]Ϊ0��a[0~n][n]Ϊ0
	@param maxAdd[][] �������飬�����洢��̬�滮ÿһ���ľ��߽��
	*/
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//���� 
		int n=in.nextInt();
		//����
		int m=in.nextInt();
		//����һ�����飬��������ֵ
		int a[][]=new int[n+1][m+1];
		//����һ���������飬�����洢��̬�滮ÿһ���ľ��߽��
		int maxAdd[][]=new int [n+1][m+1];
		//����һ��·������
		//int path[][]=new int[n+1][m+1];
		//����
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				a[i][j]=in.nextInt();
				maxAdd[i][j]=a[i][j];
			}
		}
		//��������
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				//maxAdd[i][j]=Math.max(maxAdd[i-1][j],maxAdd[i][j-1])+a[i][j];
				if(maxAdd[i-1][j]>maxAdd[i][j-1])
				{
					maxAdd[i][j]=maxAdd[i-1][j]+a[i][j];
					//path[i][j]=j;
				}else
				{
					maxAdd[i][j]=maxAdd[i][j-1]+a[i][j];
				//	path[i][j]=j-1;
				}
			}
		}
		//��������ֵ�ͣ������յľ��߽��
		System.out.println(maxAdd[n][m]);
	
		
	}
}
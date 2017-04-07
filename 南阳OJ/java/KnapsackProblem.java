import java.util.Scanner;
public class KnapsackProblem
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//����ƻ����Ŀ��
		int Acount=in.nextInt();
		//���뱳��������
		int Bweight=in.nextInt();
		//�������ƻ������������
		int Aw[]=new int[Acount+1];
		//����ƻ����ֵ������
		int Av[]=new int[Acount+1];
		//����һ����������dp
		int dp[][]=new int [Acount+1][Bweight+1];
		
		//����ƻ���������ͼ�ֵ
		for(int i=1;i<=Acount;i++)
		{
			Aw[i]=in.nextInt();
			Av[i]=in.nextInt();
		}
		
		//ƻ������
		for(int i=1;i<=Acount;i++)
		{
			//����������
			for(int j=1;j<=Bweight;j++)
			{
				if(j>=Aw[i])
				{
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-Aw[i]]+Av[i]);
				}else
				{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		for(int i=0;i<=Acount;i++)
		{
			//����������
			for(int j=0;j<=Bweight;j++)
			{
				System.out.print(dp[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("���"+dp[Acount][Bweight]);
		
	}
}
import java.util.Scanner;
/**
�������
��������
����������ֳ�Pascal�����Σ����ĵ�i+1����(a+b)i��չ��ʽ��ϵ����

����
����һ����Ҫ�����ǣ��������е�ÿ�����ֵ����������ϵ�������ӡ�

����
�����������������ε�ǰ4�У�

����
   1

����
  1 1

����
 1 2 1

����
1 3 3 1

����
����n���������ǰn�С�

�����ʽ
�������һ����n��

�����ʽ
�����������ε�ǰn�С�ÿһ�д���һ�еĵ�һ������ʼ����������м�ʹ��һ���ո�ָ����벻Ҫ��ǰ���������Ŀո�
��������
4
�������
1
1 1
1 2 1
1 3 3 1
���ݹ�ģ��Լ��
1 <= n <= 34��

*/

public class Main {
		public static void main(String []args)
		{
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			getYhTriangle(n);
		}
		public static void getYhTriangle(int n)
		{
			int num[][]=new int[n][n];
			
		
			for(int i=0;i<n;i++)
			{	
				if(i!=0)
				{
					num[i][0]=1;
					System.out.print(num[i][0]+" ");
				}
				for(int j=1;j<i;j++)
				{	
					num[i][j]=num[i-1][j-1]+num[i-1][j];
					System.out.print(num[i][j]+" ");
				}
				num[i][i]=1;
				System.out.print(num[i][i]+"\n");
			}
			
			
		}
		
}
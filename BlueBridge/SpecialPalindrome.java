import java.util.Scanner;

/**
���������
��������
����123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��
�����ʽ
��������һ�У�����һ��������n��
�����ʽ
��������С�����˳���������������������ÿ������ռһ�С�
��������
52
�������
899998
989989
998899
���ݹ�ģ��Լ��
����1<=n<=54��
*/
public class Main {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		get5(n);
		get6(n);
	}
	static void get5(int number)
	{
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int k=0;k<10;k++)
				{
					for(int m=0;m<10;m++)
					{
						for(int l=0;l<10;l++)
						{
							if(i==l&&j==m)
							{
								if((i+k+j+m+l)==number)
								System.out.println(i*10000+j*1000+k*100+m*10+l);
							
							}
						}
					}
				}
			}
		}
	}
	static void get6(int number)
	{
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int k=0;k<10;k++)
				{
					for(int m=0;m<10;m++)
					{
						for(int l=0;l<10;l++)
						{
							for(int n=0;n<10;n++)
							{
								if(i==n&&j==l&&k==m)
							{	
									if((i+k+j+m+l+n)==number)
										System.out.println(i*100000+j*10000+k*1000+m*100+l*10+n);
							
							}
							
							}
						}
					}
				}
			}
		}
	}
}
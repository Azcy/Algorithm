/**
	������ 
��������
����1221��һ���ǳ����������������߶��ʹ��ұ߶���һ���ģ������������������λʮ��������
�����ʽ
��������С�����˳�����������������λʮ��������
*/
public class PalindromeNumber {
	public static void main(String []args)
	{
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int k=0;k<10;k++)
				{
					for(int m=0;m<10;m++)
					{
						if(i==m&&j==k)
						{
							System.out.println(i*1000+j*100+k*10+m);
							
						}
					}
				}
			}
		}
	}
}

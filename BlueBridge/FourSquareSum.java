import java.util.Scanner;
/**
��ƽ���Ͷ����ֳ�Ϊ�������ն���
@author zcy
*/
/**
��Ŀ��
ÿ�������������Ա�ʾΪ����4����������ƽ���͡�
�����0������ȥ�������ÿ��Ա�ʾΪ4������ƽ���͡�

���磺
5 = 0^2 + 0^2 + 1^2 + 2^2
7 = 1^2 + 1^2 + 1^2 + 2^2
��^���ű�ʾ�˷�����˼��

����һ�������������������ܴ��ڶ���ƽ���͵ı�ʾ����
Ҫ�����4��������
0 <= a <= b <= c <= d
�������еĿ��ܱ�ʾ���� a,b,c,d Ϊ���������������У���������һ����ʾ��


��������Ϊһ��������N (N<5000000)
Ҫ�����4���Ǹ�����������С���������м��ÿո�ֿ�

���磬���룺
5
�����Ӧ�������
0 0 1 2

�����磬���룺
12
�����Ӧ�������
0 2 2 2

�����磬���룺
773535
�����Ӧ�������
1 1 267 838

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 3000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
*/
public class FourSquareSum
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		int number=in.nextInt();
	long startTime=System.currentTimeMillis();   //��ȡ��ʼʱ��
	
	double length1=Math.sqrt(number);
	boolean flag=false;
	for(int a=0;a<length1&&!flag;a++)
	{
		for(int b=a;b<length1&&!flag;b++)
		{
			for(int c=b;c<length1&&!flag;c++)
			{
					double d=Math.sqrt(number-a*a-b*b-c*c); //ͨ������ó�d����һ��forѭ��������������ʱ��
					if(number==a*a+b*b+c*c+d*d)
					{
						if(d==(int)d) //ͨ��double d��d��int���ͽ��бȽ��Ƿ��Ǳ���
						{
							System.out.println(a+" "+b+" "+c+" "+(int)d);
							flag=true;
						}
					}
			}
		}
	}
	long endTime=System.currentTimeMillis(); //��ȡ����ʱ��
	System.out.println("��������ʱ�䣺 "+(endTime-startTime)+"ms");//��ȡ����ʱ��=��ʼʱ��-����ʱ��
	
}
}
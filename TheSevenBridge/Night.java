/**
��ƽ����

��ƽ���Ͷ����ֳ�Ϊ�������ն���
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
*/

import java.util.Scanner;
import java.lang.Math;
public class Night
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		boolean flag=false;
		for(int a=0;a<=Math.sqrt(num)&&!flag;a++)
		{
			for(int b=a;b<=Math.sqrt(num)&&!flag;b++)
			{
				for(int c=b;c<=Math.sqrt(num)&&!flag;c++)
				{
					double d=Math.sqrt(num-(a*a+b*b+c*c));
					
					if((num==(a*a+b*b+c*c+d*d)))
					{
							if(d==(int)d)
							{
							System.out.print(a+" "+b+" "+c+" "+(int)d);
							
							flag=true;
							}
					}
				}
			}
		}
	}
}
/**
	�ַ����Ա�
��������
���������������ɴ�д��ĸ��Сд��ĸ��ɵ��ַ���(���Ƚ���1��10֮��)������֮��Ĺ�ϵ������4�����֮һ��
����1�������ַ������Ȳ��ȡ����� Beijing �� Hebei
����2�������ַ�������������ȣ�������Ӧλ���ϵ��ַ���ȫһ��(���ִ�Сд)������ Beijing �� Beijing
����3�������ַ���������ȣ���Ӧλ���ϵ��ַ����ڲ����ִ�Сд��ǰ���²��ܴﵽ��ȫһ�£�Ҳ����˵���������������2�������� beijing �� BEIjing
����4�������ַ���������ȣ����Ǽ�ʹ�ǲ����ִ�СдҲ����ʹ�������ַ���һ�¡����� Beijing �� Nanjing
��������ж�����������ַ���֮��Ĺ�ϵ�����������е���һ�࣬������������ı�š�
�����ʽ
�����������У�ÿ�ж���һ���ַ���
�����ʽ
��������һ�����֣������������ַ����Ĺ�ϵ���
��������
BEIjing
beiJing 
�������
3
*/

import java.util.Scanner;


public class Main {
	public static void main(String []args)
	{
		String str1=null,str2=null;
		Scanner in=new Scanner(System.in);
		str1=in.nextLine();
		str2=in.nextLine();
		Contrast(str1,str2);
	}
	public static void Contrast(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			System.out.println(1);
		}
		else if(str1.length()==str2.length())
		{
			if(str1.equals(str2))
			{
				System.out.println(2);
			}
			else if(str1.toUpperCase().equals(str2.toUpperCase()))
			{
				System.out.println(3);
			}else
			{
				System.out.println(4);
			}
		}
	}

}
/**
	ʱ��ת��
��������
��������һ������Ϊ��λ��ʱ��t��Ҫ���á�<H>:<M>:<S>���ĸ�ʽ����ʾ���ʱ�䡣<H>��ʾʱ�䣬<M>��ʾ���ӣ���<S>��ʾ�룬���Ƕ���������û��ǰ���ġ�0�������磬��t=0����Ӧ����ǡ�0:0:0������t=3661���������1:1:1����
�����ʽ
��������ֻ��һ�У���һ������t��0<=t<=86399����
�����ʽ
�������ֻ��һ�У����ԡ�<H>:<M>:<S>���ĸ�ʽ����ʾ��ʱ�䣬���������š�
��������
0
�������
0:0:0
��������
5436
�������
1:30:36
*/

import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		change(t);
	}
	public static void change(int t)
	{
		int Hour=0;
		int Minute=0;
		int Second=0;
		Hour=t/3600;
		Minute=(t-Hour*3600)/60;
		Second=t-3600*Hour-60*Minute;
		System.out.println(Hour+":"+Minute+":"+Second);
	}

}

/**
	�ֽ�������
��������
�����������[a,b]�������������������ֽ⡣
�����ʽ
����������������a��b��
�����ʽ
����ÿ�����һ�����ķֽ⣬����k=a1*a2*a3...(a1<=a2<=a3...��kҲ�Ǵ�С�����)(����ɿ�����)
��������
3 10
�������
3=3
4=2*2
5=5
6=2*3
7=7
8=2*2*2
9=3*3
10=2*5
��ʾ
������ɸ������������Ȼ���ٷֽ⡣
���ݹ�ģ��Լ��
����2<=a<=b<=10000
*/

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> v = new ArrayList<Integer>();
		Scanner in=new Scanner(System.in);
		int min=in.nextInt();
		int max=in.nextInt();
		//������
		for(int i=2;i<=max;++i)
		{
			if(Isprame(i))
			{
				v.add(i);
			}
		}
		
		for(int i=min;i<=max;i++)
		{
			if(Isprame(i))
			{
				System.out.print(i+"="+i);
			}
			else
			{
				System.out.print(i+"=");
				int temp=i; //��cun i
				int index=0; //�洢�����±��������
				while(temp!=1)  //��ǰ����û�б�����
				{
					if(temp%v.get(index)==0)//�ӵ�һ��������ʼ��
					{
						System.out.print(v.get(index));
						temp/=v.get(index);
						index=0;//��ԭ �������ӵ�һ������2��ʼ����
						if(temp!=1)
						{
							System.out.print("*");//����*�����
						}
					}
					else{//���������Ļ�������һ������
						index++;
					}
				}
			}
			System.out.println();
		}
	}
	public static boolean Isprame(int num)
	{
		double k=Math.sqrt(num);
		for(int i=2;i<=k;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}

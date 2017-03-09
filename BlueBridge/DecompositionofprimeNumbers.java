/**
	分解质因数
问题描述
　　求出区间[a,b]中所有整数的质因数分解。
输入格式
　　输入两个整数a，b。
输出格式
　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
样例输入
3 10
样例输出
3=3
4=2*2
5=5
6=2*3
7=7
8=2*2*2
9=3*3
10=2*5
提示
　　先筛出所有素数，然后再分解。
数据规模和约定
　　2<=a<=b<=10000
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
		//存质数
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
				int temp=i; //暂cun i
				int index=0; //存储质数下标的索引；
				while(temp!=1)  //当前数字没有被除尽
				{
					if(temp%v.get(index)==0)//从第一个质数开始除
					{
						System.out.print(v.get(index));
						temp/=v.get(index);
						index=0;//还原 即继续从第一个质数2开始尝试
						if(temp!=1)
						{
							System.out.print("*");//控制*的输出
						}
					}
					else{//不能整除的话尝试下一个质数
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

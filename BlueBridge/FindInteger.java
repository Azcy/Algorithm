import java.util.Scanner;


public class FindInteger {

	/**
	 * 查找整数
	 */
	/**
	 问题描述
	给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。

	输入格式
	第一行包含一个整数n。

	第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。

	第三行包含一个整数a，为待查找的数。

	输出格式
	如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
	样例输入
	6
	1 9 4 8 3 9
	9
	样例输出
	2
	数据规模与约定
	1 <= n <= 1000。
	 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int num[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			num[i]=in.nextInt();
		}
		int number=in.nextInt();
		System.out.println(findnumber(num,number));
	}
	public static int findnumber(int num[],int number)
	{
		
		int index=0;
		for(int i=0;i<num.length;i++)
		{
			if(number==num[i])
			{
				 index=i+1;
				 break;
			}else
				index=-1;
		}
		return index;
	}

}

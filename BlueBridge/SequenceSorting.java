/**
	数列排序  
问题描述
　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
输入格式
　　第一行为一个整数n。
　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
输出格式
　　输出一行，按从小到大的顺序输出排序后的数列。
样例输入
5
8 3 6 4 9
样例输出
3 4 6 8 9
*/


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int n=0;
		int a[] = null;
		int b;
		int t=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		a=new int [n];
		for(int i=0;i<n;i++)
		{
			b=in.nextInt();
				a[i]=b;
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				if(a[i]<a[j])
				{
					t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

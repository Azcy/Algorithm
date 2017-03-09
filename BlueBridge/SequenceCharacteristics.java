import java.util.Scanner;
/**
 * 数列特征
 * */
/**
 * 问题描述
给出n个数，找出这n个数的最大值，最小值，和。

输入格式
第一行为整数n，表示数的个数。

第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。

输出格式
输出三行，每行一个整数。第一行表示这些数中的最大值，第二行表示这些数中的最小值，第三行表示这些数的和。
样例输入
5
1 3 -2 4 5
样例输出
5
-2
11
数据规模与约定
1 <= n <= 10000。
 * */

public class SequenceCharacteristics {
	 public static void main(String []args)
	 {
		 Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 int num[]=new int[n];
		 int number;
		 for(int i=0;i<n;i++ )
		 {
			 
			
			num[i]=in.nextInt();
			
		 }
		 System.out.println(findmax(num));
		 System.out.println(findmin(num));
		 
		 System.out.println(getsum(num));
	 }
	 
	 public static int findmin(int num[])
	 {
		 int min =num[0];
		 for(int i=1;i<num.length;i++)
		 {
			
			 if(min>num[i])
			 {
				 min=num[i];
			 }
		 }
		 return min;
	 }
	 
	 public static int findmax(int num[])
	 {
		 int max = num[0];
		 for(int i=1;i<num.length;i++)
		 {
			 
			 if(max<num[i])
			 {
				 max=num[i];
			 }
		 }
		 return max;
	 }
	 
	 public static int getsum(int num[])
	 {
		 int sum=0;
		 for(int i=0;i<num.length;i++)
		 {
			 sum+=num[i];
		 }
		 return sum;
	 }

}

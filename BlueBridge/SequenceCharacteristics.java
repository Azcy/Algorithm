import java.util.Scanner;
/**
 * ��������
 * */
/**
 * ��������
����n�������ҳ���n���������ֵ����Сֵ���͡�

�����ʽ
��һ��Ϊ����n����ʾ���ĸ�����

�ڶ�����n������Ϊ������n������ÿ�����ľ���ֵ��С��10000��

�����ʽ
������У�ÿ��һ����������һ�б�ʾ��Щ���е����ֵ���ڶ��б�ʾ��Щ���е���Сֵ�������б�ʾ��Щ���ĺ͡�
��������
5
1 3 -2 4 5
�������
5
-2
11
���ݹ�ģ��Լ��
1 <= n <= 10000��
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

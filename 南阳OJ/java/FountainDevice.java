/**
��ˮװ�ã�һ��
ʱ�����ƣ�3000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�3
����
����һ���ƺ����Ϊ20�ף���Ϊ2�ף�Ҫ�ں��������Ϸ��ð뾶ΪRi����ˮװ�ã�ÿ����ˮװ�õ�Ч������������Ϊ���ĵİ뾶Ϊʵ��Ri(0<Ri<15)��Բ��ʪ�����г������ˮװ��i��1<i<600)��������һ���ܰѲ�ƺȫ��ʪ����Ҫ�����ǣ�ѡ�����ٵ���ˮװ�ã���������ƺ��ȫ��ʪ��
����
��һ��m��ʾ��m���������
ÿһ��������ݵĵ�һ����һ��������n��n��ʾ����n����ˮװ�ã�����һ�У���n��ʵ��ri��ri��ʾ����ˮװ���ܸ��ǵ�Բ�İ뾶��
���
�������װ�õĸ���
��������
2
5
2 3.2 4 4.5 6 
10
1 2 3 1 2 1.2 3 1.1 1 2
�������
2
5
��Դ
[�綰��]ԭ��
�ϴ���
�綰��
*/

import java.util.Scanner;
import java.util.Arrays;
public class FountainDevice
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int k=0;
		k=in.nextInt();
		while(k>0)
		{
		int m=in.nextInt();
		int count=0;
		double sum=0;
		double arr[]=new double[m];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextDouble();
		}
		//�Ƚ�����������С��������
		Arrays.sort(arr);
		for(int i=arr.length-1;sum<20;i--)
		{
			
				sum+=2*Math.sqrt(arr[i]*arr[i]-1);
				count++;		
		}
		System.out.println(count);
		k--;
		}
	}
}
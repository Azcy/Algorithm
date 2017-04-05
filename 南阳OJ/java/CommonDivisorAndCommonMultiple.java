/**
公约数和公倍数
时间限制： 1000 ms  |  内存限制： 65535 KB

难度： 1

描述
小明被一个问题给难住了，现在需要你帮帮忙。问题是：给出两个正整数，求出它们的最大公约数(GCD)和最小公倍数(LCM)。
输入
第一行输入一个整数n（0<n<=10000)，表示有n组测试数据;随后的n行输入两个整数i,j（0<i,j<=32767)。
输出
输出每组测试数据的最大公约数和最小公倍数
样例输入
3
6 6
12 11
33 22
样例输出
6 6
1 132
11 66
来源
[苗栋栋]原创
上传者
苗栋栋

百度百科
几个整数，公有的约数，叫做这几个数的公约数；其中最大的一个，叫做这几个数的最大公约数。例如：12、16的公约数有
1、2、4，其中最大的一个是4，4是12与16的最大公约数，一般记为（12，16）=4。12、15、18的最大公约数是3，记为（12，15，18）=3。


几个自然数公有的倍数，叫做这几个数的公倍数，其中最小的一个自然数，叫做这几个数的最小公倍数。例如：4的倍数有4、8、12、16，……，
6的倍数有6、12、18、24，……，4和6的公倍数有12、24，……，其中最小的是12，一般记为[4，6]=12。12、15、18的最小公倍数是180。记为[12，15，18]=180。
若干个互质数的最小公倍数为它们的乘积的绝对值。

*/
import java.util.Scanner;
public class CommonDivisorAndCommonMultiple
{
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while((n--)>0)
		{
				int num_1=in.nextInt();
				int num_2=in.nextInt();
				System.out.println(GCDandLCM(num_1,num_2)+"  "+num_1*num_2/GCDandLCM(num_1,num_2));
		}
	
		
	}
	public static int GCDandLCM(int num_1,int num_2)
	{
		return num_2==0? num_1:GCDandLCM(num_2,num_1%num_2);
	}
}
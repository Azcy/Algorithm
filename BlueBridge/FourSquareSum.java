import java.util.Scanner;
/**
四平方和定理，又称为拉格朗日定理
@author zcy
*/
/**
题目：
每个正整数都可以表示为至多4个正整数的平方和。
如果把0包括进去，就正好可以表示为4个数的平方和。

比如：
5 = 0^2 + 0^2 + 1^2 + 2^2
7 = 1^2 + 1^2 + 1^2 + 2^2
（^符号表示乘方的意思）

对于一个给定的正整数，可能存在多种平方和的表示法。
要求你对4个数排序：
0 <= a <= b <= c <= d
并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法


程序输入为一个正整数N (N<5000000)
要求输出4个非负整数，按从小到大排序，中间用空格分开

例如，输入：
5
则程序应该输出：
0 0 1 2

再例如，输入：
12
则程序应该输出：
0 2 2 2

再例如，输入：
773535
则程序应该输出：
1 1 267 838

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 3000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。
*/
public class FourSquareSum
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		int number=in.nextInt();
	long startTime=System.currentTimeMillis();   //获取开始时间
	
	double length1=Math.sqrt(number);
	boolean flag=false;
	for(int a=0;a<length1&&!flag;a++)
	{
		for(int b=a;b<length1&&!flag;b++)
		{
			for(int c=b;c<length1&&!flag;c++)
			{
					double d=Math.sqrt(number-a*a-b*b-c*c); //通过运算得出d减少一个for循环，来减少运算时间
					if(number==a*a+b*b+c*c+d*d)
					{
						if(d==(int)d) //通过double d与d的int类型进行比较是否是本身
						{
							System.out.println(a+" "+b+" "+c+" "+(int)d);
							flag=true;
						}
					}
			}
		}
	}
	long endTime=System.currentTimeMillis(); //获取结束时间
	System.out.println("程序运行时间： "+(endTime-startTime)+"ms");//获取运行时间=开始时间-结束时间
	
}
}
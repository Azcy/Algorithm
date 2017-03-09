
public class ZeroOneString {
	/**
	 *  基础练习 01字串 
	 * 问题描述
	对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
	00000
	00001
	00010
	00011
	00100
	请按从小到大的顺序输出这32种01串。
	输入格式
	本试题没有输入。
	输出格式
	输出32行，按从小到大的顺序每行一个长度为5的01串。
	样例输出
	00000
	00001
	00010
	00011
	<以下部分省略>
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=0;a<=1;a++)
		{
			for(int b=0;b<=1;b++)
			{
				for(int c=0;c<=1;c++)
				{
					for(int d=0;d<=1;d++)
					{
						for(int e=0;e<=1;e++)
						{
							System.out.println(String.valueOf(a)+String.valueOf(b)+String.valueOf(c)+String.valueOf(d)+String.valueOf(e));
						}
					}
				}
			}
		}
	}

}

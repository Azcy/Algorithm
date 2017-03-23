import java.util.Scanner;
import java.lang.Math;
public class Night
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		boolean flag=false;
		for(int a=0;a<=Math.sqrt(num)&&!flag;a++)
		{
			for(int b=a;b<=Math.sqrt(num)&&!flag;b++)
			{
				for(int c=b;c<=Math.sqrt(num)&&!flag;c++)
				{
					double d=Math.sqrt(num-(a*a+b*b+c*c));
					
					if((num==(a*a+b*b+c*c+d*d)))
					{
							if(d==(int)d)
							{
							System.out.print(a+" "+b+" "+c+" "+(int)d);
							
							flag=true;
							}
					}
				}
			}
		}
	}
}
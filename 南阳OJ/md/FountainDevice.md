# 喷水装置（一）
时间限制：3000 ms  |  内存限制：65535 KB

难度：3

描述

现有一块草坪，长为20米，宽为2米，要在横中心线上放置半径为Ri的喷水装置，每个喷水装置的效果都会让以它为中心的半径为实数Ri(0<Ri<15)的圆被湿润，这有充足的喷水装置i（1<i<600)个，并且一定能把草坪全部湿润，你要做的是：选择尽量少的喷水装置，把整个草坪的全部湿润。

输入

第一行m表示有m组测试数据
每一组测试数据的第一行有一个整数数n，n表示共有n个喷水装置，随后的一行，有n个实数ri，ri表示该喷水装置能覆盖的圆的半径。

输出

输出所用装置的个数

样例输入

	2
	5
	2 3.2 4 4.5 6 
	10
	1 2 3 1 2 1.2 3 1.1 1 2

样例输出

	2
	5
来源
[苗栋栋]原创
上传者
苗栋栋

思路图解：
![](https://github.com/Azcy/Algorithm/blob/master/%E5%8D%97%E9%98%B3OJ/image/FountainDevice.png)

	
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
			//先将输入的数组从小到大排序
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

----------

3/25/2017 9:55:26 PM 

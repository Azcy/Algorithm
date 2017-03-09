/**
十六进制转十进制
问题描述
　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
样例输入
FFFF
样例输出
65535

*/

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String num = sc.nextLine();
	        if(num.length()<=8)
	            System.out.println(Long.parseLong(num, 16));

	}

}

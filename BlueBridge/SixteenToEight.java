/**
	十六进制转八进制
	问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。

输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。

输出格式
　　输出n行，每行为输入对应的八进制正整数。

　　【注意】
　　输入的十六进制数不会有前导0，比如012A。
　　输出的八进制数也不能有前导0。

样例输入
　　2
　　39
　　123ABC

样例输出
　　71
　　4435274

　　【提示】
　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0;i < n;i++){
			String hex = in.nextLine();
			String bin = Main.hexToBinary(hex);
			String oct = Main.bintoOctonary(bin);
			System.out.println(oct);
		}
		
	      
	}
	
	static String hexToBinary(String hex)
	{
		StringBuffer s=new StringBuffer();
		for(int i=0;i<hex.length();i++)
		{
			switch(hex.charAt(i))
			{
				case '0': 
					{s.append("0000");break;}
				case '1': 
					{s.append("0001");break;}
				case '2': 
					{s.append("0010");break;}
				case '3':
					{s.append("0011"); break;}
				case '4':
					{s.append("0100"); break;}
				case '5':
					{s.append("0101"); break;}
				case '6':
					{s.append("0110"); break;}
				case '7':
					{s.append("0111"); break;}
				case '8':
					{s.append("1000"); break;}
				case '9':
					{s.append("1001"); break;}
				case 'A':
					{s.append("1010"); break;}
				case 'B':
					{s.append("1011"); break;}
				case 'C':
					{s.append("1100"); break;}
				case 'D':
					{s.append("1101"); break;}
				case 'E':
					{s.append("1110"); break;}
				case 'F':
					{s.append("1111"); break;}
				
			}
			}
			return cutBinary(s.toString());		
		}
		
	static String bintoOctonary(String bin)
	{
		StringBuffer sb = new StringBuffer();
 		String str = bin;
 		if(bin.length() % 3 == 1){
 			str = "00"+bin;
 		}else if(bin.length() % 3 == 2){
 			str = "0"+bin;
 		}
 	for (int i = 0;i < str.length() ;i += 3 ) {
 			String sub = str.substring(i,i+3);
 			if(sub.equals("000")){
 				sb.append("0");
 			}else if(sub.equals("001")){
 			sb.append("1");
 			}else if(sub.equals("010")){
 				sb.append("2");
 			}else if(sub.equals("011")){
 				sb.append("3");
			}else if(sub.equals("100")){
 				sb.append("4");
 			}else if(sub.equals("101")){
 				sb.append("5");
 			}else if(sub.equals("110")){
 				sb.append("6");
 			}else {
 				sb.append("7");
 			}
 			
 		}
 
 		return sb.toString();
	}
	public static String cutBinary(String bin){
 		String sub = bin;
 		for(int i = 0;i < bin.length()-1;i++){
 			if(sub.startsWith("0")){
 				sub = sub.substring(1,sub.length());
 			}
 			else
 				break;
 		}
 		return sub;
 	}
	

}

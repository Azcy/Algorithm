/**
	ʮ������ת�˽���
	��������
��������n��ʮ��������������������Ƕ�Ӧ�İ˽�������

�����ʽ
��������ĵ�һ��Ϊһ��������n ��1<=n<=10����
����������n�У�ÿ��һ����0~9����д��ĸA~F��ɵ��ַ�������ʾҪת����ʮ��������������ÿ��ʮ�����������Ȳ�����100000��

�����ʽ
�������n�У�ÿ��Ϊ�����Ӧ�İ˽�����������

������ע�⡿
���������ʮ��������������ǰ��0������012A��
��������İ˽�����Ҳ������ǰ��0��

��������
����2
����39
����123ABC

�������
����71
����4435274

��������ʾ��
�����Ƚ�ʮ��������ת����ĳ������������ĳ������ת���ɰ˽��ơ�
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

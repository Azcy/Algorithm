/**
ʮ������תʮ����
��������
�����Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
����ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��
��������
FFFF
�������
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

/**
ʮ����תʮ������
��������
����ʮ�����������ڳ������ʱ����Ҫʹ�õ���һ�������ı�ʾ��ʽ������0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F��16�����ţ��ֱ��ʾʮ��������0��15��ʮ�����Ƶļ�����������16��1������ʮ������16��ʮ����������10����ʮ���Ƶ�17��ʮ����������11���Դ����ƣ�ʮ���Ƶ�30��ʮ����������1E��
��������һ���Ǹ�������������ʾ��ʮ�����Ƶ���ʽ��
�����ʽ
�����������һ���Ǹ�����a����ʾҪת��������0<=a<=2147483647
�����ʽ
����������������16���Ʊ�ʾ
��������
30
�������
1E
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        if(a>=0&&a<=2147483647)
        {
        	System.out.println(Integer.toHexString(a).toUpperCase());
        }else
        	return;
    }

}
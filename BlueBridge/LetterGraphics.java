import java.util.Scanner;
/**
 ��ĸͼ��
 ��������
������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�

ABCDEFG

BABCDEF

CBABCDE

DCBABCD

EDCBABC

����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�

�����ʽ
����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε�������������
�����ʽ
���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ�
��������
5 7
�������
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
���ݹ�ģ��Լ��
1 <= n, m <= 26��
   
*/
public class LetterGraphics {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int m=in.nextInt();
       int add,temp;
       for(int i=0;i<n;i++)
       {
    	   add=i;
    	   temp=m;
    	   while(add>0&&temp>0)
    	   {
    		   System.out.print((char)(65+add));
    		   add--; temp--;
    	   }
    	  add=i;
    	   int k=0;
    	   while(add<m)
    	   {
    		   System.out.print((char)(65+k));
    		   k++;
    		   add++;
    	   }
    	   System.out.println();
       }

    }
}
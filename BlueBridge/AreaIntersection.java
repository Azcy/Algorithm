/**
	��������� 
��������
����ƽ�������������Σ����ǵı�ƽ����ֱ������ϵ��X���Y�ᡣ����ÿ�����Σ����Ǹ�������һ����Զ�������꣬����������������εĽ��������
�����ʽ
����������������У�ÿ������һ�����Ρ�
������ÿ���У��������ε�һ����Զ�������꣬ÿ��������궼����������ֵ������10^7��ʵ����ʾ��
�����ʽ
�������������һ��ʵ����Ϊ���������������С������λ��
��������
1 1 3 3
2 2 4 4
�������
1.00s
*/

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {  
		  
        Scanner sc = new Scanner(System.in);  
  
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();  
        double x3 = sc.nextDouble(), y3 = sc.nextDouble(), x4 = sc.nextDouble(), y4 = sc.nextDouble();  
        sc.close();  
  
        // �ҳ�����һ�����������Сx�������Сy  
        double maxx = Math.max(x1, x2), minx = Math.min(x1, x2), maxy = Math.max(y1, y2), miny = Math.min(y1, y2);  
        double bigx = Math.max(x3, x4), smax = Math.min(x3, x4), bigy = Math.max(y3, y4), smay = Math.min(y3, y4);  
  
        // �ж��Ƿ������������  
        if (smax >= maxx || minx >= bigx || smay >= maxy || miny >= bigy)  
            System.out.println("0.00");  
        else {  
            // �ҳ��ཻ�ľ��ε������㣬��1��xx,yy�� ��2��x,y��  
            double xx = Math.max(minx, smax), yy = Math.max(miny, smay);  
            double x = Math.min(maxx, bigx), y = Math.min(maxy, bigy); 
            DecimalFormat dFormat=new DecimalFormat("#.00");
            System.out.println(dFormat.format( Math.abs(x - xx) * Math.abs(y - yy)));  
        }  
	}
    


}
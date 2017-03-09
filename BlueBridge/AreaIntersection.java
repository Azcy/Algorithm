/**
	矩形面积交 
问题描述
　　平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
输入格式
　　输入仅包含两行，每行描述一个矩形。
　　在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
输出格式
　　输出仅包含一个实数，为交的面积，保留到小数后两位。
样例输入
1 1 3 3
2 2 4 4
样例输出
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
  
        // 找出矩形一，二的最大最小x，最大最小y  
        double maxx = Math.max(x1, x2), minx = Math.min(x1, x2), maxy = Math.max(y1, y2), miny = Math.min(y1, y2);  
        double bigx = Math.max(x3, x4), smax = Math.min(x3, x4), bigy = Math.max(y3, y4), smay = Math.min(y3, y4);  
  
        // 判断是否相离或者相切  
        if (smax >= maxx || minx >= bigx || smay >= maxy || miny >= bigy)  
            System.out.println("0.00");  
        else {  
            // 找出相交的矩形的两个点，点1（xx,yy） 点2（x,y）  
            double xx = Math.max(minx, smax), yy = Math.max(miny, smay);  
            double x = Math.min(maxx, bigx), y = Math.min(maxy, bigy); 
            DecimalFormat dFormat=new DecimalFormat("#.00");
            System.out.println(dFormat.format( Math.abs(x - xx) * Math.abs(y - yy)));  
        }  
	}
    


}
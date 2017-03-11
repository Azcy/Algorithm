/**
2.立方变自身

观察下面的现象,某个数字的立方，按位累加仍然等于自身。
1^3 = 1 
8^3  = 512    5+1+2=8
17^3 = 4913   4+9+1+3=17
...

请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？

请填写该数字，不要填写任何多余的内容或说明性的文字。

*/
import java.lang.*;
public class Cubic
{
	
	public static void main(String[] args)
	{ 
        int count=0;//count为符合的个数
        for(int i=1;i<10000;i++) 
        {  

						
            int sum = 0;  
            int num = i * i * i;  
            String str = String.valueOf(num);  
            int[] ch = new int[str.length()];  
            for (int x = 0; x < ch.length; x++) {  
                ch[x] = str.charAt(x)-48;  
                 
                sum = sum + ch[x];  
            }  
            if (sum == i) {  
            	System.out.println(sum+"*"+sum+"*"+sum+"="+num);  
  								count++;
            
            }  
        }  
         System.out.println(count);  
	}
	/*
	别人的解法
	public static void main(String[] args)   
    {  
       
     int count=0;  
     for(int i=1;i<100000;i++)  
     {  
        int num=(int) Math.pow(i,3);  
        int temp=0;  
        while(num!=0)  
        {  
            temp+=num%10;  
            num/=10;  
        }  
        if(temp==i)  
        {  
            count++;  
        }  
     }  
       
     System.out.println(count);  
    }  
  */
}
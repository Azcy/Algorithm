/**
会场安排问题
时间限制：3000 ms  |  内存限制：65535 KB
难度：4
描述
学校的小礼堂每天都会有许多活动，有时间这些活动的计划时间会发生冲突，需要选择出一些活动进行举办。小刘的工作就是安排学校小礼堂的活动，每个时间最多安排一个活动。现在小刘有一些活动计划的时间表，他想尽可能的安排更多的活动，请问他该如何安排。
输入
第一行是一个整型数m(m<100)表示共有m组测试数据。
每组测试数据的第一行是一个整数n(1<n<10000)表示该测试数据共有n个活动。
随后的n行，每行有两个正整数Bi,Ei(0<=Bi,Ei<10000),分别表示第i个活动的起始与结束时间（Bi<=Ei)
输出
对于每一组输入，输出最多能够安排的活动数量。
每组的输出占一行
样例输入
2
2
1 10
10 11
3
1 10
10 11
11 20
样例输出
1
2
提示
注意：如果上一个活动在t时间结束，下一个活动最早应该在t+1时间开始
来源
经典题目
上传者
张云聪
*/

/**
思路：采用贪心算法
1.每次选取用时最短时间的活动
2.每次选取开始最早的时间
3.每次选取活动结束时间最早的。


只有3是符合的。
通过用两个数组分别存取输入的开始时间、结束时间。
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingProblem {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); //请输入

        int count=0;//用来存储活动次数
        //新建一个activity的列表，为了存储每个活动的对象
        ArrayList<activity>  num = new ArrayList<>();
        while(n>0)
        {
            int m=in.nextInt();
            for (int i = 0; i < m; i++) {
                int star = in.nextInt();
                int finish = in.nextInt();
                num.add(new activity(star, finish));


            }
            //通过shiyongcollections对numArrayList，根据结束时间进行排序（升序排列）
            Collections.sort(num, new Comparator<activity>() {
                @Override
                public int compare(activity o1, activity o2) {
                    if (o1.getfinish() < o2.getfinish()) {
                        return -1;
                    } else if (o1.getfinish() == o2.getfinish()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });
            //通过根据贪心算法，每次选取结束时间最早的。如果对已经排好的序列，如果满足当前活动结束时间小于下一个的开始时间，则count++
            int t=0;//用来存放当前时间
            for (int i = 0; i < num.size(); i++) {
                if (t<num.get(i).getstart()) //判断当前活动结束时间是否小于下一个活动的开始时间
                {
                    count++;
                    t=num.get(i).getfinish();//将本次活动结束的时间赋值给t
                }
            }
            //输出活动次数
            System.out.println(count);
            n--;
        }
    }
}

/**
 * 活动类
 * @param start 活动开始时间
 * @param finish 活动结束时间
 * */
class activity
{
    private int start;
    private int finish;
    public activity(int start,int finish)
    {
        this.start=start;
        this.finish=finish;
    }
    public int getstart()
    {
        return this.start;
    }
    public int getfinish()
    {
        return this.finish;
    }
}

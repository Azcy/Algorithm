/**
�᳡��������
ʱ�����ƣ�3000 ms  |  �ڴ����ƣ�65535 KB
�Ѷȣ�4
����
ѧУ��С����ÿ�춼�����������ʱ����Щ��ļƻ�ʱ��ᷢ����ͻ����Ҫѡ���һЩ����оٰ졣С���Ĺ������ǰ���ѧУС���õĻ��ÿ��ʱ����ల��һ���������С����һЩ��ƻ���ʱ������뾡���ܵİ��Ÿ���Ļ������������ΰ��š�
����
��һ����һ��������m(m<100)��ʾ����m��������ݡ�
ÿ��������ݵĵ�һ����һ������n(1<n<10000)��ʾ�ò������ݹ���n�����
����n�У�ÿ��������������Bi,Ei(0<=Bi,Ei<10000),�ֱ��ʾ��i�������ʼ�����ʱ�䣨Bi<=Ei)
���
����ÿһ�����룬�������ܹ����ŵĻ������
ÿ������ռһ��
��������
2
2
1 10
10 11
3
1 10
10 11
11 20
�������
1
2
��ʾ
ע�⣺�����һ�����tʱ���������һ�������Ӧ����t+1ʱ�俪ʼ
��Դ
������Ŀ
�ϴ���
���ƴ�
*/

/**
˼·������̰���㷨
1.ÿ��ѡȡ��ʱ���ʱ��Ļ
2.ÿ��ѡȡ��ʼ�����ʱ��
3.ÿ��ѡȡ�����ʱ������ġ�


ֻ��3�Ƿ��ϵġ�
ͨ������������ֱ��ȡ����Ŀ�ʼʱ�䡢����ʱ�䡣
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingProblem {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(); //������

        int count=0;//�����洢�����
        //�½�һ��activity���б�Ϊ�˴洢ÿ����Ķ���
        ArrayList<activity>  num = new ArrayList<>();
        while(n>0)
        {
            int m=in.nextInt();
            for (int i = 0; i < m; i++) {
                int star = in.nextInt();
                int finish = in.nextInt();
                num.add(new activity(star, finish));


            }
            //ͨ��shiyongcollections��numArrayList�����ݽ���ʱ����������������У�
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
            //ͨ������̰���㷨��ÿ��ѡȡ����ʱ������ġ�������Ѿ��źõ����У�������㵱ǰ�����ʱ��С����һ���Ŀ�ʼʱ�䣬��count++
            int t=0;//������ŵ�ǰʱ��
            for (int i = 0; i < num.size(); i++) {
                if (t<num.get(i).getstart()) //�жϵ�ǰ�����ʱ���Ƿ�С����һ����Ŀ�ʼʱ��
                {
                    count++;
                    t=num.get(i).getfinish();//�����λ������ʱ�丳ֵ��t
                }
            }
            //��������
            System.out.println(count);
            n--;
        }
    }
}

/**
 * ���
 * @param start ���ʼʱ��
 * @param finish �����ʱ��
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

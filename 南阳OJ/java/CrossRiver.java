import java.util.Scanner;
import java.util.Arrays;
public class CrossRiver
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//����n����������Ĵ���
		int n=in.nextInt();
		while((n--)>0)
		{
			//������ʱ��
			int result=0;
			//�����������
			int PeopleNum=in.nextInt();
			//����һ����ȡ�����˵�����
			int CrossRiverTime[]=new int[PeopleNum];
			//�ֱ��������������Ҫ��ʱ��
			for(int i=0;i<PeopleNum;i++)
			{
				CrossRiverTime[i]=in.nextInt();
			}
			//�Թ��ӵ�ʱ���������
			Arrays.sort(CrossRiverTime);
		
			while(PeopleNum>3)
			{
				if(2*CrossRiverTime[1]+CrossRiverTime[0]+CrossRiverTime[PeopleNum-1]>2*CrossRiverTime[0]+CrossRiverTime[PeopleNum-1]+CrossRiverTime[PeopleNum-2])
				{
					//��ʱ����˺���ʱ��̵�����һ���ȥ��Ȼ����ʱ��̵��˰��ֵ�Ͳ���������ٺ���ʱ�ڶ�������һ���ȥ����ʱ��̵��˻�����
					result+=2*CrossRiverTime[0]+CrossRiverTime[PeopleNum-2]+CrossRiverTime[PeopleNum-1];
				}else
				{
					//��ʱ��̺���ʱ�ڶ��̵���һ���ȥ��Ȼ����ʱ��̵��˰��ֵ�Ͳ��������Ȼ����ʱ�����ʱ�ڶ�������һ���ȥ����ʱ�ڶ��̵��˻����� 
					result+=2*CrossRiverTime[1]+CrossRiverTime[0]+CrossRiverTime[PeopleNum-1];
				}
				PeopleNum-=2;
			}
				if(PeopleNum==1)
			{
				result+=CrossRiverTime[0];
				
			}
			if(PeopleNum==2)
			{
				result+=CrossRiverTime[1];
			}
			if(PeopleNum==3)
			{
				result+=CrossRiverTime[0]+CrossRiverTime[1]+CrossRiverTime[2];
			}
			System.out.println(result);
		}
	}
}
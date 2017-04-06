import java.util.Scanner;
import java.util.Arrays;
public class CrossRiver
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//输入n，代表输入的次数
		int n=in.nextInt();
		while((n--)>0)
		{
			//过河总时间
			int result=0;
			//输入个河人数
			int PeopleNum=in.nextInt();
			//创建一个存取过河人的世界
			int CrossRiverTime[]=new int[PeopleNum];
			//分别输入过河人所需要的时间
			for(int i=0;i<PeopleNum;i++)
			{
				CrossRiverTime[i]=in.nextInt();
			}
			//对过河的时间进行排序
			Arrays.sort(CrossRiverTime);
		
			while(PeopleNum>3)
			{
				if(2*CrossRiverTime[1]+CrossRiverTime[0]+CrossRiverTime[PeopleNum-1]>2*CrossRiverTime[0]+CrossRiverTime[PeopleNum-1]+CrossRiverTime[PeopleNum-2])
				{
					//用时最长的人和用时最短的人先一起过去，然后用时最短的人把手电筒带回来，再和用时第二长的人一起过去，用时最短的人回来。
					result+=2*CrossRiverTime[0]+CrossRiverTime[PeopleNum-2]+CrossRiverTime[PeopleNum-1];
				}else
				{
					//用时最短和用时第二短的人一起过去，然后用时最短的人把手电筒带回来，然后用时最长和用时第二长的人一起过去，用时第二短的人回来。 
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
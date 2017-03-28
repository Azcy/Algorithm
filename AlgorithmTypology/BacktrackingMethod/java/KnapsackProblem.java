/**
		0/1��������
����n=3��0/1�������⣬������Ʒ������Ϊ{20��15��10}����ֵΪ{20��30��25}����������Ϊ25��
*/
public class KnapsackProblem
{
	int weight[]=new int[]{20,15,10};//��ʾ��Ʒ������
	int value[]=new int[]{20,30,25};//��Ʒ��Ӧ�ļ�ֵ
	int feasible[]=new int[1000];
	int PackageSize=25;
	int KpCapacity;
	/**
	0/1��������ķ���
	@ param i Ϊװ��������Ʒ�ĸ���
	@ param Kplvalue ��������Ʒ�ļ�ֵ
	@ param KpWeight ��������Ʒ������ 
	@ param j  ��ʾÿ����Ʒ�ķ����벻�����״̬��
	*/
	public  void Knapsack(int i,int Kplvalue,int KpWeight)
	{
		int j;
		if(i>=weight.length)
		{
			//���i�Ѿ�����������Ʒ�ĸ�������ʾ�Ѿ�����ʱ���������������
				for(int m=0;m<weight.length;m++)
				{
					System.out.print(feasible[m]+" ");
				}
				System.out.print("��ֵ"+Kplvalue);	
				System.out.println();	
		}else
		{
			//��j����ʾ����Ʒ�ķ����벻����
			for(j=0;j<=1;j++)
			{
				//���������Ʒ�Ƿ�ѡ��
				feasible[i]=j;
				//�жϰ�������+��Ʒ�������Ƿ�С�ڰ���������
				if(KpWeight+feasible[i]*weight[i]<=PackageSize)
				{	
					
					KpWeight+=feasible[i]*weight[i];
					Kplvalue+=feasible[i]*value[i];
					//�ݹ����
					Knapsack(i+1,Kplvalue,KpWeight);
					//����,�ָ���֮ǰ��״̬
					KpWeight-=feasible[i]*weight[i];
					Kplvalue-=feasible[i]*value[i];
					
				}
			
			}
		}
		
	}

	
	
	
	
	public static void main(String[] args)
	{
		new KnapsackProblem().Knapsack(1,0,0);
	}
}
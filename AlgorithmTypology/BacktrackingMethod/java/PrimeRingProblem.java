/**
������{1��2��...,20}��д��һ�����У�Ҫ��ÿ������ֻ��дһ�Σ��������ڵ���������֮����һ��������
������ͼ��ʾ��������{1,2,3,4}��Ӧ��һ����������
*/

public class PrimeRingProblem
{
	 
	private void PrimeRing(int n)
	{	
		int i,k;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=0;
		}
	
		a[0]=1;
			k=1;//ָ����0��λ��д1
		while(k>=1)
		{
			a[k]+=1; //a[k]�洢0~n�����֣���Ϊ��n���ж�������ÿ���ֻ� ����a[k]=0+1��ʼ��
			while(a[k]<=n) //
			{
				if(check(k,a)==1) //λ��k������д����a[k]
				{
					break;
				}else
				{
					a[k]+=1; //��̽��һ����   
				}
			}
			
			if(a[k]<=n&&k==n-1)  //�������һ�����֣����
			{
				for(i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
				return ;
			}
			
			if(a[k]<=n&&k<n-1) //�����û�е���ĩβ
			{
				k=k+1;  //�������д��һ��λ��
			}else
			{
				a[k]=0;
				k--;
			}
		}
	}
	//�ж�kλ���Ƿ����Լ������
	int   check(int k,int a[])
	{
		int flag=0;
		//�ж��Ƿ��ظ�
		for(int i=0;i<k;i++)
		{
			if(a[i]==a[k])
			{
				return 0;
			}
		}
		flag=prime(a[k]+a[k-1]);
		if(flag==1&&k==a.length-1)
		{
			 flag=prime(a[k]+a[0]);
		}
		return flag;
	}
	
	//�ж�����x�Ƿ�������
	private int prime(int n)
	{
		int half=(int) Math.sqrt(n);

		for(int i=2;i<=half;i++)

			if(n%i==0){

				return 0;

			}
		return 1;
	}
	public static void main(String[] args)
	{
		new PrimeRingProblem().PrimeRing(20);
	}
}
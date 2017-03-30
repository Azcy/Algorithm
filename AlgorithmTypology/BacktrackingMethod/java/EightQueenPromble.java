import java.util.Scanner;
public class EightQueenPromble
{
	/**
	�˻ʺ�����
	@param x[i] ��ʾ��i���ʺ�ڷŰڷ��ڵ�i�е�x[i]�е�λ��
	@param k ��ʾ��k���ʺ�
	*/
	public void Queen(int n)
	{
		int x[]=new int[n];
		//��ʼ��
		for (int i=0; i<n; i++) {
		 	x[i]=-1;
		}
		int k=0;
		while(k>=0)      //�ڷŻʺ�k��ע��0=<k<n
		{
			x[k]++;       //����һ�аڷŻʺ�k
			while(x[k]<n)
			{
				if(x[k]<n&&Place(k,x)==0) 
				{
					break;//�������������
				}else
				{
					x[k]++; //������ͻ���ʺ�k��̽��һ��
				}
			}
			if(x[k]<n&&k==n-1)  //�ó�һ�����н⣬���
			{
				for(int i=0;i<n;i++)
				{
					System.out.print(x[i]+1+" ");
				}
				return;
			}
			
			if(x[k]<n&&k<n-1) //���лʺ�δ�ڷ�
			{
				k++;          //׼���ڷ���һ���ʺ�
			}else
			{
				x[k]=-1;        //����x[k]
				k--;             //����
			}
		}
		System.out.println("�޽�");
		
	}
	
	private static  int Place(int k,int x[])
	{
		for(int i=0;i<k;i++)
		{
			if(x[i]==x[k]||Math.abs(i-k)==Math.abs(x[i]-x[k])) //�ж��Ƿ���ͬһ�У���б��1��-1�Ƿ���ͬһ��б����
			{
				return 1;              //��ͻ����1
			}
			                //����ͻ����0
		}return 0;
	}
	
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//����һ������n����ʾn�ʺ�
		System.out.println("������n:(n��ʾn���ʺ�����)");
		int n=in.nextInt();
		new EightQueenPromble().Queen(n);
	}
}
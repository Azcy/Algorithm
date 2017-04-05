import java.util.Scanner;
public class BatchJobProblem
{
	/**
	��������ҵ��������
	@param a[] �洢n����ҵ�ڻ���1�ϵĴ���ʱ��
	@param a[] �洢n����ҵ�ڻ���2�ϵĴ���ʱ��
	@param n һ����n����ҵ
	@param sum1[]�洢����1�����ʱ��
	@param sum2[]�洢����2�����ʱ��
	@return �������ʱ��
	*/
	 public int BatchJob(int a[],int b[],int n)
	 {
	 	int i,k;
	 	//x[]Ϊ������ҵ
	 	int x[]=new int [n+1];
	 	//����1�ϵ����ʱ��
	 	int sum1[]=new int [n+1];
	 	//����2�ϵ����ʱ��
	 	int sum2[]=new int [n+1];
	 	int bestTime=1000;  //�ٶ��������ʱ�䲻����1000
	 	for(i=1;i<=n;i++) //��ʼ�����ȷ���
	 	{
	 		x[i]=-1;
	 		sum1[i]=0;
	 		sum2[i]=0;
	 	}
	 	//��ʼ����ʱʹ��
	 	sum1[0]=0;
	 	sum2[0]=0;
	 	k=1;  //���ȵ�1����ҵ
	 	while(k>=1)
	 	{
	 		x[k]=x[k]+1;
	 		while(x[k]<n)
	 		{
	 			for(i=1;i<k;i++)
	 			{
	 				if(x[i]==x[k])//�����ҵx[k]�Ƿ��ظ����� 
	 					break;
	 			}
	 			//�ж�ǰ���Ƿ������ǰ����
	 			if(i==k)
	 			{
	 			/*1.�жϼ��뵱ǰ������Ƿ񳬹����ʱ�䣬�������򿼲���һ�����񣬷������
          2.�ж�ǰ������Ҫ֪������һ���뵱ǰ���������ʱ��������������һ�������ʱ��˭��˭��
          3.ѡ��Ϻ��һ��ʱ����ϵ�ǰ�����ڻ���������ɵ�ʱ��͵��ڵ�ǰ�������ɺ��ʱ��
        */
	 				sum1[k]=sum1[k-1]+a[x[k]]; //����1��ǰ�����ʱ�䣬a[x[k]]��ʾ��k����ҵ�ڻ���һ�ϵĴ���ʱ��
	 				if(sum1[k]>sum2[k-1])   //�����ǰ��ҵ�ڻ���1�����ʱ�������һ����ҵ�ڻ����������ʱ��
	 				{
	 					sum2[k]=sum1[k]+b[x[k]];
	 				}else
	 				{
	 					sum2[k]=sum2[k-1]+b[x[k]];
	 				}
	 				//�жϼ��뵱ǰ����ʱ�������ʱ��
	 				if(sum2[k]<=bestTime)
	 				{
	 					//С�ڣ������
	 						break;
	 				}
	 				else  //�Ѿ�����Ŀǰ���ʱ�䣬��֦
	 				{
	 					x[k]=x[k]+1;
	 				}
	 			}
	 			else
	 			{
	 				x[k]=x[k]+1;  //��ҵx[k]�Ѵ���������һ����ҵ
	 			}
	 		}
	 		//�ж��Ƿ������һ���������ǣ��������һ������
	 		if(x[k]<n&&k<n)
	 		{
	 			k=k+1; //������һ����ҵ
	 		}else
	 		{
	 			//�ж��Ƿ������һ������
	 			if(x[k]<n&&k==n)  
	 			{
	 				if(bestTime>=sum2[k])
	 				{
	 					bestTime=sum2[k];
	 					System.out.print("Ŀǰ�����ҵ�����ǣ�");
	 					for(int j=1;j<=n;j++)
	 					{
	 						System.out.print(x[j]+1+" "); //��ҵ��Ŵ�1��ʼ
	 					}
	 					System.out.println("���ʱ����"+bestTime);
	 				}
	 				
	 			}
	 			//����(��ΪҪ�ҵ����ʱ�䣬��ǰ�ҵ���ֻ�ǵ�ǰ���ʱ��)
	 			x[k]=-1;  //����x[k],����
	 			k--;
	 		}
	 		
	 	}
	 	return bestTime;
	 } 
	 
	 public static void main(String [] args)
	 {
	 	Scanner in=new Scanner(System.in);
	 	System.out.println("��������ҵ�ĸ���:");
	 	int n=in.nextInt();
	 	int a[]=new int[n];//����1�ϵĴ���ʱ��
	 	int b[]=new int[n]; //����2�ϵĴ���ʱ��
	 	System.out.println("�ֱ������ڻ���1�ϵĴ���ʱ��:");
	 	for(int i=0;i<n;i++)
	 	{
	 		a[i]=in.nextInt();
	 	}
	 	System.out.println("�ֱ������ڻ���2�ϵĴ���ʱ��:");
	 	for(int i=0;i<n;i++)
	 	{
	 		b[i]=in.nextInt();
	 	}
	 	int result=new BatchJobProblem().BatchJob(a,b,n);
	 	 if(result == -1) System.out.println("�޷������������ҵ����!");
    else System.out.println("��������ҵ���ȵ����ʱ���ǣ�" + result);
	 }
}
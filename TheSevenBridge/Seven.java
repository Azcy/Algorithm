/**
���ľ

С�����ϲ�������ֻ�ľ��
һ����10���ľ��ÿ����ľ����һ�����֣�0~9��

���ľ����
ÿ����ľ�ŵ�����������ľ�����棬����һ���������������ľ����С��
�����4��Ľ������Σ������������еĻ�ľ��

���������ֺϸ�Ĵ��

   0
  1 2
 3 4 5
6 7 8 9

   0
  3 1
 7 5 2
9 8 6 4    

������������Ĵһ���ж����֣�

�����ʾ����Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�



  
*/
public class Seven
{
	
	
	 static boolean check(int a,int b,int c,int d,int e,int f,int g,int h,int i)
	{
		int num[]=new int[]{a,b,c,d,e,f,g,h,i};
		for(int k=0;k<num.length;k++)
		{
			for(int j=k+1;j<num.length;j++)
			{
				if(num[k]==num[j])
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args)
	{
		long startTime=System.currentTimeMillis();//��ȡ��ʼʱ��
		int num[];
		num =new int[10];
		int count=0;
		num[0]=0;//��һ��ֻ��Ϊ0
			for(num[1]=1;num[1]<10;num[1]++)
			{
				for(num[2]=1;num[2]<10;num[2]++)
				{
					for(num[3]=1;num[3]<10;num[3]++)
					{
						for(num[4]=1;num[4]<10;num[4]++)
						{
							for(num[5]=1;num[5]<10;num[5]++)
							{
								for(num[6]=1;num[6]<10;num[6]++)
								{
									for(num[7]=1;num[7]<10;num[7]++)
									{
										for(num[8]=1;num[8]<10;num[8]++)
										{
											for(num[9]=1;num[9]<10;num[9]++)
											{
												if(check(num[1],num[2],num[3],num[4],num[5],num[6],num[7],num[8],num[9])&&num[0]<num[1]&&num[0]<num[2]&&num[1]<num[3]&&num[1]<num[4]&&num[2]<num[4]&&num[2]<num[5]&&num[3]<num[6]&&num[3]<num[7]&&num[4]<num[7]&&num[4]<num[8]&&num[5]<num[8]&&num[5]<num[9])
												{
													count++;
												}
			
											}
			
										}
			
									}
								}
			
							}
			
						}
			
					}
			
				}
			
			}
		
		System.out.println(count);
		long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
		System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");    //�����������ʱ��
	}
}
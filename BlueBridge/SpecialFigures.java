public class SpecialFigures {

	/**
	 * ���������
		��������
����153��һ���ǳ��������������������ÿλ���ֵ������ͣ���153=1*1*1+5*5*5+3*3*3���������������������������λʮ��������
		�����ʽ
��������С�����˳�����������������λʮ��������ÿ����ռһ�С�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				for(int k=0;k<10;k++)
				{
					if((i*100+j*10+k)==i*i*i+j*j*j+k*k*k)
					{
						System.out.println(i*100+j*10+k);
					}
				}
			}
		}
	}

}

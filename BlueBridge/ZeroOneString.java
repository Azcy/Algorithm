
public class ZeroOneString {
	/**
	 *  ������ϰ 01�ִ� 
	 * ��������
	���ڳ���Ϊ5λ��һ��01����ÿһλ��������0��1��һ����32�ֿ��ܡ����ǵ�ǰ�����ǣ�
	00000
	00001
	00010
	00011
	00100
	�밴��С�����˳�������32��01����
	�����ʽ
	������û�����롣
	�����ʽ
	���32�У�����С�����˳��ÿ��һ������Ϊ5��01����
	�������
	00000
	00001
	00010
	00011
	<���²���ʡ��>
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=0;a<=1;a++)
		{
			for(int b=0;b<=1;b++)
			{
				for(int c=0;c<=1;c++)
				{
					for(int d=0;d<=1;d++)
					{
						for(int e=0;e<=1;e++)
						{
							System.out.println(String.valueOf(a)+String.valueOf(b)+String.valueOf(c)+String.valueOf(d)+String.valueOf(e));
						}
					}
				}
			}
		}
	}

}

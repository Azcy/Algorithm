/**
��������
˼·��
1.ѡȡ�����һ�����ֿ��������������
2.�ӵڶ��������������������������н��в���
3.ֱ���������鶼������Ϊֹ
@anthor Zcy
@data 2017.3.7.12��51
*/
public class InsertSort
{
	public static void main(String[] args)
	{
		int [] arr=new int []{3,1,5,7,2,4,9,8};
		insertSort(arr);
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
  /**  
     * ��������
     * 
     * 1.�ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
     * 2.ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�� 
     * 3.�����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��  
     * 4.�ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��  
     * 5.����Ԫ�ز��뵽��λ����  
     * �ظ�����2  
     * @param numbers  ����������
     * @param temp  �����ڱ����ݴ�����¼
     */  
    public static void insertSort(int[] numbers)
    {
    int size = numbers.length;
    int temp = 0 ;  
    int j =  0;
    
   	for(int i=0;i<size;i++)
   	{
   		//�ݴ浱ǰiλ�ü�¼
   		temp=numbers[i];
   		for(j=i;j>0&&temp<numbers[j-1];j--)
   		{
   			//����ݴ�ļ�¼tempe<numbers[j-1],�����
   			numbers[j]=numbers[j-1];
   		}
   			numbers[j]=temp;
   	}
    }
  }

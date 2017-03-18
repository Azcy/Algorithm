/**
	ϣ������
*/
public class ShellSort
{
	/**
	 ������򵥵Ĳ�������
	 @param increment ����
	 @param temp �ݴ����ݣ������ڱ�
	*/
	public static void shellSortSmallToBig(int[] data) 
	{
        int j = 0;
        int temp = 0;
        int size=data.length;
        //���ѭ����Ϊ�˰Ѳ���increment �ʱ����ݼ�
        for (int increment =size / 2; increment > 0; increment /= 2) {
        	//�������
            System.out.println("increment:" + increment);
            for (int i = increment; i < size; i++) {
                // System.out.println("i:" + i);
                //�ȼ�¼��ǰdata[i]��ֵ��Ϊ�˺��棬��data[j]�Ƚ�
                temp = data[i];
                //jΪ�Ӻ���ǰһ�α�����ͨ��temp��data[j]���бȽϣ����С�ڣ������ƶ�һλ
                for (j = i - increment; j >= 0&&temp < data[j]; j -= increment) {
                				//�����ƶ�һλ
                        data[j + increment] = data[j];
                }
                //�ҵ�λ�ú󣬲���
                data[j + increment] = temp;
            }
            //�����Ӧ�����������
            for (int i = 0; i <size; i++)
                System.out.print(data[i] + " ");
                System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] data = new int[] { 1,8,6,4,9,7,2,5,3,0 };
        shellSortSmallToBig(data);
       for(int a: data)
       {
       	System.out.println(a);
       }
    }
 }
/**
	������
	����˼�룺���Ƚ�������ļ�¼�����һ���ѣ���ʱ���Ѷ���¼�Ƕ������Լ�¼�������
	�����Ӷ������ߣ�ͨ�����Ѷ���¼�Ͷ������һ����¼��������Ȼ���ٽ�ʣ��ļ�¼�ٵ����ɶ�
	�������ҳ��˴δ��¼���������ƣ�֪������ֻ����һ����¼Ϊֹ��
	ʱ�����ܣ�O(log2n)
*/
public class HeapSort
{
	/**
		ɸѡ���ڵ�
	*/
	public static void SiftHeap(int r[],int k,int n)
	{
		int i,j,temp;
		//��iΪҪɸ�Ľ��
		i=k;
		//jΪi������  	
		j=2*i+1;
		while(j<n)
		{
			//�Ƚ�i�����Һ��ӣ�jΪ�ϴ���
			if(j<n-1&&r[j]<r[j+1])
			{
				j++;
			}
			//���ڵ��Ѿ��������Һ����еĽϴ���
			if(r[i]>r[j])
			{
				break;
			}else
			{
				//����ɸ�������j����
				temp=r[i];
				r[i]=r[j];
				r[j]=temp;
				i=j;
				//��ɸѡ���λ��ԭ������j��λ��
				j=2*i+1; 
			}
		}
	}
	
	public static void HeapSort(int r[],int n)
	{
		int i,temp;
		//��ʼ���ѣ����һ����֧���±��ǣ�n-1��/2
		for(i=(n-1)/2;i>=0;i--)
		{
			SiftHeap(r,i,n);
		}
		//�ظ�ִ�����߶Ѷ����ؽ��ѵ�
		for(i=1;i<=n-1;i++)
		{
			temp=r[0];
			r[0]=r[n-i];
			r[n-i]=temp;
			//ֻ��������ڵ�
			SiftHeap(r,0,n-i);
		}
	}
	   public static void main(String[] args) {
        int[] data = new int[] { 1,8,6,4,9,7,2,5,3,0 };
        HeapSort(data,data.length);
       for(int a: data)
       {
       	System.out.println(a);
       }
    }
}
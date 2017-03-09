/**
插入排序
思路：
1.选取数组第一个数字看成是有序的序列
2.从第二个主子逐个将数字往有序的序列进行插入
3.直到整个数组都是有序为止
@anthor Zcy
@data 2017.3.7.12：51
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
     * 插入排序
     * 
     * 1.从第一个元素开始，该元素可以认为已经被排序
     * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描 
     * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置  
     * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置  
     * 5.将新元素插入到该位置中  
     * 重复步骤2  
     * @param numbers  待排序数组
     * @param temp  设置哨兵，暂存待插记录
     */  
    public static void insertSort(int[] numbers)
    {
    int size = numbers.length;
    int temp = 0 ;  
    int j =  0;
    
   	for(int i=0;i<size;i++)
   	{
   		//暂存当前i位置记录
   		temp=numbers[i];
   		for(j=i;j>0&&temp<numbers[j-1];j--)
   		{
   			//如果暂存的记录tempe<numbers[j-1],则后移
   			numbers[j]=numbers[j-1];
   		}
   			numbers[j]=temp;
   	}
    }
  }

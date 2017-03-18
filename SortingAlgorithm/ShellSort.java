/**
	希尔排序
*/
public class ShellSort
{
	/**
	 类似与简单的插入排序
	 @param increment 步长
	 @param temp 暂存数据，类似哨兵
	*/
	public static void shellSortSmallToBig(int[] data) 
	{
        int j = 0;
        int temp = 0;
        int size=data.length;
        //外层循环是为了把步长increment 呈倍数递减
        for (int increment =size / 2; increment > 0; increment /= 2) {
        	//输出步长
            System.out.println("increment:" + increment);
            for (int i = increment; i < size; i++) {
                // System.out.println("i:" + i);
                //先记录当前data[i]的值，为了后面，与data[j]比较
                temp = data[i];
                //j为从后往前一次遍历，通过temp与data[j]进行比较，如果小于，往后移动一位
                for (j = i - increment; j >= 0&&temp < data[j]; j -= increment) {
                				//往后移动一位
                        data[j + increment] = data[j];
                }
                //找到位置后，插入
                data[j + increment] = temp;
            }
            //输出对应步长后的序列
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
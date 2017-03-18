# 3、插入排序------直接插入排序（Straight Insertion Sort）
### 时间复杂度：O(n2)
### 稳定性：稳定
### 基本思想：
先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。

**要点：设立哨兵，作为临时存储和判断数组边界之用。**

直接插入排序示例：
![](http://i.imgur.com/vccld4G.jpg)

### 算法的实现：
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
 	
[具体代码](https://github.com/Azcy/Algorithm/blob/master/SortingAlgorithm/InsertSort.java)
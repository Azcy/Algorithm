# 6、选择排序----堆排序
### 时间复杂度：O(n*log2n)
### 稳定性：不稳定
### 基本思想：
**堆**是具有下列性质的完全二叉树。每个节点都小于或等于其左右孩子节点的值（**小根堆**），反之为**大根堆**。

具有n个节点的堆按层序从1开始编号，则节点之间满足如下关系：
![](http://i.imgur.com/9DUKTmg.jpg)
若以一维数组存储一个堆，则堆对应一棵完全二叉树，且所有非叶结点的值均不大于(或不小于)其子女的值，根结点（堆顶元素）的值是最小(或最大)的。如：

(a)大顶堆序列：（96, 83,27,38,11,09)

(b)小顶堆序列：（12，36，24，85，47，30，53，91）
![](http://i.imgur.com/9rtXpe1.jpg)
初始时把要排序的n个数的序列看作是一棵顺序存储的二叉树（一维数组存储二叉树），调整它们的存储序，使之成为一个堆，将堆顶元素输出，得到n 个元素中最小(或最大)的元素，这时堆的根节点的数最小（或者最大）。然后对前面(n-1)个元素重新调整使之成为堆，输出堆顶元素，得到n 个元素中次小(或次大)的元素。依此类推，直到只有两个节点的堆，并对它们作交换，最后得到有n个节点的有序序列。称这个过程为堆排序。

因此，实现堆排序需解决两个问题：
1. 如何将n 个待排序的数建成堆；
2. 输出堆顶元素后，怎样调整剩余n-1 个元素，使其成为一个新堆。


首先讨论第二个问题：输出堆顶元素后，对剩余n-1元素重新建成堆的调整过程。
调整小顶堆的方法：

1）设有m 个元素的堆，输出堆顶元素后，剩下m-1 个元素。将堆底元素送入堆顶（（最后一个元素与堆顶进行交换），堆被破坏，其原因仅是根结点不满足堆的性质。

2）将根结点与左、右子树中较小元素的进行交换。

3）若与左子树交换：如果左子树堆被破坏，即左子树的根结点不满足堆的性质，则重复方法 （2）.

4）若与右子树交换，如果右子树堆被破坏，即右子树的根结点不满足堆的性质。则重复方法 （2）.

5）继续对不满足堆性质的子树进行上述交换操作，直到叶子结点，堆被建成。

称这个自根结点到叶子结点的调整过程为筛选。如图：
![](http://i.imgur.com/LeRRvcB.jpg)
再讨论对n 个元素初始建堆的过程。
建堆方法：对初始序列建堆的过程，就是一个反复进行筛选的过程。

1）n 个结点的完全二叉树，则最后一个结点是第个结点的子树。

2）筛选从第个结点为根的子树开始，该子树成为堆。

3）之后向前依次对各结点为根的子树进行筛选，使之成为堆，直到根结点。

如图建堆初始过程：无序序列：（49，38，65，97，76，13，27，49）
![](http://i.imgur.com/J26Cejw.jpg)

### 算法实现：
	/**
	堆排序
	基本思想：首先将待排序的记录构造成一个堆，此时，堆顶记录是堆中所以记录的最大者
	将它从堆中移走（通常将堆顶记录和堆中最后一个记录交换），然后再将剩余的记录再调整成堆
	这样又找出了次大记录，依次类推，知道堆中只出现一个记录为止。
	时间性能：O(log2n)
	*/
	public class HeapSort
	{
	/**
		筛选根节点
	*/
	public static void SiftHeap(int r[],int k,int n)
	{
		int i,j,temp;
		//置i为要筛的结点
		i=k;
		//j为i的左孩子  	
		j=2*i+1;
		while(j<n)
		{
			//比较i的左右孩子，j为较大者
			if(j<n-1&&r[j]<r[j+1])
			{
				j++;
			}
			//根节点已经大于左右孩子中的较大者
			if(r[i]>r[j])
			{
				break;
			}else
			{
				//将被筛结点与结点j交换
				temp=r[i];
				r[i]=r[j];
				r[j]=temp;
				i=j;
				//被筛选结点位于原来结点的j的位置
				j=2*i+1; 
			}
		}
	}
	
	public static void HeapSort(int r[],int n)
	{
		int i,temp;
		//初始建堆，最后一个分支的下标是（n-1）/2
		for(i=(n-1)/2;i>=0;i--)
		{
			SiftHeap(r,i,n);
		}
		//重复执行移走堆顶及重建堆得
		for(i=1;i<=n-1;i++)
		{
			temp=r[0];
			r[0]=r[n-i];
			r[n-i]=temp;
			//只需调整根节点
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
[具体代码](https://github.com/Azcy/Algorithm/blob/master/SortingAlgorithm/HeapSort.java)
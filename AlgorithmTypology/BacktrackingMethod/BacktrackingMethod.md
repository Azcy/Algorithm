# 回溯法
## 1.概述：
从根节点出发，按照深度优先的策略进行搜索，对于解空间树的某个结点，如果该结点满足问题的约束条件，则进入该子树继续进行搜索，否则将以该结点为根结点的子树进行剪枝。
回溯法常常可以避免搜索所有的可能的解，所以，使用于求解组合数较大的问题。
## 2.问题的解空间
问题的解向量：回溯法希望一个问题的解能够表示成一个n元式(x1,x2,…,xn)的形式。

显约束：对分量xi的取值限定。

隐约束：为满足问题的解而对不同分量之间施加的约束。

解空间：对于问题的一个实例，解向量满足显式约束条件的所有多元组，构成了该实例的一个解空间。

注意：同一个问题可以有多种表示，有些表示方法更简单，所需表示的状态空间更小（存储量少，搜索方法简单）。

下面是n=3时的0-1背包问题用完全二叉树表示的解空间：
![](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/image/01%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98.jpg)

## 3.设计思想
(1)针对所给问题，定义问题的解空间；

(2)确定易于搜索的解空间结构；

(3)以深度优先方式搜索解空间，并在搜索过程中用剪枝函数避免无效搜索。

**两个常用的剪枝函数：**

(1)约束函数：在扩展结点处减去不满足约束的子数

(2)限界函数：减去得不到最优解的子树

例如：
----------
对于n=3的0/1背包问题，三个物品的重量为{20,15,10},价值为{20,30,25},背包容量为25。从根节点出发，搜索过程如下：

(1)从结点1选择左子树到达节点2，由于选取了物品1，故在节点2处背包剩余容量是5，获得的价值为20；

(2)从结点2选择左子树到达结点3，由于结点3需要背包容量为15，而现在背包仅有容量5，因此结点3导致不可行解，对以结点3为根的子数进行剪枝；

(3)从结点3回溯到结点2，从结点2选择右子树到达结点6，结点6不需要背包容量，获得的价值仍为20；

(4)从结点6选择左子树到达结点7，由于结点7需要背包容量为10，而现在背包仅有容量5，因此结点7导致不可行解，对以结点7为根的子树实行剪枝；

(5)从结点7回溯到结点6，在结点6选择右子树到达叶子结点8，而结点8不需要容量，构成问题的一个可行解(1,0,0)，背包获得价值20.

![](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/image/01%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98%E7%9A%84%E6%90%9C%E7%B4%A2%E7%A9%BA%E9%97%B4.png)

## 常见问题

### [ 1、0/1背包问题](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/md/KnapsackProblem.md)

### [2、素环数问题](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/md/PrimeRingProblem.md)


### [3、图着色问题](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/md/GraphColouring.md)

###  4.哈密顿回路问题
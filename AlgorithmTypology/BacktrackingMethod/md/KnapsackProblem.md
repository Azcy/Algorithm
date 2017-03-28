# 0/1背包问题

##1.题目：
对于n=3的0/1背包问题，三个物品的重量为{20，15，10}，价值为{20，30，25}，背包容量为25。

## 2.思路：
(1)从结点1选择左子树到达节点2，由于选取了物品1，故在节点2处背包剩余容量是5，获得的价值为20；

(2)从结点2选择左子树到达结点3，由于结点3需要背包容量为15，而现在背包仅有容量5，因此结点3导致不可行解，对以结点3为根的子数进行剪枝；

(3)从结点3回溯到结点2，从结点2选择右子树到达结点6，结点6不需要背包容量，获得的价值仍为20；

(4)从结点6选择左子树到达结点7，由于结点7需要背包容量为10，而现在背包仅有容量5，因此结点7导致不可行解，对以结点7为根的子树实行剪枝；

(5)从结点7回溯到结点6，在结点6选择右子树到达叶子结点8，而结点8不需要容量，构成问题的一个可行解(1,0,0)，背包获得价值20.

![](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/image/01%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98%E7%9A%84%E6%90%9C%E7%B4%A2%E7%A9%BA%E9%97%B4.png)

## 3.0/1背包问题递归实现的示意图
![](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/image/01%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98%E7%A4%BA%E6%84%8F%E5%9B%BE.png)

## 4.0/1背包问题递归实现的流程图
![](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/image/01%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98%E7%9A%84%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

## [详细代码请点击此处](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/BacktrackingMethod/java/KnapsackProblem.java)
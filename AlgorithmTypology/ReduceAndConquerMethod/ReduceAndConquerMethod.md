# 减治法
## 概述
**分治法**是把一个大问题划分为若干个子问题，分别求解各个子问题，然后再把子问题的解进行合并得到原问题的解。

**减治法**同样是把一个大问题划分为若干个子问题，但是这些子问题不需要分别求解 ，只需求解其中的一个子问题，因而也无需对自问题的解进行合并。

### 设计思想
减治法将原问题分解为若干个子问题，并且原问题（规模n）的解与子问题（规模为n）的解与子问题（规模通常n/2或n-1）的解之间存在某种确定的关系，这种关系通常表现为：

（1）原问题的解只存在于其中一个较小规模的子问题；

（2）原问题的解与其中一个较小规模的解之间存在某种对应关系。

减治法的设计思想如图：
![](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/ReduceAndConquerMethod/image/%E5%87%8F%E6%B2%BB%E6%B3%95%E7%9A%84%E5%85%B8%E5%9E%8B%E6%83%85%E5%86%B5.png)

## 常见问题
## 查找问题中的减治法
### 折半查找

### 二叉树查找
### 选择问题 
## 排序问题中的减治法
### [插入排序](https://github.com/Azcy/Algorithm/blob/master/SortingAlgorithm/README/InsertSort.md)
### [堆排序](https://github.com/Azcy/Algorithm/blob/master/SortingAlgorithm/README/HeapSort.md)

## 组合问题中的减治法
### 淘汰赛冠军问题
### 假币问题
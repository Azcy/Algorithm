# 动态规划法（DP）
## 概述
**动态规划**是在20世纪50年代由美国数学家贝尔曼为研究最优控制问题提出的，programming的含义是计划和规划的意思。动态规划作为一种工具在应用数学中的价值被大家认同以后，在计算机科学界，动态规划法成为一种通用的算法设计技术用来求解多阶段决策最优化问题。


## 多阶段决策过程
在实际运用中，经常有这样一类问题：该问题有n个输入，问题的解由这n个输入的一个子集组成，这个子集必须满足某些事先给定的条件，这些条件称为**约束条件**，满足约束条件的解称为问题的**可行解**。满足约束条件的可行解可能不只一个，为了衡量这些可行解的优劣，通常以函数的形式给出一定的标准，这些标准函数称为**目标函数**，使目标函数取得极值的可行解称为**最优解**，这类问题称为**最优化问题**。

在多阶段决策过程中，由于每一阶段的决策仅与前一阶段的状态有关，因此，可以把每一阶段作为一个子问题来处理，然后按照由小问题到大问题，以小问题的解答支持大问题求解的模式，依次求解所有子问题，最终得到原问题的解。

多阶段决策过程满足**最优性原理**：无论决策过程的初始状态和初始决策是什么，其余的决策都必须相对于初始决策所产生的当前状态，构成一个最优决策序列。

## 动态规划法的设计思想
动态规划法将待求解问题分解成若干个互相重叠的子问题，每个子问题对应决策过程的一个阶段，一般来说，子问题的重叠关系表现在对给定问题求解的递推关系（动态规划函数）中，将自问题的解求解一次并填入表中，当需要再次求解此子问题时，可以通过查表获得该自问题的解，从而避免了大量重复计算.

## 基本步骤
step1 划分子问题：将原问题分解为若干个自问题，每个自问题对应一个决策阶段，并且子问题之间具有重叠关系；

step2 确定动态规划函数：根据子问题之间的重叠关系找到子问题满足的递推关系式（即动态规划函数）这是动态规划法的关键；

step3 填写表格:设计表格，以自底向上的方式计算各个子问题的解并填表，实现动态规划过程。
![](https://github.com/Azcy/Algorithm/blob/master/AlgorithmTypology/DynamicProgrammingMethod/image/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92%E6%B3%95%E7%9A%84%E6%B1%82%E8%A7%A3%E8%BF%87%E7%A8%8B.png)

## 常见问题
## 南阳oj
### [苹果 --01背包水题](https://github.com/Azcy/Algorithm/blob/master/%E5%8D%97%E9%98%B3OJ/md/01KnapsackProblem.md)

### [聪明的kk](https://github.com/Azcy/Algorithm/blob/master/%E5%8D%97%E9%98%B3OJ/md/CleverKk.md)

## 图问题中的动态规划法
### 多段图的最短路径问题
### 多源点最短路径问题
### TSP问题

## 组合问题中的动态规划法
### 最长递增子序列问题
### 最长公共子序列问题

## 查找问题中的动态规划法
### 最优二叉查找树
### 近似串匹配问题

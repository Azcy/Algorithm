# 二叉查找树
## 1、性质
1. 若它的左子树不空，则左子树上所有节点的值均小于根节点。
2. 若它的右子树不空，则右子树上所有节点的值均大于根节点。
3. 它的左右子树都是二叉排序树。
4. 没有键值相等的节点

##  1.1、示例图：
![](https://github.com/Azcy/Algorithm/blob/master/FindingProblem/image/%E4%BA%8C%E5%8F%89%E6%9F%A5%E6%89%BE%E6%A0%91%E7%A4%BA%E6%84%8F%E5%9B%BE.jpg)
# 二叉查找树的Java实现
	public class BSTree<T extends Comparable<T>> {
	
	    private BSTNode<T> mRoot;    // 根结点
	
	    public class BSTNode<T extends Comparable<T>> {
	        T key;                // 关键字(键值)
	        BSTNode<T> left;      // 左孩子
	        BSTNode<T> right;     // 右孩子
	        BSTNode<T> parent;    // 父结点
	
	        public BSTNode(T key, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
	            this.key = key;
	            this.parent = parent;
	            this.left = left;
	            this.right = right;
	        }
	    }
	
	        ......
	}
BSTree是二叉树，它保护了二叉树的根节点mRoot；

mRoot是BSTNode类型，而BSTNode是二叉查找树的节点，它是BSTree的内部类。

BSTNode包含二叉查找树的几个基本信息：

1. key -- 它是关键字，是用来对二叉查找树的节点进行排序的。
2. left -- 它指向当前节点的左孩子。
3. right -- 它指向当前节点的右孩子。
4. parent -- 它指向当前节点的父结点。

 
----------
## 1、二叉查找树节点的定义


## 2、遍历
前序遍历、中序遍历、后序遍历

## 2.1、 前序遍历
若二叉树非空，则执行如下操作：

(01) 先访问根节点

(02) 先序遍历左子树

(03) 先序遍历右子树

**前序遍历代码**
	
	private void preOrder(BSTNode<T> tree) {
	    if(tree != null) {
	        System.out.print(tree.key+" ");
	        preOrder(tree.left);
	        preOrder(tree.right);
	    }
	}
	
	public void preOrder() {
	    preOrder(mRoot);
	}

## 2.2、中序遍历
若二叉树非空，则执行以下操作：

(01) 中序遍历左子树；

(02) 访问根结点；

(03) 中序遍历右子树。


**中序遍历代码**

	private void inOrder(BSTNode<T> tree) {
	    if(tree != null) {
	        inOrder(tree.left);
	        System.out.print(tree.key+" ");
	        inOrder(tree.right);
	    }
	}
	
	public void inOrder() {
	    inOrder(mRoot);
	}

## 2.3、后序遍历
若二叉树非空，则执行以下操作：

(01) 后序遍历左子树；

(02) 后序遍历右子树；

(03) 访问根结点。


**后序遍历代码**

	private void postOrder(BSTNode<T> tree) {
	    if(tree != null)
	    {
	        postOrder(tree.left);
	        postOrder(tree.right);
	        System.out.print(tree.key+" ");
	    }
	}
	
	public void postOrder() {
	    postOrder(mRoot);
	}

各种遍历方式：
![](https://github.com/Azcy/Algorithm/blob/master/FindingProblem/image/%E9%81%8D%E5%8E%86%E6%96%B9%E5%BC%8F.jpg)

对于上面的二叉树而言，

(01) 前序遍历结果： 3 1 2 5 4 6

(02) 中序遍历结果： 1 2 3 4 5 6 

(03) 后序遍历结果： 2 1 4 6 5 3


## 3、 查找

**递归版本的代码**

	/*
	 * (递归实现)查找"二叉树x"中键值为key的节点
	 */
	private BSTNode<T> search(BSTNode<T> x, T key) {
	    if (x==null)
	        return x;
	
	    int cmp = key.compareTo(x.key);
	    if (cmp < 0)
	        return search(x.left, key);
	    else if (cmp > 0)
	        return search(x.right, key);
	    else
	        return x;
	}
	
	public BSTNode<T> search(T key) {
	    return search(mRoot, key);
	}

**非递归版本的代码**
	
	/*
	 * (非递归实现)查找"二叉树x"中键值为key的节点
	 */
	private BSTNode<T> iterativeSearch(BSTNode<T> x, T key) {
	    while (x!=null) {
	        int cmp = key.compareTo(x.key);
	
	        if (cmp < 0) 
	            x = x.left;
	        else if (cmp > 0) 
	            x = x.right;
	        else
	            return x;
	    }
	
	    return x;
	}
	
	public BSTNode<T> iterativeSearch(T key) {
	    return iterativeSearch(mRoot, key);
	}

## 4、最大值和最小值
**查找最大值的代码**

	/* 
	 * 查找最大结点：返回tree为根结点的二叉树的最大结点。
	 */
	private BSTNode<T> maximum(BSTNode<T> tree) {
	    if (tree == null)
	        return null;
	
	    while(tree.right != null)
	        tree = tree.right;
	    return tree;
	}
	
	public T maximum() {
	    BSTNode<T> p = maximum(mRoot);
	    if (p != null)
	        return p.key;
	
	    return null;
	}

**查找最小值的代码**

	/* 
	 * 查找最小结点：返回tree为根结点的二叉树的最小结点。
	 */
	private BSTNode<T> minimum(BSTNode<T> tree) {
	    if (tree == null)
	        return null;
	
	    while(tree.left != null)
	        tree = tree.left;
	    return tree;
	}
	
	public T minimum() {
	    BSTNode<T> p = minimum(mRoot);
	    if (p != null)
	        return p.key;
	
	    return null;
	}

## 5、前驱和后继

节点的前驱：是该节点的左子树中的最大节点。

节点的后继：是该节点的右子树中的最小节点。

**查找前驱节点的代码**
	
	/* 
	 * 找结点(x)的前驱结点。即，查找"二叉树中数据值小于该结点"的"最大结点"。
	 */
	public BSTNode<T> predecessor(BSTNode<T> x) {
	    // 如果x存在左孩子，则"x的前驱结点"为 "以其左孩子为根的子树的最大结点"。
	    if (x.left != null)
	        return maximum(x.left);
	
	    // 如果x没有左孩子。则x有以下两种可能：
	    // (01) x是"一个右孩子"，则"x的前驱结点"为 "它的父结点"。
	    // (01) x是"一个左孩子"，则查找"x的最低的父结点，并且该父结点要具有右孩子"，找到的这个"最低的父结点"就是"x的前驱结点"。
	    BSTNode<T> y = x.parent;
	    while ((y!=null) && (x==y.left)) {
	        x = y;
	        y = y.parent;
	    }
	
	    return y;
	}

**查找后继节点的代码**

	/* 
	 * 找结点(x)的后继结点。即，查找"二叉树中数据值大于该结点"的"最小结点"。
	 */
	public BSTNode<T> successor(BSTNode<T> x) {
	    // 如果x存在右孩子，则"x的后继结点"为 "以其右孩子为根的子树的最小结点"。
	    if (x.right != null)
	        return minimum(x.right);
	
	    // 如果x没有右孩子。则x有以下两种可能：
	    // (01) x是"一个左孩子"，则"x的后继结点"为 "它的父结点"。
	    // (02) x是"一个右孩子"，则查找"x的最低的父结点，并且该父结点要具有左孩子"，找到的这个"最低的父结点"就是"x的后继结点"。
	    BSTNode<T> y = x.parent;
	    while ((y!=null) && (x==y.right)) {
	        x = y;
	        y = y.parent;
	    }
	
	    return y;
	}

## 6、插入
	
	/* 
	 * 将结点插入到二叉树中
	 *
	 * 参数说明：
	 *     tree 二叉树的
	 *     z 插入的结点
	 */
	private void insert(BSTree<T> bst, BSTNode<T> z) {
	    int cmp;
	    BSTNode<T> y = null;
	    BSTNode<T> x = bst.mRoot;
	
	    // 查找z的插入位置
	    while (x != null) {
	        y = x;
	        cmp = z.key.compareTo(x.key);
	        if (cmp < 0)
	            x = x.left;
	        else
	            x = x.right;
	    }
	
	    z.parent = y;
	    if (y==null)
	        bst.mRoot = z;
	    else {
	        cmp = z.key.compareTo(y.key);
	        if (cmp < 0)
	            y.left = z;
	        else
	            y.right = z;
	    }
	}
	
	/* 
	 * 新建结点(key)，并将其插入到二叉树中
	 *
	 * 参数说明：
	 *     tree 二叉树的根结点
	 *     key 插入结点的键值
	 */
	public void insert(T key) {
	    BSTNode<T> z=new BSTNode<T>(key,null,null,null);
	
	    // 如果新建结点失败，则返回。
	    if (z != null)
	        insert(this, z);
	}

## 7、删除

**删除节点的代码**
	
	/* 
	 * 删除结点(z)，并返回被删除的结点
	 *
	 * 参数说明：
	 *     bst 二叉树
	 *     z 删除的结点
	 */
	private BSTNode<T> remove(BSTree<T> bst, BSTNode<T> z) {
	    BSTNode<T> x=null;
	    BSTNode<T> y=null;
	
	    if ((z.left == null) || (z.right == null) )
	        y = z;
	    else
	        y = successor(z);
	
	    if (y.left != null)
	        x = y.left;
	    else
	        x = y.right;
	
	    if (x != null)
	        x.parent = y.parent;
	
	    if (y.parent == null)
	        bst.mRoot = x;
	    else if (y == y.parent.left)
	        y.parent.left = x;
	    else
	        y.parent.right = x;
	
	    if (y != z) 
	        z.key = y.key;
	
	    return y;
	}
	
	/* 
	 * 删除结点(z)，并返回被删除的结点
	 *
	 * 参数说明：
	 *     tree 二叉树的根结点
	 *     z 删除的结点
	 */
	public void remove(T key) {
	    BSTNode<T> z, node; 
	
	    if ((z = search(mRoot, key)) != null)
	        if ( (node = remove(this, z)) != null)
	            node = null;
	}

## 8. 打印

**打印二叉查找树的代码**

	/*
	 * 打印"二叉查找树"
	 *
	 * key        -- 节点的键值 
	 * direction  --  0，表示该节点是根节点;
	 *               -1，表示该节点是它的父结点的左孩子;
	 *                1，表示该节点是它的父结点的右孩子。
	 */
	private void print(BSTNode<T> tree, T key, int direction) {
	
	    if(tree != null) {
	
	        if(direction==0)    // tree是根节点
	            System.out.printf("%2d is root\n", tree.key);
	        else                // tree是分支节点
	            System.out.printf("%2d is %2d's %6s child\n", tree.key, key, direction==1?"right" : "left");
	
	        print(tree.left, tree.key, -1);
	        print(tree.right,tree.key,  1);
	    }
	}
	
	public void print() {
	    if (mRoot != null)
	        print(mRoot, mRoot.key, 0);
	}

## 9、销毁
**销毁二叉查找树的代码**
	
	/*
	 * 销毁二叉树
	 */
	private void destroy(BSTNode<T> tree) {
	    if (tree==null)
	        return ;
	
	    if (tree.left != null)
	        destroy(tree.left);
	    if (tree.right != null)
	        destroy(tree.right);
	
	    tree=null;
	}
	
	public void clear() {
	    destroy(mRoot);
	    mRoot = null;
	}
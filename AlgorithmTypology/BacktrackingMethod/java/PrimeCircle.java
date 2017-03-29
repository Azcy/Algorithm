public class PrimeCircle {

/**

 *判断素数

 */

public static boolean isPrime(int n){

	if(n==1){

		return false;

	}else if(n==2){

		return true;

	}else{

		int half=(int) Math.sqrt(n);

		for(int i=2;i<=half;i++){

			if(n%i==0){

				return false;

			}

		}

		return true;

	}

}

/**

 *交换

 */

public static void swap(int[] array,int a,int b){

	int t=array[a];

	array[a]=array[b];

	array[b]=t;

}

/**

 * 深度优先搜索

 */

public static boolean dfs(int[] array,int level){

	if(level==array.length){

		//到达叶子节点

		//判断首尾元素的和是否为素数，如果是，则输出结果

		if(isPrime(array[0]+array[level-1])){

			for(int k:array){

				System.out.print(k+" ");

			}

			System.out.println();

			return true;

		}else{

			return false;

		}

		

	}else{

		//假设没有

		boolean flag=false;

		for(int i=level;i<array.length;i++){

			swap(array, level, i);

			if(level==0){

				if(dfs(array, level+1)){

					flag=true;

					swap(array, level, i);

					break;

				}

			}else if(isPrime(array[level]+array[level-1])){

				//递归下一层，只要找到一组解，则停止递归

				if(dfs(array, level+1)){

					flag=true;

					swap(array, level, i);

					break;

				}

			}

			swap(array, level, i);

		}

		return flag;

	}

}

public static void primeCircle(int n){

	int[] array=new int[n];

	for(int i=1;i<=n;i++){

		array[i-1]=i;

	}

	dfs(array, 0);

}

public static void main(String[] args) {

	primeCircle(20);

}

}
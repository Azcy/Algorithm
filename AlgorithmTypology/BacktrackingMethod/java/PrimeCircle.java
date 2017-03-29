public class PrimeCircle {

/**

 *�ж�����

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

 *����

 */

public static void swap(int[] array,int a,int b){

	int t=array[a];

	array[a]=array[b];

	array[b]=t;

}

/**

 * �����������

 */

public static boolean dfs(int[] array,int level){

	if(level==array.length){

		//����Ҷ�ӽڵ�

		//�ж���βԪ�صĺ��Ƿ�Ϊ����������ǣ���������

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

		//����û��

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

				//�ݹ���һ�㣬ֻҪ�ҵ�һ��⣬��ֹͣ�ݹ�

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
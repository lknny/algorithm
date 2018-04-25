package lk;

/**
 * Created by ${ lknny@163.com } on 2018/4/20.
 */
public class 二分查找 {
	public static int[]  array={1,2,3,4,5,6,7,8,9,10};

	/*递归算法*/
	public static int binSearch(int[] array,int begin,int end,int key){
		int index = (begin+end) / 2;
		if (begin > end) {
			return -1;
		}
		if (array[index] == key) {
			return index;
		}
		if (array[index] > key) {
			return binSearch(array, begin, index - 1, key);
		} else {
			return binSearch(array, index + 1, end, key);
		}
	}

	/*非递归实现*/
	public static int binSearch2(int[]array,int begin,int end,int key) {

		while (begin <= end) {
			int index = (begin + end) / 2;
			if (array[index] == key) {
				return index;
			}
			if (array[index] > key) {
				end = index;
			} else {
				begin = index;
			}
		}
		return -1;
	}




	public static void main(String[] args) {
		System.out.println(binSearch(array,0,10,7));
		System.out.println(binSearch2(array,0,10,7));
	}
}

package lk.查找;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ${ lknny@163.com } on 2019/11/8.
 */
public class 第K大的数 {

	class KthLargest {

		int index = 0;
		List<Integer> list = new ArrayList<>();

		public KthLargest(int k, int[] nums) {
			index = k-1;
			for (int num : nums) {
				list.add(num);
			}
		}

		public int add(int val) {

			list.add(val);
			Collections.sort(list,(o1,o2)->(o2-o1));

			return list.get(index);
		}


		public int[] sortedSquares(int[] A) {
			List<Integer> list=new ArrayList<Integer>();
			for(int a:A){
				list.add(a*a);
			}
			Collections.sort(list,(o1,o2)->(o1-o2));

			return Stream.of(list.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
		}
	}
}

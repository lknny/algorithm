package lk;

/**
 * Created by ${ lknny@163.com } on 2018/4/30.
 */
public class 冒泡排序 {

	private static int[] data = {12,3,412,4523,52,5,233,566,99,78,45};

	public static void sort(int[] data){

		for (int i=0;i<data.length-1;i++) {
			for(int j=0;j<data.length-1-i;j++) {
				if (data[j]>data[j+1]){
					int key = data[j];
					data[j] = data[j+1];
					data[j+1] = key;
				}
			}
		}

	}

	public static void main(String[] args) {
		sort(data);

		for (int datum : data) {
			System.out.print(datum+", ");
		}
	}

}

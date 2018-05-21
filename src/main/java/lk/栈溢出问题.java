package lk;

/**
 * Created by ${ lknny@163.com } on 2018/5/21.
 *
 *
 * JDK5以后，stack容量默认为1024字节
 */
public class 栈溢出问题 {
	private static long count = 0;

	public static void main(String[] args) {
		infinitelyRecursiveMethod(1);

	}

	public static void infinitelyRecursiveMethod(long a){
		System.out.println(count++);
		infinitelyRecursiveMethod(a);
	}
}

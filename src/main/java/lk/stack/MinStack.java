package lk.stack;

import java.util.Comparator;
import java.util.Stack;

/**
 * Created by ${ lknny@163.com } on 2019/11/30.
 */
public class MinStack {
	Stack<Integer> stack = new Stack<>();

	public MinStack() {

	}

	public void push(int x) {
		stack.push(x);
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return stack.stream().min(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1==Integer.MIN_VALUE) return -1;
				if (o1==Integer.MAX_VALUE) return 1;
				return o1-o2;
			}
		}).get();
	}


}

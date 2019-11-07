package lk;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ${ lknny@163.com } on 2019/11/7.
 */
public class 前序遍历 {
	class Node {
		public int val;
		public List<Node> children;

		public Node() {}

		public Node(int _val,List<Node> _children) {
			val = _val;
			children = _children;
		}
	};
	class Solution {
		List<Integer> rst = new LinkedList();

		public List<Integer> preorder(Node root) {
			if (null==root) return rst;
			rst.add(root.val);
			if (root.children.size() == 0) {
				return rst;
			}

			for (Node child : root.children) {
				preorder(child);
			}

			return rst;
		}
	}
}

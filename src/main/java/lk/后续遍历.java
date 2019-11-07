package lk;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ${ lknny@163.com } on 2019/11/7.
 */
public class 后续遍历 {

// Definition for a Node.
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

		public List<Integer> postorder(Node root) {
			if (null==root) return rst;

			if (root.children==null||root.children.size() == 0) {
				rst.add(root.val);
				return rst;
			}
			for (Node child : root.children) {
				postorder(child);
			}
			rst.add(root.val);
			return rst;
		}
	}
}

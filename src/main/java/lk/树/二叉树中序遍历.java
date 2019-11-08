package lk.树;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ${ lknny@163.com } on 2019/11/7.
 */
public class 二叉树中序遍历 {

	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }


	class Solution {
		List<Integer> rst = new LinkedList<>();

		public List<Integer> inorderTraversal(TreeNode root) {
			if (null==root) return rst;

			if (root.left != null) {
				inorderTraversal(root.left);
			}
			rst.add(root.val);
			if (root.right != null) {
				inorderTraversal(root.right);
			}

			return rst;
		}
	}

}

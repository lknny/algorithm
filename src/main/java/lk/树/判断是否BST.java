package lk.树;

/**
 * Created by ${ lknny@163.com } on 2019/10/28.
 *
 * 错的。。。可以递归搞。
 *
 */
public class 判断是否BST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		System.out.println(-Double.MAX_VALUE);
	}


	class Solution {
		public boolean isValidBST(TreeNode root) {
			if (null == root) return true;
			if (null == root.left && null == root.right) return true;
			if (root.left != null) {
				if (root.right != null) {
					if (root.val < root.left.val || root.val > root.right.val) {
						return false;
					}
				} else {
					return root.val<root.left.val;
				}
			}else {
				if (root.right!=null) return root.val>root.right.val;
			}


			return isLeftBST(root.left,root.val) && isRightBST(root.right,root.val);
		}

		public boolean isLeftBST(TreeNode node,int key) {
			if (null == node) return true;
			if (null == node.left && null == node.right&&node.val<key) return true;
			if (node.left != null) {
				if (node.right != null) {
					if (node.val > node.left.val && node.val < node.right.val&&
							isLessthan(key,node.val,node.left.val,node.right.val)) {
						return true;
					}
				} else {
					 return node.val > node.left.val&&
							isLessthan(key,node.val,node.left.val);
				}
			}else {
				if (node.right!=null) return node.val < node.right.val&&
						isLessthan(key,node.val,node.right.val);
			}
			 return isLeftBST(node.left,node.val) && isRightBST(node.right,node.val);
		}


		public boolean isRightBST(TreeNode node,int key) {
			if (null == node) return true;
			if (null == node.left && null == node.right&&node.val>key) return true;
			if (node.left != null) {
				if (node.right != null) {
					if (node.val > node.left.val && node.val < node.right.val&&
							isMorethan(key,node.val,node.left.val,node.right.val)) {
						return true;
					}
				} else {
					return node.val > node.left.val&&
							isMorethan(key,node.val,node.left.val);
				}
			}else {
				if (node.right!=null) return node.val < node.right.val&&
						isMorethan(key,node.val,node.right.val);
			}
			return isLeftBST(node.left,node.val) && isRightBST(node.right,node.val);
		}


		public boolean isMorethan(int key,int ...values) {
			for (int value : values) {
				if (key > value) {
					return false;
				}
			}
			return true;
		}

		public boolean isLessthan(int key,int ...values) {
			for (int value : values) {
				if (key < value) {
					return false;
				}
			}
			return true;
		}
	}

}

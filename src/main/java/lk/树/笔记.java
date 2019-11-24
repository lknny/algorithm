package lk.树;

/**
 * Created by ${ lknny@163.com } on 2019/11/24.
 */
public class 笔记 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}


	//938，bst搜索树节点和
	int sum = 0;
	public int rangeSumBST(TreeNode root, int L, int R) {
		if (root == null) {
			return 0;
		}
		if (root.val >= L && root.val <= R) {
			sum += root.val;
		}
		rangeSumBST(root.left, L, R);
		rangeSumBST(root.right, L, R);
		return sum;
	}

	//617, 合并树,注意判空
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		int l = t1 == null ? 0 : t1.val;
		int r = t2 == null ? 0 : t2.val;
		TreeNode treeNode = new TreeNode(l+r);
		treeNode.left = mergeTrees(t1==null?null:t1.left, t2==null?null:t2.left);
		treeNode.right = mergeTrees(t1==null?null:t1.right, t2==null?null:t2.right);
		return treeNode;
	}


	//226，翻转二叉树
	public TreeNode invertTree(TreeNode root) {
		if (root==null) return root;
		if (root.left==null&&root.right==null) {
			return root;
		}

		TreeNode tmp = root.left == null ? null : root.left;
		root.left = root.right == null ? null : root.right;
		root.right = tmp;

		invertTree(root.left);
		invertTree(root.right);
		return root;

	}

	//700，bst节点
	public TreeNode searchBST(TreeNode root, int val) {
		if (root==null) return root;
		if (root.val==val) return root;

		if (root.val>val) return searchBST(root.left,val);
		else return searchBST(root.right, val);
	}


	public TreeNode sortedArrayToBST(int[] nums) {
		int len = nums.length;
		TreeNode root = new TreeNode(nums[len / 2]);
		root.left = toBST(nums, 0, len / 2 - 1);
		root.right = toBST(nums, len / 2 + 1, len - 1);
		return root;
	}

	TreeNode toBST(int[] nums,int s,int end) {
		if (s >= end) {
			return new TreeNode(nums[s]);
		}
		int index = (s + end) / 2;
		TreeNode root = new TreeNode(nums[index]);
		root.left = toBST(nums, s, index - 1);
		root.right = toBST(nums, index + 1, end);
		return root;

	}
}

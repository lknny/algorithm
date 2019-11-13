package lk;

/**
 * Created by ${ lknny@163.com } on 2019/11/9.
 */
public class OnlyTest {


	int rst = 0;
	public int game(int[] guess, int[] answer) {

		for (int i = 0; i < guess.length; i++) {
			if (guess[i]==answer[i]) ++rst;
		}
		return rst;
	}
	public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (null==p&&q==null) return true;

		if (null==p&&q!=null) return false;
		if (null!=p&&q==null) return false;
		if(p.val!=q.val)return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}

	TreeNode root;
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

		root = t1;
		if (null == t1 && null == t2) {
			return root;
		}

		return root;

	}
}

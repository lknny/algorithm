package lk.链表;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ${ lknny@163.com } on 2019/11/30.
 **/
public class LinkedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}


	//237，删除链表节点
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next= node.next.next;
	}

	public boolean canWinNim(int n) {
		return n % 4 != 0;

	}

//	StringBuilder rs = new StringBuilder();
//	public String reverseWords(String s) {
//		String[] l1 = s.split(" ");
//
//		for (String s1 : l1) {
//			for (int i = s1.length()-1; i >=0; i--) {
//				rs.append(s1.charAt(i));
//			}
//			rs.append(" ");
//		}
//
//		rs.deleteCharAt(rs.length()-1);
//		return rs.toString();
//	}

	public void reverseString(char[] s) {
		if (s == null || s.length == 1) {
			return;
		}
		int cs = 0;
		int ce = s.length - 1;
		while (cs++ < ce--) {
			char tmp = s[cs];
			s[cs] = s[ce];
			s[ce] = tmp;

		}
	}

	HashMap<Integer,Boolean> rs = new HashMap();
	public int singleNumber(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (rs.containsKey(nums[i])){
				rs.put(nums[i], false);
				continue;
			}
			rs.put(nums[i], true);
		}
		for (Map.Entry<Integer,Boolean> integerBooleanEntry : rs.entrySet()) {
			if (integerBooleanEntry.getValue()) {
				return integerBooleanEntry.getKey();
			}
		}
		return 0;

	}
}

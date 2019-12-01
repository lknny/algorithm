package lk.数组;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ${ lknny@163.com } on 2019/11/30.
 */
public class 多数元素 {


	public int majorityElement(int[] nums) {
		int num = 1;
		if (nums.length == 1) return nums[0];
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				++num;
				if (num >= (nums.length / 2 + 1)) {
					return nums[i];
				}
			}

		}
		return -1;
	}

//	public int maxProfit(int[] prices) {
//		int sum = 0;
//		for (int i = 0; i < prices.length-1; i++) {
//			if (prices[i + 1] - prices[i] > 0) {
//				sum += prices[i + 1] - prices[i];
//			}
//		}
//		return sum;
//	}

	public int maxProfit(int[] prices) {
		int sum = 0;
		if (prices==null||prices.length==0) return 0;
		int low = prices[0];
		for (int i = 0; i < prices.length ; i++) {
			if (prices[i] < low) {
				low = prices[i];
				continue;
			}
			if (prices[i ] - low > sum ) {

				sum = prices[i ] - low;
			}
		}
		return sum;
	}


	Set<Integer> set = new HashSet<>();
	public boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}

	public boolean isPowerOfTwo(int n) {
		if (n==0) return false;
		if (n==1||n==2) return true;
		if (n%2!=0) return false;
		while (n / 2 > 1) {
			n = n / 2;
			if (n % 2 != 0) return false;
		}
		return true;

	}

	int sum = 0;
	public int climbStairs(int n) {
		if (n<=0) return 0;
		if (n==1) return 1;
		if (n==2) return 2;

		return sum + climbStairs(n - 1) + climbStairs(n - 2);
	}
}

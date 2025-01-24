/* Majority Element II: Given an integer array of size n, find all elements that appear more than [n/3] times.

Input: nums = [3,2,3]
Output: [3]

Input: nums = [1]
Output: [1] */

import java.util.*;

public class tUF {

	public static List<Integer> majorityElement(int[] nums) {

		List<Integer> ans = new ArrayList<>();

		int n = nums.length;
		int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
		int cnt1 = 0, cnt2 = 0;

		for(int num : nums) {

			if(cnt1 == 0) {
				el1 = num;
				cnt1 = 1;
			} else if(cnt2 == 0) {
				el2 = num;
				cnt2 = 1;
			}
			else if(num == el1) cnt1++;
			else if(num == el2) cnt2++;
			else {
				cnt1--;
				cnt2++;
			}
		}

		int count1 = 0;
		int count2 = 0;
		for(int num : nums) {
			if(num == el1) count1++;
			if(num == el2) count2++;
		}

		if(count1 > n/3) ans.add(el1);
		if(count2 > n/3) ans.add(el2);

		return ans;
	}

	public static void main (String[] args) {
		int[] nums = {3,2,3};
		List<Integer> ans = majorityElement(nums);
		System.out.print("majority elements: " + ans);
	}
}
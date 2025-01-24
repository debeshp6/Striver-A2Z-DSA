/* Longest Consecutive Sequence.

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9 */

import java.util.*;

public class tUf {

	public static int longestConsecutive(int[] nums) {

		int n = nums.length;
		int longest = 1;
		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<n; i++) {
			set.add(nums[i]);
		}

		for(int it : nums) {

			if(!set.contains(it-1)) {
				int x = it;
				int cnt = 1;
				while(set.contains(x+1)) {
					x++;
					cnt++;
				}

				longest = Math.max(longest, cnt);
			}
		}

		return longest;
	}

	public static void main (String[] args) {
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		int max = longestConsecutive(nums);
		System.out.print("longest consecutive = " + max);
	}
}
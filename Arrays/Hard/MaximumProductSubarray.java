/* Maximum Product Subarray in an Array.

Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

Input: Nums = [1,2,3,4,5,0]
Output: 120
Explanation: In the given array, we can see 1×2×3×4×5 gives maximum product value. */

class Solution {
	public int maxProduct(int[] nums) {
		int n = nums.length;
		int prefix = 1;
		int suffix = 1;
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if (prefix == 0) prefix = 1;
			if (suffix == 0) suffix = 1;
			prefix *= nums[i];
			suffix *= nums[n-i-1];
			ans = Math.max(ans,Math.max(prefix,suffix));
		}

		return ans;
	}
}
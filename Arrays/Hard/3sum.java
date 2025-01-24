/* 3 Sums:

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter. */

import java.util.*;

public class tUF {

	public static List<List<Integer>> threeSum(int[] arr) {

		int n = arr.length;
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);

		for(int i=0; i<n; i++) {
			if(i != 0 && arr[i] == arr[i-1]) continue;
			int j = i+1;
			int k = n-1;
			while(j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum < 0) j++;
				else if(sum > 0) k--;
				else {
					List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
					ans.add(temp);
					j++;
					k--;
					while(j<k && arr[j] == arr[j-1]) j++;
					while(j<k && arr[k] == arr[k+1]) k--;
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = threeSum(arr);
		for (List<Integer> it : ans) {
			System.out.print("[");
			for (Integer i : it) {
				System.out.print(i + " ");
			}
			System.out.print("] ");
		}
		System.out.println();
	}
}
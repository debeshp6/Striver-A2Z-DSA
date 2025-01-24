/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. */


// using HashMap

import java.util.*;

public class tUF {

	public static int[] twoSum(int[] arr, int target) {

		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			int num = arr[i];
			int moreNeeded = target - num;

			if(map.containsKey(moreNeeded)) {
				return new int[] {map.get(moreNeeded), i};
			}

			map.put(num, i);
		}

		throw new IllegalArgumentException("no solution");
	}

	public static void main (String[] args) {
		int[] arr = {2,7,11,15};
		int target = 9;
		int sum[] = twoSum(arr, target);
		System.out.print("two sums: " + Arrays.toString(sum));
	}
}




// using foor loop - simple

import java.util.*;

public class tUF {

	public static int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}

		return new int[] {};
	}

	public static void main (String[] args) {
		int[] arr = {2,7,11,15};
		int target = 9;
		int sum[] = twoSum(arr, target);
		System.out.print("two sums: " + Arrays.toString(sum));
	}
}
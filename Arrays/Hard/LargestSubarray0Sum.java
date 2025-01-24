/* Largest subarray with 0 sum.

Given an array arr containing both positive and negative integers,
the task is to compute the length of the largest subarray that has a sum of 0.

Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]
Output: 5
Explanation: The largest subarray with a sum of 0 is [-2, 2, -8, 1, 7].

Input: arr[] = [2, 10, 4]
Output: 0
Explanation: There is no subarray with a sum of 0. */

import java.util.*;

public class tUF {

	static int maxLen(int arr[]) {

		int n = arr.length;
		int sum = 0;
		int maxi = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for(int i=0; i<n; i++) {
			sum += arr[i];

			if(sum == 0)
				maxi = i+1;
			else if(map.get(sum) != null) {
				maxi = Math.max(maxi, i-map.get(sum));
			}
			else map.put(sum, i);
		}

		return maxi;
	}

	public static void main (String[] args) {
		int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
		System.out.print("largest subarray: " + maxLen(arr));
	}
}
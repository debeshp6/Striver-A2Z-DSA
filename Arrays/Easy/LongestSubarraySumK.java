/* Longest Sub-Array with Sum K.

Input: arr[] = [10, 5, 2, 7, 1, 9], k = 15
Output: 4
Explanation: The subarray [5, 2, 7, 1] has a sum of 15 and length 4. */

import java.util.*;

public class tUF {

	public static int longestSubarray (int[] arr, int k) {

		int n = arr.length;
		int sum = 0;
		int maxLength = 0;

		Map<Integer, Integer> preSum = new HashMap<>();
		for(int i=0; i<n; i++) {
			sum += arr[i];

			if(sum == k) {
				maxLength = Math.max(maxLength, i+1);
			}

			int rem = sum - k;

			if(preSum.containsKey(rem)) {
				int length = i - preSum.get(rem);
				maxLength = Math.max(maxLength, length);
			}

			if(!preSum.containsKey(sum)) {
				preSum.put(sum, i);
			}
		}

		return maxLength;
	}

	public static void main (String[] args) {
		int [] arr = {1, -1, 5, -2, 3};
		int k = 3;
		int length = longestSubarray(arr,k);
		System.out.print("longest sub array: " + length);
	}
}
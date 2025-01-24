/* Problem Statement: Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equal to k.

Example 1:

Input Format: A = [4, 2, 2, 6, 4] , k = 6
Result: 4
Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6] */

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int subarraysWithSumK(int []a, int b) {

		int n = a.length;
		int xr = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(xr,1);
		int cnt = 0;

		for(int i=0; i<n; i++) {
			xr = xr ^ a[i];
			int xor = xr ^ b; // remember the formula ---> x = xr ^ k
			if(map.containsKey(xor))
				cnt += map.get(xor);
			if(map.containsKey(xr))
				map.put(xr, map.get(xr) + 1);
			else
				map.put(xr,1);

		}

		return cnt;

	}
}

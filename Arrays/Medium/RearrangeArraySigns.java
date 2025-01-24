/* You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions. */

import java.util.*;

public class tUF {

	public static int[] rearrangeArray(int[] arr) {

		int n = arr.length;
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		for(int i=0; i<n; i++) {
			if(arr[i] > 0) pos.add(arr[i]);
			else neg.add(arr[i]);
		}

		for(int i=0; i<n/2; i++) {
			arr[2*i] = pos.get(i);
			arr[2*i+1] = neg.get(i);
		}

		return arr;
	}

	public static void main (String[] args) {
		int[] arr = {3,1,-2,-5,2,-4};
		System.out.print("before: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		rearrangeArray(arr);
		System.out.print("after: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
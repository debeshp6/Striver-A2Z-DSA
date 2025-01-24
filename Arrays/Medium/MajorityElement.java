/* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than [n / 2] times
You may assume that the majority element always exists in the array. */

// we have applied Moore's Voting Algorithm here in this problem

import java.util.*;

public class tUF {

	public static int majorityElement(int[] nums) {

		int n = nums.length;
		int el = 0;
		int cnt = 0;

		for(int i=0; i<n; i++) {

			if(cnt == 0) {
				cnt = 1;
				el = nums[i];

			} else if(nums[i] == el) cnt++;
			else cnt--;
		}

		int cnt1 = 0;
		for(int i=0; i<n; i++) {
			if(nums[i] == el)
				cnt1++;
		}

		if(cnt1 > (n/2)) return el;
		return -1;
	}

	public static void main (String[] args) {
		int[] arr = {3,2,3};
		System.out.print("maojority element is: " + majorityElement(arr));
	}
}
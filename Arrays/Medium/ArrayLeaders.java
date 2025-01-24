/* Array Leaders

You are given an array arr of positive integers. Your task is to find all the leaders in the array.
An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader. */

import java.util.*;

public class tUF {

	public static ArrayList<Integer> leaders(int arr[]) {

		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();

		int max = arr[n-1];
		ans.add(arr[n-1]);

		for(int i=n-2; i>=0; i--) {
			if(arr[i] >= max) {
				max = arr[i];
				ans.add(arr[i]);
			}
		}

		Collections.reverse(ans);
		return ans;
	}

	public static void main (String[] args) {
		int[] arr = {10,4,2,4,1};
		ArrayList<Integer> max = leaders(arr);
		System.out.print(max);
	}
}
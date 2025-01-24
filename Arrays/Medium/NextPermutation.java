/* Next Permutation

Input: nums = [1,2,3]
Output: [1,3,2]

Input: nums = [3,2,1]
Output: [1,2,3]

Input: nums = [1,1,5]
Output: [1,5,1] */

import java.util.*;

public class tUF {

	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			swap(arr, start++, end--);
		}
	}

	public static void nextPerm(int[] arr) {

		int idx = -1;
		int n = arr.length;
		if(n == 1) return;

		for(int i=n-2; i>=0; i--) {
			if(arr[i] < arr[i+1]) {
				idx = i;
				break;
			}
		}

		if(idx == -1) {
			reverse(arr,0,n-1);
			return;
		}

		for(int i=n-1; i>idx; i--) {
			if(arr[i] > arr[idx]) {
				swap(arr, i, idx);
				break;
			}
		}

		reverse(arr,idx+1, n-1);
	}

	public static void main (String[] args) {
		int[] arr = {1,2,3};
		nextPerm(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
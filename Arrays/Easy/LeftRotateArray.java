/* Given an array of integers, rotating array of elements by k elements left. */

import java.util.*;

public class tUf {

	static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void rotateLeft(int[] arr, int k) {
		int n = arr.length;
		k = k % n;

		System.out.print("before rotating: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		reverse(arr, 0, n-1);
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);

		System.out.print("after rotating: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main (String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k = 2;
		rotateLeft(arr,k);
	}
}
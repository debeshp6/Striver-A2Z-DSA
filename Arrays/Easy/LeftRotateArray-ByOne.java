/* Given an array of N integers, left rotate the array by one place. */

import java.util.*;

public class tUf {

	public static void reverse(int[] arr, int n) {
		int temp = arr[0];
		for(int i=0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
		System.out.print("after rotating: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main (String[] args) {
		int[] arr = {1,2,3,4,5};
		int n = 5;
		System.out.print("before rotating: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		reverse(arr,n);
	}
}
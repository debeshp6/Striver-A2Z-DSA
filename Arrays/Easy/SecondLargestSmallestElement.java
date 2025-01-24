import java.util.*;

public class tUf {

	static int secondLargestElement(int[] arr) {
		int n = arr.length;
		if(n < 2) return -1;
		int largest = -1, secondLargest = -1;

		for(int i=0; i<n; i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}

		for(int i=0; i<n; i++) {
			if(arr[i] > secondLargest && arr[i] != largest)
				secondLargest = arr[i];
		}

		return secondLargest;
	}

	static int secondSmallestElement(int[] arr) {
		int n = arr.length;
		int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

		for(int i=0; i<n; i++) {
			if(arr[i] < smallest)
				smallest = arr[i];
		}

		for(int i=0; i<n; i++) {
			if(arr[i] < secondSmallest && arr[i] != smallest)
				secondSmallest = arr[i];
		}

		return secondSmallest;
	}

	public static void main (String[] args) {
		int[] arr = {1,5,6,4,2,3};
		int n = arr.length;

		System.out.print("array: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		int max = secondLargestElement(arr);
		System.out.print("second largest element: " + max);

		System.out.println();
		int min = secondSmallestElement(arr);
		System.out.print("second smallest element: " + min);

	}
}
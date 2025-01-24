import java.util.*;

public class tUf {

	static int largest(int[] arr) {
		int n = arr.length;
		int max = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main (String[] args) {
		int[] arr = {34, 64, 88, 102, 86, 4, 78};
		int n = arr.length;
		int max = largest(arr);
		System.out.print("largest element in the array: " + max);
	}
}
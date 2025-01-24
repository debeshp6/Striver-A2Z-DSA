import java.util.*;

public class tUf {

	public static int missingNumber(int[] arr) {

		int n = arr.length;
		int sum = 0;

		for(int i=0; i<n; i++) {
			sum += arr[i];
		}

		return n*(n+1)/2 - sum;
	}

	public static void main (String[] args) {
		int[] arr = {9,6,4,2,3,5,7,0,1};
		int pg = missingNumber(arr);
		System.out.print(pg);
	}
}
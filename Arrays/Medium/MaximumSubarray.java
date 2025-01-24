import java.util.*;

public class tUF {

	public static int maxSubarray(int[] arr) {
		int n = arr.length;
		int maxi = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];

			if(sum > maxi)
				maxi = sum;

			if(sum < 0)
				sum = 0;
		}

		return maxi;
	}

	public static void main (String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int max = maxSubarray(arr);
		System.out.print("maxium subarray: " + max);
	}
}
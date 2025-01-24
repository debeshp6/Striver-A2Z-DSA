import java.util.*;

public class tUF {

	public static int oneSingleElement(int[] arr) {

		int n = arr.length;
		int res = 0;

		for(int i=0; i<n; i++) {
			res = res ^ arr[i]; // using XOR here
		}

		return res;
	}

	public static void main (String[] args) {
		int[] arr = {4,1,2,1,2};
		int pg = oneSingleElement(arr);
		System.out.print(pg);
	}
}
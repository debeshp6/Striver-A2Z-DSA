import java.util.*;

public class tUf {

	public static boolean linearSearch(int[] arr, int k) {
		int n = arr.length;

		for(int i=0; i<n; i++) {
			if(arr[i] == k)
				return true;
		}

		return false;
	}

	public static void main (String[] args) {
		int[] arr = {1, 2, 4, 5, 6};
		int k = 3;
		System.out.print(linearSearch(arr,3));
	}
}
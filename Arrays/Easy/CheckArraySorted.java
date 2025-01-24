import java.util.*;

public class tUf {

	public static boolean isSorted(int[] arr) {
		int n = arr.length;
		int count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] > arr[(i+1) % n])
				count++;
			if(count>1) return false;
		}
		return true;
	}

	public static void main (String[] args) {
		int[] arr = {1,2,3};
		int n = arr.length;
		System.out.print(isSorted(arr));
	}
}
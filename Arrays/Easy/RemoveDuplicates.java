import java.util.*;

public class tUf {

	static int removeDuplicates(int[] arr) {
		int n = arr.length;
		int i = 0;
		for(int j=1; j<n; j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
	}

	public static void main (String[] args) {
		int arr[] = {1,1,2,2,3,3,4,4,5,5};
		int n = arr.length;
		System.out.print("array before removing duplicates: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("array after removing duplicates: ");
		int k = removeDuplicates(arr);
		for(int i=0; i<k; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
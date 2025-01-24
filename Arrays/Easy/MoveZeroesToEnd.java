import java.util.*;

public class tUf {

	public static void moveZeroes(int[] arr) {
		int zeroes = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) zeroes++;
			else if(zeroes > 0) {
				int temp = arr[i];
				arr[i] = 0;
				arr[i-zeroes] = temp;
			}
		}
	}
}
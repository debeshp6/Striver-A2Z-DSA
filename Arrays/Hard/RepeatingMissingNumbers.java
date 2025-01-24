/* Find the repeating and missing numbers.

Input Format: array[] = {3,1,2,5,3}
Result: {3,4)
Explanation: A = 3 , B = 4
Since 3 is appearing twice and 4 is missing. */





// return array process (coding ninjas)

public class Solution {
	public static int[] findMissingRepeatingNumbers(int []a) {
		// Write your code here
		long n = a.length;
		long expectedSum = (long) (n * (n+1)) / 2;
		long expectedSqrSum = (long) (n * (n+1) * (2*n+1)) / 6;

		long actualSum = 0, actualSqrSum = 0;
		for(int i=0; i<n; i++) {
			actualSum += a[i];
			actualSqrSum += (long) a[i] * a[i];
		}

		long x = actualSum - expectedSum;
		long y = (actualSqrSum - expectedSqrSum) / x;

		long X = (x + y) / 2;
		long Y = X - x;

		int[] ans = {(int) X, (int) Y};
		return ans;
	}
}




// return ArrayList process (GfG)

class Solution {

	ArrayList<Integer> findTwoElement(int arr[]) {

		ArrayList<Integer> ans = new ArrayList<>();
		long n = arr.length;

		long expectedSoln = (long) (n * (n+1)) / 2;
		long expectedSqrSoln = (long) (n * (n+1) * (2*n+1)) / 6;

		long actualSoln = 0, actualSqrSoln = 0;
		for(int i=0; i<n; i++) {
			actualSoln += arr[i];
			actualSqrSoln += (long) arr[i] * arr[i];
		}

		long x = actualSoln - expectedSoln;
		long y = (actualSqrSoln - expectedSqrSoln) / x;

		long X = (x+y) / 2;
		long Y = X - x;

		ans.add((int) X);
		ans.add((int) Y);

		return ans;
	}
}

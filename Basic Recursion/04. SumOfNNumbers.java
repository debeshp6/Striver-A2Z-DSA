/* Sum of first n terms.

Input: n = 5
Output: 225
Explanation: 1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 225 */

class Solution {
	int sumOfSeries(int n) {

		if(n <= 1) return n;
		return (int)Math.pow(n,3) + sumOfSeries(n-1);
	}
}



/* Given a number N, find out the sum of the first N natural numbers. */

class Solution {
	public static int sumOfSeries(int N) {
		int sum = 0;
		for(int i=1; i<=N; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main (String[] args) {
		int N = 5;
		System.out.print(sumOfSeries(N));
	}
}
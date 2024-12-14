/* Given a number n,  print its factorial. */

class Solution {

	public static int fact(int n) {
		if(n == 0) return 1;
		return n * fact(n-1);
	}

	public static void main (String[] args) {
		int n = 1;
		System.out.print(fact(n));
	}
}



/* Find all factorial numbers less than or equal to n.

Input: n = 3
Output: 1 2
Explanation: The first factorial number is 1 which is less than equal to n. The second number is 2 which is less than equal to n,but the third factorial number is 6 which is greater than n. So we print only 1 and 2.

Input: n = 6
Output: 1 2 6
Explanation: The first three factorial numbers are less than equal to n but the fourth factorial number 24 is greater than n. So we print only first three factorial numbers. */

class Solution {

	static long fact(long n) {
		if(n == 0) return 1;
		return n*fact(n-1);
	}

	static ArrayList<Long> factorialNumbers(long n) {
		long p = 1;
		ArrayList<Long> res = new ArrayList<>();
		while(fact(p) <= n) {
			res.add(fact(p));
			p++;
		}
		return res;
	}
}
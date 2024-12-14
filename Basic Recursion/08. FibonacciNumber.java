/* Fibonacci Number: Given n, calculate F(n).

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2. */

import java.util.*;

public class Solution {

	public static int fib(int n) {
		if(n <= 1) return n;
		return fib(n-1) + fib(n-2);
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		System.out.print("fibonacci: " + fib(n));
	}
}
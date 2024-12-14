/* Given a string s, return true if it is a palindrome, or false otherwise.

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome. */

import java.util.*;

public class Solution {

	public static boolean isPalindrome(String s) {

		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		int i = 0;
		int j = s.length()-1;
		
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j))
				return false;
				
			i++;
			j--;
		}
		return true;
	}

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the word: ");
		String s = sc.next();
		System.out.print(isPalindrome(s));
	}
}
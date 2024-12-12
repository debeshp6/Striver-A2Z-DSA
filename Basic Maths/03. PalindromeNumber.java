/* Given an integer N, return true if it is a palindrome else return false. */

import java.util.*;
public class TUF {
    public static void main (String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        n = sc.nextInt();
        int revNum = 0;
        int dup = n;
        while(n != 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n/10;
        }
        if(dup == revNum) {
            System.out.print("true"); // it's a palindrome
        } else {
            System.out.print("false"); // it's not a palindrome
        }
    }
}

/* Given an integer N return the reverse of the given number. */

import java.util.*;
public class TUF {
    public static void main (String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        n = sc.nextInt();
        int revNum = 0;
        while(n != 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n/10;
        }
        System.out.print("reverse will be: " + revNum);
    }
}

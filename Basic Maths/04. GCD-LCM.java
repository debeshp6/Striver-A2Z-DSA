/* Find GCD of two numbers. */

import java.util.*;
public class TUF {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first value: ");
        int a = sc.nextInt();
        System.out.print("enter the second value: ");
        int b = sc.nextInt();
        while(a>0 && b>0) {
            if (a>b) a = a%b;
            else b = b%a;
        }
        if(a == 0) System.out.print("GCD is: " + b);
        else System.out.print("GCD is: " + a);
    }
}



/* LCM And GCD together. */

class Solution {
    
    public static int gcd(int a, int b) {
        while(a>0 && b>0) {
            if(a>b) a = a%b;
            else b = b%a;
        }
        if(a == 0) return b;
        else return a;
    }
    
    public static int[] lcmAndGcd(int a, int b) {
        
        int gcd = gcd(a,b);
        int lcm = (a*b) / gcd;
        
        return new int[]{(int)lcm,gcd};
    }
}

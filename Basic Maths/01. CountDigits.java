/*

Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder).
Return the total number of such digits.

  A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
  Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.

Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.

Input: n = 23
Output: 0
Explanation: 2 and 3, none of them divide 23 evenly.

*/

class Solution {
    static int evenlyDivides(int n) {
        
        int num=n;
        int count=0;
        while(n>0){
            int lastD=n%10;
            n/=10;
            if(lastD>0 && num%lastD==0) count++;
        }
        return count;
    }
}

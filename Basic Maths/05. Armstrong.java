/* Check if a number is Armstrong Number or not. */

class Solution {
    static boolean armstrongNumber(int n) {
        
        int dup = n;
        int sum = 0;
        while(n>0) {
            int ld = n%10;
            sum = sum + (ld*ld*ld);
            n = n/10;
        }
      
        if(sum == dup) return true;
        else return false;
    }
}

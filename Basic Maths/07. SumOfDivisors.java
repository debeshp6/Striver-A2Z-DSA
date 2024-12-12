/* Sum of all divisors from 1 to n.

  Input: n = 4
  Output: 15
  Explanation:
  F(1) = 1
  F(2) = 1 + 2 = 3
  F(3) = 1 + 3 = 4
  F(4) = 1 + 2 + 4 = 7
  So, F(1) + F(2) + F(3) + F(4)
      = 1 + 3 + 4 + 7 = 15 */

class Solution {
    public static int sumOfDivisors(int n) {
       
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += (n/i)*i;
        }
      
        return sum;
    }
}

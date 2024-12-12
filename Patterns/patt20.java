/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

public class TUF {
    public static void main (String[] args) {
        
        int n = 5;
        
        // upper part
        for(int i=1; i<=n; i++) {
            
            // 1st part
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            
            // spaces
            int spaces = 2*(n-i);
            for(int j=0; j<spaces; j++) {
                System.out.print(" ");
            }
            
            // 2nd part
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        // lower part
        for(int i=n-1; i>=1; i--) {
            
            // 1st part
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            
            // spaces
            int spaces = 2*(n-i);
            for(int j=0; j<spaces; j++) {
                System.out.print(" ");
            }
            
            // 2nd part 
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

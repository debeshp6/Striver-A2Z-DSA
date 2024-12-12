/*

    *    
   ***   
  *****  
 ******* 
*********

*/

public class TUF {
    public static void main (String[] args) {
        
        int n = 5;
        
        for(int i=0; i<n; i++) {
            
            // left space
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            
            // print stars
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }            
            
            // right space
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}

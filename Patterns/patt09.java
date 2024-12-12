/*

    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *  

*/

public class TUF {
    public static void main (String[] args) {
        
        int n = 5;
        
        // upper part
        for(int i=0; i<n; i++) {
            
            // left spaces
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            
            // print stars
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            
            // right spaces
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        
        // lower part
        for(int i=0; i<n; i++) {
            
            // left spaces
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            
            //print stars
            for(int j=0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            
            // right spaces
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}

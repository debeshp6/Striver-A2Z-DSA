/*

A 
B B 
C C C 
D D D D 
E E E E E 

*/

public class TUF {
    public static void main (String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print((char)((int)('A'+i)) + " ");
            }
            System.out.println();
        }
    }
}

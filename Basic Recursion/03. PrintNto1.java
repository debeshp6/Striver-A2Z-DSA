/* Print N to 1 without loop. */

class Solution {

    void printNos(int N) {
        
        if(N == 0) return;
        
        if(N>=1) {
            System.out.print(N + " ");
        }
        
        N--;
        printNos(N);
    }
}
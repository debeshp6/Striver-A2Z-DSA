/* Print 1 To N Without Loop. */

class Print1toN {

    public void printNos(int n) {
        
        if(n <= 0) return;
        printNos(n-1);
        System.out.print(n + " ");
    }
}

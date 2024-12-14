/* Reverse an Array. [GFG Problem] */

class Solution {
    public void reverseArray(int arr[]) {
        
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start ++;
            end--;
        }
    }
}



/* Reverse an Array. */

public class Solution {
    
    public static void reverseArray(int[] arr, int start, int end) {
        if(start >= end) return;
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        reverseArray(arr, start+1, end-1);
    } 
    
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5};
        
        System.out.print("original array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        reverseArray(arr, 0, arr.length-1);
        System.out.print("\nreversed array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
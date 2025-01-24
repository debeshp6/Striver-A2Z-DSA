/* Sort an array of 0s, 1s and 2s */

import java.util.*;

public class tUF {
    
    public static void letsSort(int[] arr){
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
    
    public static void main (String[] args) {
        int arr[] = {1,0,2,0,1,2,0,1,0,2,2,1,0};
        letsSort(arr);
    }
    
}



// let,s try the same with ArrayList!

import java.util.*;

public class tUF {
    
    public static void sortArray(ArrayList<Integer> arr, int n) {
        
        int low = 0, mid = 0, high = n-1;
        
        while(mid <= high) {
            if(arr.get(mid) == 0) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            }
            
            else if(arr.get(mid) == 1) {
                mid++;
            }
            
            else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }
    
    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        System.out.print("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        sortArray(arr, n);
        System.out.print("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }
}
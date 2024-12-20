/* Frequencies of Limited Range Array Elements.

You are given an array arr[] containing positive integers. The elements in the array arr[] range from 1 to n (where n is the size of the array),
and some numbers may be repeated or absent. Your task is to count the frequency of all numbers in the range 1 to n and return an
array of size n such that result[i] represents the frequency of the number i (1-based indexing).

Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.

Input: arr[] = [3, 3, 3, 3]
Output: [0, 0, 4, 0]
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times. */

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        
        int n = arr.length;
        
        for(int i=0; i<n; i++) {
            arr[i]--;
        }
        
        for(int i=0; i<n; i++) {
            arr[arr[i] % n] += n;
        }
        
        for(int i=0; i<n; i++) {
            arr[i] /= n;
        }
        
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<n; i++) {
            ls.add(arr[i]);
        }
        
        return ls;
    }
}
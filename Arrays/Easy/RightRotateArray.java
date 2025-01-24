/* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4] */

import java.util.*;

public class tUf {
    
    static void reverse(int[] nums, int start, int end) {
        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        System.out.print("before rotating: ");
        for(int i=0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        System.out.print("after rotating: ");
        for(int i=0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
    public static void main (String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateRight(nums,k);
        
    }
}
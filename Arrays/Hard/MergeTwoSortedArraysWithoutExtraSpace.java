/* Merge two Sorted Arrays Without Extra Space.

Problem statement: Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order.
Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

Input:

n = 4, arr1[] = [1 4 8 10]
m = 5, arr2[] = [2 3 9]

Output:

arr1[] = [1 2 3 4]
arr2[] = [8 9 10]

Explanation: After merging the two non-decreasing arrays, we get, 1,2,3,4,8,9,10. */

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int left = m-1;
		int right = n-1;
		int alt = m + n - 1;

		while(left >= 0 && right >= 0) {
			if(nums1[left] > nums2[right]) {
				nums1[alt--] = nums1[left--];
			} else {
				nums1[alt--] = nums2[right--];
			}
		}

		while(right >= 0) {
			nums1[alt--] = nums2[right--];
		}
	}
}

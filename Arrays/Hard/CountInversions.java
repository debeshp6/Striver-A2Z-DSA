/* Count inversions in an array.

Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).

What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3). */


class Solution {
	// Function to count inversions in the array.
	public static int merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid+1;
		int cnt = 0;

		while (left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left++]);
			} else {
				temp.add(arr[right++]);
				cnt += (mid - left + 1);
			}
		}

		while(left <= mid) temp.add(arr[left++]);
		while(right <= high) temp.add(arr[right++]);
		for(int i=low; i<=high; i++) {
			arr[i] = temp.get(i-low);
		}

		return cnt;
	}

	public static int mergeSort(int[] arr, int low, int high) {
		int cnt = 0;
		if(low >= high) return cnt;
		int mid = (low + high) / 2;
		cnt += mergeSort(arr,low,mid);
		cnt += mergeSort(arr,mid+1,high);
		cnt += merge(arr,low,mid,high);
		return cnt;
	}

	static int inversionCount(int arr[]) {
		// Your Code Here
		int n = arr.length;
		return mergeSort(arr,0,n-1);
	}
}
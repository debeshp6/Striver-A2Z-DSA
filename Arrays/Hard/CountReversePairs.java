/* Count Reverse Pairs.

Problem Statement: Given an array of numbers, you need to return the count of reverse pairs.
Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].

Input: N = 5, array[] = {1,3,2,3,1)

Output: 2

Explanation: The pairs are (3, 1) and (3, 1) as from both the pairs the condition arr[i] > 2*arr[j] is satisfied. */

class Solution {

	public void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid+1;

		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left++]);
			} else {
				temp.add(arr[right++]);
			}
		}

		while(left <= mid) temp.add(arr[left++]);
		while(right <= high) temp.add(arr[right++]);
		for(int i=low; i<=high; i++) {
			arr[i] = temp.get(i-low);
		}
	}

	public int countPairs(int[] arr, int low, int mid, int high) {
		int right = mid + 1;
		int cnt = 0;
		for(int i=low; i<=mid; i++) {
			while(right <= high && (long) arr[i] > 2L * arr[right])
				right++;
			cnt += (right - (mid + 1));
		}
		return cnt;
	}

	public int mergeSort(int[] arr, int low, int high) {
		int cnt = 0;
		if(low >= high) return cnt;
		int mid = (low + high) / 2;
		cnt += mergeSort(arr,low,mid);
		cnt += mergeSort(arr,mid+1,high);
		cnt += countPairs(arr,low,mid,high);
		merge(arr,low,mid,high);
		return cnt;
	}

	public int reversePairs(int[] nums) {
		int n = nums.length;
		return mergeSort(nums, 0, n-1);
	}
}
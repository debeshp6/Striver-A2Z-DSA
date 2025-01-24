/* 4 Sum - Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target */

import java.util.*;

public class tUF {

	public static List<List<Integer>> fourSum(int[] arr, int target) {

		int n = arr.length;
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);

		for(int i=0; i<n; i++) {
			if(i > 0 && arr[i] == arr[i-1]) continue;
			for(int j=i+1; j<n; j++) {
				if(j > i+1 && arr[j] == arr[j-1]) continue;

				int k = j+1;
				int l = n-1;
				while(k < l) {
					long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
					if(sum == target) {
						List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
						ans.add(temp);
						k++;
						l--;
						while(k < l && arr[k] == arr[k-1]) k++;
						while(k < l && arr[l] == arr[l+1]) l--;
					}
					else if(sum < target) k++;
					else l--;
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
		List<List<Integer>> ans = fourSum(nums, target);
		System.out.println("The quadruplets are: ");
		for (List<Integer> it : ans) {
			System.out.print("[");
			for (int ele : it) {
				System.out.print(ele + " ");
			}
			System.out.print("] ");
		}
		System.out.println();
	}
}
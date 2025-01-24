/* Problem Statement: Given an array of intervals, merge all the overlapping intervals and return an array of non-overlapping intervals.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]

Output: [[1,6],[8,10],[15,18]]

Explanation:Since intervals [1,3] and [2,6] are overlapping we can merge them to form [1,6] intervals. */


class Solution {
	public int[][] merge(int[][] intervals) {

		int n = intervals.length;
		ArrayList<int[]> list = new ArrayList<>();

		if(n != 0 || intervals != null) {
			Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
			int start = intervals[0][0];
			int end = intervals[0][1];
			for(int[] i : intervals) {
				if(i[0] <= end)
					end = Math.max(end,i[1]);
				else {
					list.add(new int[] {start,end});
					start = i[0];
					end = i[1];
				}
			}

			list.add(new int[] {start,end});
		}

		return list.toArray(new int[0][]);
	}
}
/* Pascal's Triangle

      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1      */

import java.util.*;

public class tUF {

	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> ans = new ArrayList<>();

		for(int i=0; i<numRows; i++) {
			List<Integer> rows = new ArrayList<>();
			int num = 1;
			for(int j=0; j<=i; j++) {
				rows.add(num);
				num = num * (i-j) / (j+1);
			}

			ans.add(rows);
		}

		return ans;
	}

	public static void main (String[] args) {
		int numRows = 5;
		System.out.print(generate(numRows));
	}
}
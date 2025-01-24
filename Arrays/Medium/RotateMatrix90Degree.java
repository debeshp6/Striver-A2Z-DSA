/* Rotate Image / Rotate Matrix by 90 degree.

Step 1: Transpose the matrix. (transposing means changing columns to rows and rows to columns)
Step 2: Reverse each row of the matrix. */

import java.util.*;

public class tUF {

	public static void rotate(int[][] matrix) {

		int n = matrix.length; // row length
		int m = matrix[0].length; // column length

		for(int i=0; i<n; i++) {
			for(int j=i; j<m; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for(int i=0; i<n; i++) {
			for(int j=0; j<n/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-j-1];
				matrix[i][n-j-1] = temp;
			}
		}
	}

	public static void main(String args[]) {
		int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		rotate(arr);
		System.out.println("rotated image");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
public class SpiralOrderMatrix {

	/*
	 * Traverse first row Traverse last column Traverse last row Traverse first
	 * column
	 */

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		spiral_matrix(matrix, 4, 5);
	}

	static void spiral_matrix(int[][] matrix, int row, int col) {
		int r = 0, k = 0, l = 0;
		int last_row = row - 1;
		int last_col = col - 1;

		while (k <= last_row && l <= last_col) {

			// Print First row
			for (int i = l; i <= last_col; i++) {
				System.out.print(matrix[k][i] + " ");
			}
			k++;

			// Print Last Column
			for (int i = k; i <= last_row; i++) {
				System.out.print(matrix[i][last_col] + " ");
			}
			last_col--;

			// Print Last Row
			for (int i = last_col; i >= l; i--) {
				System.out.print(matrix[last_row][i] + " ");
			}
			last_row--;

			// Print First Column
			for (int i = last_row; i >= k; i--) {
				System.out.print(matrix[i][l] + " ");
			}
			l++;
		}
	}

}

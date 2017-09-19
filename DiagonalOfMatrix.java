public class DiagonalOfMatrix {
	public static void main(String[] args) {

		char[][] matrix = { { 'a', 'b', 'c', 'd', 'e' },
				{ 'f', 'g', 'h', 'i', 'j' }, { 'k', 'l', 'm', 'n', 'o' },
				{ 'p', 'q', 'r', 's', 't' } };

		printDiagonals(matrix, 4, 5);

	}

	public static void printDiagonals(char[][] matrix, int row, int col) {
		// Print Diagonals started from first column
		for (int k = 0; k < row; k++) {
			int i = k;
			int j = 0;
			while (i >= 0) {
				System.out.print(matrix[i][j] + " --> ");
				i--;
				j++;
			}
			System.out.println();
		}
		// Print Diagonals started from last row
		for (int l = 1; l < col; l++) {
			int i = row - 1;
			int j = l;

			while (j < col) {
				System.out.print(matrix[i][j] + "--> ");
				i--;
				j++;
			}
			System.out.println();
		}
	}
}

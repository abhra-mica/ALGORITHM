public class SearchElementInSortedMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 10, 20, 30, 40 }, { 12, 22, 33, 45 },
				{ 14, 24, 44, 47 }, { 16, 26, 46, 50 } };
		System.out.println(searchElement(matrix, 24));
	}

	static String searchElement(int[][] matrix, int element) {
		int i = 0;
		int j = matrix[0].length - 1;

		while (i < matrix.length && j >= 0) {
			if (matrix[i][j] == element)
				return "[" + i + "," + j + "]";

			else if (element < matrix[i][j])
				j--;
			else
				i++;
		}
		return "element doesn't exist";
	}
}

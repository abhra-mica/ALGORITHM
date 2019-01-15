public class TowerOfHanoi {

	public static void main(String[] args) {

		moves(3, 1, 2, 3);
	}

	public static void moves(int n, int a, int b, int c) {
		if (n > 0) {
			moves(n - 1, a, c, b);
			System.out.println("move one disc from tower " + a + " to " + c);
			moves(n - 1, b, a, c);
		}
	}
}

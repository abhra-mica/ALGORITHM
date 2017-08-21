public class SieveOfEratosthenes{

	public static void main(String[] args) {
		sieveOfEratosthenes(50);
	}

	public static void sieveOfEratosthenes(int n) {
		// Array to decide prime numbers
		boolean[] arr = new boolean[n + 1];

		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int y = i * 2; y <= n; y = y + i) {
				arr[y] = true;
			}
		}

		for (int i = 2; i <= n; i++) {
			if (arr[i] == false)
				System.out.print(i + " ");
		}
	}
}

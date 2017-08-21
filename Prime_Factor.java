public class PrimeNumbers {
		public static void main(String[] args) {
		int n = 514;
		primeFactors(n);
	}
	public static void primeFactors(int n) {
		// Numbers of 2s printed
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}

		// This portion comes when factors will be odd only
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			// This code snippet to check for the numbers of same odd prime
			// numbers
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}

		// After all this will check for the rest prime number which is greated
		// than 2 because at this moment prime number can't be 1
		if (n > 2)
			System.out.print(n);
	}
}

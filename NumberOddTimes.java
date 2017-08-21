public class NumberOddTimes {
	public static void main(String[] args) {

		oddNumber(new int[] { 2, 6, 5, 6, 5, 6, 5, 2, 5 });
	}

	public static void oddNumber(int[] arr) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			x ^= arr[i];
		}
		System.out.println("Odd Number-- " + x);
	}
}

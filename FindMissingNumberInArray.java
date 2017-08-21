public class FindMissingNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5 };
		missingNum(arr);
	}

	public static void missingNum(int[] arr) {
		int x1 = 0;
		int x2 = 0;
		// xor elements of array
		for (int i = 0; i < arr.length; i++)
			x1 = x1 ^ arr[i];
		// xor elements of the range
		for (int i = 1; i <= arr.length + 1; i++)
			x2 = x2 ^ i;
		System.out.println(x1 ^ x2);
	}
}

public class NextGreatestElement {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 20, 6, 15, 2, 1, 7 };
		int max_from_right = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			if (max_from_right > arr[i])
				arr[i] = max_from_right;
			else
				max_from_right = arr[i];
		}

		for (int i : arr)
			System.out.print(i + " ");
	}
}

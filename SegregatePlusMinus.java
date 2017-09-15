public class SegregatePlusMinus {
	public static void main(String[] args) {
		int[] arr = { -1, 3, 8, -4, 5, -6, 7, -20, 30, 40 };
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			// This start<end is required, otherwise after checking of
			// start<end from outer loop,in inner loops start can greater
			// than end and we get stale data
			while (arr[start] < 0 && start < end)
				start++;

			while (arr[end] > 0 && start < end)
				end--;

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}

		for (int i : arr)
			System.out.print(i + " ");
	}
}

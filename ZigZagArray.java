public class ZigZagArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 2, 1, 8, 9 };
		int flag = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (flag == 0) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				flag = 1;
				continue;
			}

			if (flag == 1) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				flag = 0;
				continue;
			}
		}

		for (int i : arr)
			System.out.print(i + " ");

	}
}

/* Arrange array in such a way that every > and < elements occurs alternatively */
public class ArrayInWave {
	public static void main(String[] args) {

		int[] arr = { 5, 3, 12, 2, 6, 10, 7, 9, 8 };

		for (int i = 0; i < arr.length - 2; i++) {
			// Here nested if block is provided otherwise result become wrong when array
			// will be in 3,12,2,6,5,10,7,9,8 modified stage,5 and 10 will swap in the else
			// block.Which is wrong.
			if (i % 2 == 0) {// This decide the index against which we can maintain array wave form.
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else if (arr[i] < arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;

			}
		}

		for (int i : arr)
			System.out.print(i + " ");
	}
}

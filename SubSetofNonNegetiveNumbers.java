public class SubSetofNonNegetiveNumbers {
	public static void main(String[] args) {
		int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };

		int start = 0;
		int curr_sum = arr[0];
		int sum = 23;

		for (int i = 1; i < arr.length; i++) {

			while (curr_sum > sum && start <= i) {
				curr_sum = curr_sum - arr[start];
				start++;
			}

			if (curr_sum == sum) {
				System.out.println(" Subset present between " + start + " to "
						+ (i - 1));
			}

			curr_sum = curr_sum + arr[i];
			// Below while loop is provided when the last element has reached
			// then we reduce the start position one by one until it will reach
			// end until current sum >sum
			while (i == arr.length - 1 && curr_sum > sum && start <= i) {
				curr_sum = curr_sum - arr[start];
				start++;
				if (curr_sum == sum) {
					System.out.println(" Subset present between " + start
							+ " to " + i);
				}
			}

		}

	}
}

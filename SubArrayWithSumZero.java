import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumZero {
	public static void main(String[] args) {

		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };

		// This Map holds sum as key and and it's index
		Map<Integer, Integer> sum_hashtable = new HashMap<>();
		int sum = 0;

		int maxLength = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum_hashtable.containsKey(sum)) {
				int length = i - sum_hashtable.get(sum);
				if (maxLength < length) {
					maxLength = length;
					start = sum_hashtable.get(sum);
					end = i;
				}
			} else {
				sum_hashtable.put(sum, i);
			}
		}

		System.out
				.println("Max Length of Subarray Forming zero - " + maxLength);
		for (int i = start + 1; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}

		// System.out.println(zeroSumMap);
	}
}

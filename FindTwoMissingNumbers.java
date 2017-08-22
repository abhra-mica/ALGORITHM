public class FindTwoMissingNumbers {

	public static void main(String[] args) {

		linearWay(new int[] { 1, 3, 5, 6 }, 6);

	}

	// It is an extended approach of find one missing number from an array
	public static void linearWay(int[] arr, int n) {
		int arr_sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr_sum += arr[i];
		}

		int sum_missingNum = n * (n + 1) / 2 - arr_sum;
		int avg_missingNum = sum_missingNum / 2;
		int sum_element_less_avg = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= avg_missingNum)
				sum_element_less_avg += arr[i];
		}

		int sum_1toavg = avg_missingNum * (avg_missingNum + 1) / 2;
		int first_missingNum = sum_1toavg - sum_element_less_avg;

		System.out.println("First Missing Number: " + first_missingNum);

		// Sum of natural numbers from avg+1 to n
		int sum = n * (n + 1) / 2 - sum_1toavg;

		// Sum of elements greater than average
		int sum_greaterAvg = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg_missingNum) {
				sum_greaterAvg += arr[i];
			}
		}
		int secondMissingNum = sum - sum_greaterAvg;
		System.out.println("Second Missing Number: " + secondMissingNum);

	}
}

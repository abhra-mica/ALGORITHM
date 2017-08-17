public class MajorityElementInArray {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 4, 5, 0, 2,2,2,2,2,2,2,2 };

		System.out.println(majorityElement(arr));
	}

	public static String majorityElement(int[] arr) {
		int candidate = 0;
		int count = 0;

		// Below for loop to find out the candidate which is the majority element
		for (int i = 0; i < arr.length; i++) {
			if (count == 0) {
				candidate = arr[i];
				count++;
				continue;
			} else if (candidate == arr[i])
				count++;
			else {
				count--;
			}
		}

		//This loop is to validate the majority element
		for (int i = 0; i < arr.length; i++) {
			if (candidate == arr[i])
				count++;
			if (count > arr.length / 2) {
				return " Majority Element in the array is : " + candidate;
			}
		}
		return "No Majority Element in the Array";
	}
}

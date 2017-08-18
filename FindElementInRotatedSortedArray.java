public class FindElementInRotatedSortedArray {
	public static void main(String[] args) {
		int[] arr = { 14, 12, 11, 10, 2, 3, 4, 6, 8, 9 };
		System.out.println(findELement(arr, 6));
	}

	public static int findELement(int[] arr, int element) {
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			int mid = (low + high) / 2;

			if (arr[mid] == element)
				return mid;
			// if right side of the middle element is sorted
			if (arr[mid] < arr[high]) {
				if (element > arr[mid] && element <= arr[high]) {
					low = mid + 1; // if element present in the right side
				} else {
					high = mid - 1; // if element not present in the right side
				}
			}
			// if left side of the middle element is sorted
			if (arr[mid] > arr[low]) {
				if (element >= arr[low] && element < arr[mid]) {
					high = mid - 1; // if element present in the left side
				} else {
					low = mid + 1;// if element not present in the left side
				}
			}
		}
		return -1;
	}
}

/*How many times a sorted array been rotated*/
public class RotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 10, 2, 3, 5, 8, 9 };
		System.out.println(arrayRotated(arr));
	}

	public static int arrayRotated(int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			//It will possible when the array between low and high is sorted
			if (arr[low] < arr[high]) {
				return low;
			}
			int mid = (low + high) / 2;
			if (arr[mid] < arr[mid + 1] && arr[mid] < arr[mid - 1]) {//The Pivot element
				return mid;
			} else if (arr[mid] < arr[high]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}

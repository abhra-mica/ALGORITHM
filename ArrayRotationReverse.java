public class ArrayRotationReverse {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int rotation = 3;
		rotateArray(arr, rotation);
		for (int i : arr)
			System.out.print(i + " ");

	}

	public static void rotateArray(int[] arr, int rotation) {
		reverseArr(arr, 0, arr.length - 1 - rotation);
		reverseArr(arr, arr.length - rotation, arr.length - 1);
		reverseArr(arr, 0, arr.length - 1);
	}

	public static void reverseArr(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}

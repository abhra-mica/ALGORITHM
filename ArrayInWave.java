public class ArrayInWave {
	public static void main(String[] args) {

		int[] arr = { 5, 3, 12, 2, 6, 10, 7, 9, 8 };

		for (int i = 0; i < arr.length - 2; i++) {
			if (i % 2 == 0) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}

		for(int i:arr)
			System.out.print(i +" ");
	}
}

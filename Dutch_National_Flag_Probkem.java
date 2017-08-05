/*Segregate 0'1, 1's and 2's from an array
 */
public class Dutch_National_Flag_Problem {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1,2 };

		int low = 0, high = arr.length - 1, mid = 0;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0:
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;

			case 2:
				int temp1 = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp1;
				high--;
				break;
			}
		}
		
		for(int i : arr)
			System.out.print(i +" ");
	}

}

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumZero {
	public static void main(String[] args) {

		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };

		// This Map holds sum as key and and it's index
		Map<Integer, Integer> sum_hashtable = new HashMap<>();
		int sum = arr[0];
		sum_hashtable.put(sum, 0);

		// This map is for holding sub array length as key and start and end
		// index as value
		Map<Integer, String> zeroSumMap = new HashMap<>();

		for (int i = 1; i < arr.length; i++) {
			sum = sum + arr[i];

			if (sum_hashtable.containsKey(sum)) {
				int startIndex = sum_hashtable.get(sum);
				zeroSumMap.put(i - startIndex - 1, "Start index= " +( startIndex
						+ 1 )+ " End Index= " + i);
			}
			sum_hashtable.put(sum, i);
		}

		System.out.println(zeroSumMap);
	}
}

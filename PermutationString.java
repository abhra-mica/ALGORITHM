public class PermutationString {
	public static void main(String[] args) {
		permute("ABC", 0, 2);
	}

	public static String swap(String s, int i, int j) {
		char temp;
		char[] charArr = s.toCharArray();
		temp = charArr[i];
		charArr[i] = charArr[j];
		charArr[j] = temp;
		return String.valueOf(charArr);
	}

	public static void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}

	}
}

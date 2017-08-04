public class UniqueCharacterInString {
	public static void main(String[] args) {
		String str = "abcdefsredgebc";
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}
}

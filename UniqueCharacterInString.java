public class UniqueCharacterInString {
	public static void main(String[] args) {
		String str = "abcdefsredgebc";
		for (int i = 0; i < str.length(); i++) {
			//Index of returns first occurance of char and lastIndexOf returns last index of char.If 
			//these two returns values are same then characters exists only one time.
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}
}

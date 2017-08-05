import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*Find the first non reapeating character in an array
 * Ans:-  1> We can take a LinkedHashMap and store numbers as Key and numbers count as value.Then traverse the map and when found value 
 * 1 that will be the first non-repeating character. But one problem is here.We have to traverse the array once and the map once.So
 * 2O(n) time complexity
 * 
 * 2> We use one ArrayList and one stack.
 * 
 * */
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String s = "geeks for geeks";
		System.out.println(firstChar(s));
	}

	static char firstChar(String s) {
		ArrayList<Character> list = new ArrayList<>();
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++) {
			if (!list.contains(s.charAt(i)) && !set.contains(s.charAt(i))) {
				list.add(s.charAt(i));
			} else if (list.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				list.remove((Character) s.charAt(i)); // Here without specifically type casting remove(int i) is invoking									 
			}
		}
		return list.get(1);
	}
}

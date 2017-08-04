import java.util.Set;
import java.util.TreeSet;

public class CommomCharInTwoStrings {
	public static void main(String[] args) {
		String s1 = "abcdefgh";
		String s2 = "bdfglkknhui";

		boolean[] occ = new boolean[26];

		for (int i = 0; i < s1.length(); i++) {
			occ[s1.charAt(i) % 97] = true;
		}

		Set<Character> set = new TreeSet<>();
		for (int i = 0; i < s2.length(); i++) {
			if (occ[s2.charAt(i) % 97] == true) {
				set.add(s2.charAt(i));
			}
		}

		for (char s : set) {
			System.out.print(s+ " ");
		}
	}
}

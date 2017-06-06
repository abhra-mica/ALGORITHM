/*Test an arithmatic expression is valid or not */

package interview_coding.Oben;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
		String exp = " [ { ( ) } ) ]";
		System.out.println(isValidParenthesis(exp));
	}

	static boolean isValidParenthesis(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			} else if (ch == ']') {
				if (stack.pop() != '[')
					return false;
			} else if (ch == '}') {
				if (stack.pop() != '{')
					return false;
			} else if (ch == ')') {
				if (stack.pop() != '(')
					return false;
			}
		}
		return true;
	}
}

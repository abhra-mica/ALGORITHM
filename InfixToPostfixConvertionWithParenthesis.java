package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfixConvertionWithParenthesis {
	static Map<Character, Integer> operatorPresedence = new HashMap<>();

	public static void main(String[] args) {
		operatorPresedence.put('-', 1);
		operatorPresedence.put('+', 2);
		operatorPresedence.put('/', 3);
		operatorPresedence.put('*', 4);

		String infixExpression = "((A+B)*C-D)*E";
		StringBuilder postfixExpressionWithParenthesis = new StringBuilder();

		Stack<Character> operatorsAndParenthesis = new Stack<>();

		int index = 0;
		while (index < infixExpression.length()) {
			char key = infixExpression.charAt(index);
			if (key == '(') {
				operatorsAndParenthesis.push(key);
			} else if (key == ')') {
				while (operatorsAndParenthesis.peek() != '(') {
					postfixExpressionWithParenthesis.append(operatorsAndParenthesis.pop());
				}
				operatorsAndParenthesis.pop();
			} else if (operatorPresedence.get(key) == null) {// This means it is operand because it
				// will be null when the character is
				// not present in the map as a key

				postfixExpressionWithParenthesis.append(key);
			} else {// For operators
				while (!operatorsAndParenthesis.isEmpty() && operatorsAndParenthesis.peek() != '(') {
					if (operatorPresedence.get(operatorsAndParenthesis.peek()) > operatorPresedence.get(key)) {
						postfixExpressionWithParenthesis.append(operatorsAndParenthesis.pop());
					} else {
						operatorsAndParenthesis.push(key);
						break;
					}
				}

				if ( operatorsAndParenthesis.isEmpty() || operatorsAndParenthesis.peek() == '(') {
					operatorsAndParenthesis.push(key);
				}
			}

			index++;
		}

		// End of infix expression some operators can be present in stack which need to
		// append
		while (!operatorsAndParenthesis.isEmpty()) {
			postfixExpressionWithParenthesis.append(operatorsAndParenthesis.pop());
		}

		System.out.println("Postfix Expression: " + postfixExpressionWithParenthesis);
	}
}

package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.swing.text.Position;

public class InfixToPostfixConvertionWithoutParenthesis {

	static Map<Character, Integer> operatorPresedence = new HashMap<>();

	public static void main(String[] args) {
		operatorPresedence.put('-', 1);
		operatorPresedence.put('+', 2);
		operatorPresedence.put('/', 3);
		operatorPresedence.put('*', 4);

		String infixExpression = "A+B*C-D*E";
		StringBuilder postfixExpression = new StringBuilder();

		Stack<Character> operators = new Stack<>();

		// operands.push(infixExpression.charAt(0));// First character will be always an
		// operands
		int index = 0;
		while (index < infixExpression.length()) {
			char key = infixExpression.charAt(index);
			if (operatorPresedence.get(key) == null) {// This means it is operand because it
														// will be null when the character is
														// not present in the map as a key

				postfixExpression.append(key);
			} else {
				while (!operators.isEmpty()) {
					if (operatorPresedence.get(operators.peek()) > operatorPresedence.get(key)) {
						postfixExpression.append(operators.pop());
					} else {
						operators.push(key);
						break;
					}
				}
				if (operators.isEmpty()) {// When stack become empty then need to push operator
					operators.push(key);
				}
			}

			index++;
		}

		// End of infix expression some operators can be present in stack which need to
		// append
		while (!operators.isEmpty()) {
			postfixExpression.append(operators.pop());
		}

		System.out.println("Postfix Expression: " + postfixExpression);
	}
}

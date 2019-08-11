package algorithm;

import java.util.Stack;

public class PostfixExpressionEvaluation {

	public static void main(String[] args) {
		String expression = "2 3 * 5 4 * + 9 -";

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {

			char c = expression.charAt(i);
			if (c == ' ')
				continue;

			if (Character.isDigit(c)) {
				stack.push(Character.getNumericValue(c));//To convert character in integer
			} else {
				int operand1 = stack.pop();
				int operand2 = stack.pop();

				switch (c) {
				case '+':
					stack.push(operand2 + operand1);
					break;
				case '-':
					stack.push(operand2 - operand1);
					break;
				case '*':
					stack.push(operand2 * operand1);
					break;
				case '/':
					stack.push(operand2 / operand1);
					break;
				}
			}
		}

		System.out.println("Calculated Value: " + stack.pop());
	}
}

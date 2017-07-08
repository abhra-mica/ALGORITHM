package youtube;

import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) {

		int[] arr = { 5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4 };
		Stack<Integer> stack = new Stack<Integer>();

		int i = 0;
		while (i < arr.length) {

			while (!stack.empty() && stack.peek() < arr[i])
				System.out.println(stack.pop() + " --Next greater element -- "
						+ arr[i]);

			while (stack.empty() || stack.peek() >= arr[i]) {
				stack.push(arr[i]);
				break;
			}
			i++;
		}

		while (!stack.empty())
			System.out.println(stack.pop() + "--Next greater element -- NA");
	}
}

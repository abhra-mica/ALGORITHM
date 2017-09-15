import java.util.Stack;

public class MinEleFromStack {
	private static Stack<Integer> original = new Stack<>();
	private static Stack<Integer> support = new Stack<>();

	public static void main(String[] args) {

		push(50);
		push(40);
		push(35);
		System.out.println("Min ele in this moment: " + support.peek());
		push(55);
		push(37);
		push(20);
		System.out.println("Min ele in this moment: " + support.peek());
		pop();
		pop();
		push(60);
		pop();
		push(10);
		System.out.println("Min ele in this moment: " + support.peek());
	}

	public static void push(int element) {
		original.add(element);
		if (support.isEmpty() || support.peek() > element)
			support.add(element);
	}

	public static void pop() {
		int popedEle = original.pop();
		if (popedEle == support.peek())
			support.pop();
	}
}

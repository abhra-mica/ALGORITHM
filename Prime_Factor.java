import java.util.Scanner;
public class Prime_Factor {
	public static void main(String[] args) {
		int pr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53 };

		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		int count = 0;
		long x = pr[0];
		for (int i = 1; i < pr.length; i++) {
			if (x > num)
				break;
			count++;
			x = x * pr[i];
		}
		System.out.println(count);
	}
}

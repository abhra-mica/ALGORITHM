/*Problem : Andrea and Maria has given two array of integer.Andrea want to channge her array
to match it like Maria array.But she can change one digit at a time by increasing or decreasing 
it by one.
Example : Andrea 143 , Maria 333 
So Andrea need 3 moves to convert  243 ->343 ->333

Input : 
	Enter no of arrays -- 
	2
	Enter array elments for Andrea == 
	1 2 3 4 
	4 3 2 1
	Enter array elments for Maria == 
	2 3 4 5
	3 2 1 4

	output -- 
	Shortest Move is -- 10 
	1234 to 2345 4 moves 
	4321 to 3214 6 moves
	Explanation:
	total 10 moves */

package interview_coding.Mphasis;

import java.util.Scanner;

public class Minimum_Moves {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of arrays -- ");
		int noOfArrays = sc.nextInt();

		int[][] andreaArrays = new int[noOfArrays][4];
		int[][] mariaArrays = new int[noOfArrays][4];

		System.out.println("Enter array elments for Andrea == ");
		for (int i = 0; i < noOfArrays; i++) {
			for (int j = 0; j < 4; j++) {
				andreaArrays[i][j] = sc.nextInt();
			}

		}
		System.out.println("Enter array elments for Maria == ");
		for (int i = 0; i < noOfArrays; i++) {
			for (int j = 0; j < 4; j++) {
				mariaArrays[i][j] = sc.nextInt();
			}
		}

		int count = 0;

		for (int i = 0; i < noOfArrays; i++) {
			for (int j = 0; j < 4; j++) {
				count += mod(andreaArrays[i][j] - mariaArrays[i][j]);
			}
		}
		System.out.println("Shortest Move is -- " + count);
	}

	static int mod(int a) {
		if (a >= 0)
			return a;
		else
			return a * -1;
	}
}

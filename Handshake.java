/*In a party n number of guests are available.How many no. of handshake will happens between them.
Ans:-One guest handshake with exactly n-1 no. of guests.So all individuals guests will handshake with other n-1 no. of guests.
So total n*(n-1) no. of handshaking will happens.Now A handshakes with B and B handshakes with A is same.
So total no. of handshakes is n*(n-1)/2.*/

public class Handshake {
	public static void main(String[] args) {
		int guestNo = 5;
		System.out.println("Total No of handshake -- " + guestNo
				* (guestNo - 1) / 2);
	}
}

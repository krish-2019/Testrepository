package primenumber;

import java.util.Scanner;

public class Clprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sn Integer number to find prime number:  ");
		int a = s.nextInt();
		int b = 1;
		int i = 0;
		int flg = 0;
		if (a == 1 ) {
			System.out.println("Given number " + a + " is not prime number" );
		}
		if (a == 2) {
			System.out.println("Given number " + a + " is prime number" );
		}
		if (a > 2) {
			for (i=2; i< a ; i++) {
				b = a % i;
				if (b == 0) {
					flg = 1;
					break;
				}
			}
			if (flg == 0) {
				System.out.println("Given number " + a + " is prime number" );	
			}
			else
				System.out.println("Given number " + a + " is not prime number");
		}
	}
}

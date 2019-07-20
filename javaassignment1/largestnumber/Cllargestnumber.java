package largestnumber;

import java.util.Scanner;

public class Cllargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Integer number:  ");
		int A = s.nextInt();
		System.out.println("Enter second Integer number:  ");
		int B = s.nextInt();
		System.out.println("Enter third Integer number:  ");
		int C = s.nextInt();

		if (A > B && A > C) {
			System.out.println("Largest Number is: " + A);
		}
		else if ( B>C){
			System.out.println("Largest Number is: " + B);
		}
		else
			System.out.println("Largest Number is: " + C );

	}

}

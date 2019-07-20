package reversenumber;

import java.util.Scanner;

public class Clreversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sn Integer number to reverse:  ");
		int a = s.nextInt();
		int b = 0;
			
		while (a != 0) {
			b = b * 10;
			b = b + a % 10;
			
			a = a / 10;
		}
		System.out.println("Reversed number is " + b);
	}
}

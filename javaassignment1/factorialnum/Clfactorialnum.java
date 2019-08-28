package factorialnum;

import java.util.Scanner;

public class Clfactorialnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 1;
		int factinput = 5;
		int factout = 1;
		System.out.print("Input Number : " );
		factinput = s.nextInt();
		while (i <= factinput) {
			factout = factout * i;
			i++;
		}
		System.out.println("Factorial " + factout + " is for Number " + factinput);
		
	}

}

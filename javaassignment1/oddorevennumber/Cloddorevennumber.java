package oddorevennumber;

import java.util.Scanner;

public class Cloddorevennumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Odd or Even Number  ");
		int A = s.nextInt();
        int b = 0;
        
        b = A % 2 ;
        
        if (b == 0 ) {
        	System.out.println("Given number " + A + " is Even Number");	
        }
        else {
             	System.out.println("Given number " + A + " is Odd Number");
        }
		
	}

}

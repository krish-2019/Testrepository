package swapnumbers;

public class Clswapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 40;
		int num2 = 50;
		System.out.println("Before Swapping");
		System.out.println("Value of num1 is :" + num1);
		System.out.println("Value of num2 is :" +num2);
		
		num1 = num1 + num2;             //add both the numbers and assign it to first
		num2 = num1 - num2;             
		num1 = num1 - num2;             
		
		System.out.println("After Swapping");
		System.out.println("Value of num1 is :" + num1);
		System.out.println("Value of num2 is :" +num2);
	}

}

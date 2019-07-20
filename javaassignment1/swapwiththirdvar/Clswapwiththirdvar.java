package swapwiththirdvar;

public class Clswapwiththirdvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 40;
		int num2 = 50;
		int C = 0;
		System.out.println("Before Swapping");
		System.out.println("Value of num1 is :" + num1);
		System.out.println("Value of num2 is :" +num2);
		
		C = num1;
		num1 = num2;
		num2 = C;           
		
		System.out.println("After Swapping");
		System.out.println("Value of num1 is :" + num1);
		System.out.println("Value of num2 is :" +num2);
	}

}

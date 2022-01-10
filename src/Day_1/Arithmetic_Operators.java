package Day_1;

public class Arithmetic_Operators {

	public static void main(String args[])
	{
		int a = 10;
		int b = 12;
		// +, -, *, /, %
		int sum = a+b;
		System.out.println("a + b = " + sum); // 22
		int sub = a-b;
		System.out.println("a - b = " + sub); // -2
		int mul = a*b;
		System.out.println("a * b = " + mul); // 120
		int div = a/b;
		System.out.println("a / b = " + div); // 0
		int mod = a%b;
		System.out.println("a % b = " + mod); // 10
	}
}

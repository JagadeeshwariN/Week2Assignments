package week2.day1;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int n = 5;
		System.out.println("Fibonacci series of number " + n + " is :" );
		for (int i=1; i<=n ; i++)
		
		{
			System.out.print(num1 + " " );
			int sum= num1 + num2;
			num1= num2;
			num2 = sum;
		}

	}

}

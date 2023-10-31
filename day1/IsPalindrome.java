package week2.day1;

public class IsPalindrome {

	public static void main(String[] args) {
		int input = 12221;
		int output=0;
       	  
    	System.out.println("Input Number : " + input);
		
    	for (int i = input; i >0 ; i=i/10)
		{
			
		  int remainder= i%10;
		  output = (output*10)+ remainder;
		
		}
		System.out.println("Output Number: " +output);
		if (input == output)
		{
			
			System.out.println("The given number " + input + " is a palindrome");
		}

		else 
		{
			System.out.println("The given number " + input + " is not a palindrome");
		}
	}

}



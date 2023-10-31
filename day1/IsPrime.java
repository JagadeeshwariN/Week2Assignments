package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
   
		int n=9;
		boolean flag = false;
		
		System.out.println("To find the given number is a Prime");
		for (int i=2; i<n; i++)
		{
			if (n%i ==0 )
			{
		
				flag= true;
				
			}
		}
		if(flag==true)
		{
				System.out.println(n + " is not a prime number");
		
			}
			else
				System.out.println(n + "  is a prime number");
		}
		

	}


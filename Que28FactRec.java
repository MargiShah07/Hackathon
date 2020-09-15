import java.util.Scanner;

public class Que28FactRec 
{
	static int factorial(int b)
	{
		int c;
		if(b==1)
		{
		return 1;
		}
		c=factorial(b-1)*b;
		return c;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = s.nextInt();
		int f = factorial(a);
		System.out.println("Factorial of number " +a+ "is: " + f);
	}
}

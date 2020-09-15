import java.util.Scanner;

public class Que2factorial {

	public static void main(String[] args) 
	{
		int a;
		Scanner s =new Scanner(System.in);
		System.out.println("enter number: ");
		a = s.nextInt();
		int f=1;
		for(int i = 1;i<=a; i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of number is: " +f);

	}
}
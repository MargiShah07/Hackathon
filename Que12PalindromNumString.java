import java.util.Scanner;

public class Que12PalindromNumString 
{

	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=s.nextLine();
		int n=str.length();
		String str1="";
		for (int i = n-1; i >=0; i--)
		{
	         str1 = str1+str.charAt(i);
	    }
		if(str.equals(str1))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}

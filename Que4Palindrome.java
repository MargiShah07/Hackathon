import java.util.Scanner;

public class Que4Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of an Array: ");
		int arrlen = s.nextInt();
		int[] arr = new int[arrlen];
		System.out.println("Provide the numbers for palindrome: ");
		for(int i=0;i<arrlen;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for (int i = 0; i < arrlen/2; i++)
		{
			if (arr[i] == arr[arrlen-1-i])
	        {
	          System.out.println("Array is palindrome");
	        }
	        else
	        {
	        	System.out.println("Array is not palindrome");
	        }
	    }
	}

}

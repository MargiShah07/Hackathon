import java.util.Scanner;

public class Qu17TotalNum {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		int uppercase = 0;
		int lowercase = 0;
		int numbers = 0;

		for(int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
			{
				
				uppercase++;
			}
			else if (ch >= 'a' && ch <= 'z')
			{
				lowercase++;
			}
			
			// if(ch>=0 && ch<=9)
			else if(ch>='0' && ch<='9')
				numbers++; 
		}

		System.out.println("Total Number of upper case character are: " + uppercase);
		System.out.println("Total Number of lower case character are: " + lowercase);
		System.out.println("Total Number of Integeres are : " + numbers); 

	}

}

import java.util.Scanner;

public class Que23DataType 
{
	static boolean IntNum(String s) 
	{ 
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isDigit(s.charAt(i)) == false) 
			{
				return false; 
			}
		}
		return true;

	}
//	static boolean str(String s) 
//	{ 
//		for (int i = 0; i < s.length(); i++)
//		{
//			if (Character.isAlphabetic(s.charAt(i)) == false) 
//			{
//				return false; 
//			}
//		}
//		return true;
//
//	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = s.nextLine();
		if (IntNum(str)) 
		{
			System.out.println("Integer");
		}
		else if(Boolean.parseBoolean(str))
		{
			System.out.println("Boolean");
		}
		else
		{
			System.out.println("String");
		}

	}
}

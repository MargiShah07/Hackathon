import java.util.Scanner;

public class Que16Remove 
{
	public static String Remove(String str,char c)
	{
		if(str==null)
			return "";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length (); i++) 
		{
			char ch = str.charAt(i);
			if (ch==c)
			{
				continue;
			}
			sb.append(ch);
		}
		return sb.toString();
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st=s.nextLine();
		System.out.println("Enter Character that you want to remove: ");
		char ch = s.next().charAt(0);
		System.out.println (Remove (st,  ch));
	}

}
